package net.mcreator.fireemblemrenewed.procedures;

import net.minecraft.world.entity.Entity;

public class FiremagicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(30);
	}
}
