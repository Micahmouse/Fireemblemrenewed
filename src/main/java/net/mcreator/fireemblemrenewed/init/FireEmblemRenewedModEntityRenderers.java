
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fireemblemrenewed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.fireemblemrenewed.client.renderer.TheBlackKnightRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FireEmblemRenewedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FireEmblemRenewedModEntities.JAVELIN, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.THUNDER, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.METEOR, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.FIRE, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.ELFIRE, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.LIGHT, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.RAGNELL, ThrownItemRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.THE_BLACK_KNIGHT, TheBlackKnightRenderer::new);
		event.registerEntityRenderer(FireEmblemRenewedModEntities.ALONDITE, ThrownItemRenderer::new);
	}
}
