package com.github.agentallandev.metacrystals.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import com.github.agentallandev.metacrystals.network.MetacrystalsModVariables;
import com.github.agentallandev.metacrystals.init.MetacrystalsModItems;

public class WatchInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == MetacrystalsModItems.TIER_5_WATCH.get()) {
			{
				double _setval = 6;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WatchTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == MetacrystalsModItems.TIER_5_WATCH.get()) {
			{
				double _setval = 5;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WatchTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == MetacrystalsModItems.TIER_4_WATCH.get()) {
			{
				double _setval = 4;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WatchTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == MetacrystalsModItems.TIER_3_WATCH.get()) {
			{
				double _setval = 3;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WatchTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (itemstack.getItem() == MetacrystalsModItems.TIER_2_WATCH.get()) {
			{
				double _setval = 2;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WatchTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 1;
				entity.getCapability(MetacrystalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WatchTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		CrystalWatchEffectsProcedure.execute(entity, itemstack);
	}
}
