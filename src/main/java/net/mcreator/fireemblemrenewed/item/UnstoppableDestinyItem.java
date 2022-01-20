
package net.mcreator.fireemblemrenewed.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;
import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModSounds;

public class UnstoppableDestinyItem extends RecordItem {
	public UnstoppableDestinyItem() {
		super(0, FireEmblemRenewedModSounds.REGISTRY.get(new ResourceLocation("fire_emblem_renewed:unstoppable_destiny")),
				new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_ADDITIONAL_MUSIC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("unstoppable_destiny");
	}
}
