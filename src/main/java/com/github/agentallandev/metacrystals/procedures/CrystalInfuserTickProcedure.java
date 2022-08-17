package com.github.agentallandev.metacrystals.procedures;

import net.minecraft.world.entity.Entity;

public class CrystalInfuserTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		FuseCrystalProcedure.execute(entity);
		IsInfusionValidProcedure.execute(entity);
	}
}
