package com.github.agentallandev.metacrystals.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.concurrent.atomic.AtomicReference;

import com.github.agentallandev.metacrystals.network.MetacrystalsModVariables;
import com.github.agentallandev.metacrystals.init.MetacrystalsModItems;

public class Tier2WatchEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 2;
			entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WatchTier = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MetacrystalsModItems.TIER_2_WATCH
				.get()) {
			if (MetacrystalsModItems.HASTE_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem()) {
				HasteCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.AQUATIC_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem()) {
				AquaticCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.AGILITY_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem()) {
				AgilityCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.ACROBATICS_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem()) {
				AcrobaticsCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.FIGHTING_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem()) {
				FightingCrystalItemInHandTickProcedure.execute(entity);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem() == MetacrystalsModItems.TIER_2_WATCH.get()) {
			if (MetacrystalsModItems.HASTE_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem()) {
				HasteCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.AQUATIC_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem()) {
				AquaticCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.AGILITY_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem()) {
				AgilityCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.ACROBATICS_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem()) {
				AcrobaticsCrystalItemInHandTickProcedure.execute(entity);
			} else if (MetacrystalsModItems.FIGHTING_CRYSTAL.get() == (new Object() {
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
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem()) {
				FightingCrystalItemInHandTickProcedure.execute(entity);
			}
		} else {
			{
				double _setval = 1;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CrystalTypeActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
