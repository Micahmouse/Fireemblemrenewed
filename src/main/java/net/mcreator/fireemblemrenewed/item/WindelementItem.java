
package net.mcreator.fireemblemrenewed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;

public class WindelementItem extends Item {
	public WindelementItem() {
		super(new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_TOMES).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("windelement");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
