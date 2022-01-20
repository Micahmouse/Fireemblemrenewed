package net.mcreator.fireemblemrenewed.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.fireemblemrenewed.entity.TheBlackKnightEntity;

public class BlackKnightDamagedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TheBlackKnightEntity) {
			entity.hurt(DamageSource.GENERIC, 5);
		}
	}
}
