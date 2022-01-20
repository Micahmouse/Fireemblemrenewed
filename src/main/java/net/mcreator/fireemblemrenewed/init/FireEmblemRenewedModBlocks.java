
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fireemblemrenewed.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.fireemblemrenewed.block.LightningcollectorBlock;
import net.mcreator.fireemblemrenewed.block.FireFlowerBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FireEmblemRenewedModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block FIRE_FLOWER = register(new FireFlowerBlock());
	public static final Block LIGHTNINGCOLLECTOR = register(new LightningcollectorBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FireFlowerBlock.registerRenderLayer();
		}
	}
}
