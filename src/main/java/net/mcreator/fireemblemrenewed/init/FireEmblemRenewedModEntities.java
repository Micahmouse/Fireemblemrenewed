
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fireemblemrenewed.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fireemblemrenewed.entity.ThunderEntity;
import net.mcreator.fireemblemrenewed.entity.TheBlackKnightEntity;
import net.mcreator.fireemblemrenewed.entity.RagnellEntity;
import net.mcreator.fireemblemrenewed.entity.MeteorEntity;
import net.mcreator.fireemblemrenewed.entity.LightEntity;
import net.mcreator.fireemblemrenewed.entity.JavelinEntity;
import net.mcreator.fireemblemrenewed.entity.FireEntity;
import net.mcreator.fireemblemrenewed.entity.ElfireEntity;
import net.mcreator.fireemblemrenewed.entity.AlonditeEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FireEmblemRenewedModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<JavelinEntity> JAVELIN = register("entitybulletjavelin",
			EntityType.Builder.<JavelinEntity>of(JavelinEntity::new, MobCategory.MISC).setCustomClientFactory(JavelinEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ThunderEntity> THUNDER = register("entitybulletthunder",
			EntityType.Builder.<ThunderEntity>of(ThunderEntity::new, MobCategory.MISC).setCustomClientFactory(ThunderEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MeteorEntity> METEOR = register("entitybulletmeteor",
			EntityType.Builder.<MeteorEntity>of(MeteorEntity::new, MobCategory.MISC).setCustomClientFactory(MeteorEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<FireEntity> FIRE = register("entitybulletfire",
			EntityType.Builder.<FireEntity>of(FireEntity::new, MobCategory.MISC).setCustomClientFactory(FireEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ElfireEntity> ELFIRE = register("entitybulletelfire",
			EntityType.Builder.<ElfireEntity>of(ElfireEntity::new, MobCategory.MISC).setCustomClientFactory(ElfireEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<LightEntity> LIGHT = register("entitybulletlight",
			EntityType.Builder.<LightEntity>of(LightEntity::new, MobCategory.MISC).setCustomClientFactory(LightEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RagnellEntity> RAGNELL = register("entitybulletragnell",
			EntityType.Builder.<RagnellEntity>of(RagnellEntity::new, MobCategory.MISC).setCustomClientFactory(RagnellEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TheBlackKnightEntity> THE_BLACK_KNIGHT = register("the_black_knight",
			EntityType.Builder.<TheBlackKnightEntity>of(TheBlackKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(104).setUpdateInterval(3).setCustomClientFactory(TheBlackKnightEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<AlonditeEntity> ALONDITE = register("entitybulletalondite",
			EntityType.Builder.<AlonditeEntity>of(AlonditeEntity::new, MobCategory.MISC).setCustomClientFactory(AlonditeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheBlackKnightEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THE_BLACK_KNIGHT, TheBlackKnightEntity.createAttributes().build());
	}
}
