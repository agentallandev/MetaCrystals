package com.github.agentallandev.metacrystals.procedures;

public class AgilityCrystalItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 1, (true), (false)));
	}
}
