
package net.mcreator.fireemblemrenewed.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;
import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModItems;

public class SteelAxeItem extends AxeItem {
	public SteelAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FireEmblemRenewedModItems.STEEL));
			}
		}, 1, -3.3f, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_SPECIALWEAPONITEMS));
		setRegistryName("steel_axe");
	}
}
