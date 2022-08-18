package com.github.agentallandev.metacrystals.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

import com.github.agentallandev.metacrystals.network.MetacrystalsModVariables;

public class CrystalCycleUpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("metacrystals:crystal_watch")))) {
			if ((entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive == 5
					|| (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive == (entity
									.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MetacrystalsModVariables.PlayerVariables())).WatchTier) {
				{
					double _setval = 1;
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive + 1;
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(
					(int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive,
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem() == Blocks.AIR.asItem()) {
				{
					String _setval = "Empty Slot";
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeName = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = (new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(
							(int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getDisplayName().getString();
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeName = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("metacrystals:crystal_watch")))) {
			if ((entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive == 5
					|| (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive == (entity
									.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MetacrystalsModVariables.PlayerVariables())).WatchTier) {
				{
					double _setval = 1;
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive + 1;
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(
					(int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive,
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem() == Blocks.AIR.asItem()) {
				{
					String _setval = "Empty Slot";
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeName = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = (new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(
							(int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getDisplayName().getString();
					entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CrystalTypeName = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
