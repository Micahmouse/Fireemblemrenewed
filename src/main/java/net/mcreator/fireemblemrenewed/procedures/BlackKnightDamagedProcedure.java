package net.mcreator.fireemblemrenewed.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModItems;

public class BlackKnightDamagedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (FireEmblemRenewedModItems.RAGNELL == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			entity.hurt(DamageSource.GENERIC, 5);
		}
	}
}
