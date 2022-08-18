package com.github.agentallandev.metacrystals.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

import com.github.agentallandev.metacrystals.network.MetacrystalsModVariables;

public class IsFusionReadyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Item0Tier = 0;
		double Item1Tier = 0;
		if (IsInfusionValidProcedure.execute(world, x, y, z)) {
			Item0Tier = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("tier");
			Item1Tier = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("tier");
			MetacrystalsModVariables.WorldVariables.get(world).CrystalInfuserTempTier = Item0Tier + Item1Tier;
			MetacrystalsModVariables.WorldVariables.get(world).syncData(world);
			if (MetacrystalsModVariables.WorldVariables.get(world).CrystalInfuserTempTier > 10) {
				MetacrystalsModVariables.WorldVariables.get(world).CrystalInfuserTempTier = 10;
				MetacrystalsModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
