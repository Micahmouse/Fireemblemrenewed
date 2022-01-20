
package net.mcreator.fireemblemrenewed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;

public class SteelItem extends Item {
	public SteelItem() {
		super(new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_SPECIALWEAPONITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("steel");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
