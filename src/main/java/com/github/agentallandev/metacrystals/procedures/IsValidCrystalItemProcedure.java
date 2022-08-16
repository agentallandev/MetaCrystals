package com.github.agentallandev.metacrystals.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

import com.github.agentallandev.metacrystals.network.MetacrystalsModVariables;

public class IsValidCrystalItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1;
			entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WorkingSlot = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		while ((entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).WorkingSlot <= 5) {
			if (!((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(
					(int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).WorkingSlot,
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)))
					.is(ItemTags.create(new ResourceLocation("metacrystals:crystal"))))) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(
							(int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MetacrystalsModVariables.PlayerVariables())).WorkingSlot,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get((int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).WorkingSlot)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
			}
			{
				double _setval = (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MetacrystalsModVariables.PlayerVariables())).WorkingSlot + 1;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WorkingSlot = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
