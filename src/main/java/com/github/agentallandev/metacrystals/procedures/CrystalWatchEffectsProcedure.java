package com.github.agentallandev.metacrystals.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import java.util.concurrent.atomic.AtomicReference;

import com.github.agentallandev.metacrystals.network.MetacrystalsModVariables;
import com.github.agentallandev.metacrystals.init.MetacrystalsModItems;

public class CrystalWatchEffectsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive > (entity
						.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MetacrystalsModVariables.PlayerVariables())).WatchTier) {
			{
				double _setval = (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MetacrystalsModVariables.PlayerVariables())).WatchTier;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CrystalTypeActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (MetacrystalsModItems.HASTE_CRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive, itemstack)).getItem()) {
			HasteCrystalItemInHandTickProcedure.execute(entity);
		} else if (MetacrystalsModItems.AQUATIC_CRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive, itemstack)).getItem()) {
			AquaticCrystalItemInHandTickProcedure.execute(entity);
		} else if (MetacrystalsModItems.AGILITY_CRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive, itemstack)).getItem()) {
			AgilityCrystalItemInHandTickProcedure.execute(entity);
		} else if (MetacrystalsModItems.ACROBATICS_CRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive, itemstack)).getItem()) {
			AcrobaticsCrystalItemInHandTickProcedure.execute(entity);
		} else if (MetacrystalsModItems.FIGHTING_CRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MetacrystalsModVariables.PlayerVariables())).CrystalTypeActive, itemstack)).getItem()) {
			FightingCrystalItemInHandTickProcedure.execute(entity);
		}
	}
}
