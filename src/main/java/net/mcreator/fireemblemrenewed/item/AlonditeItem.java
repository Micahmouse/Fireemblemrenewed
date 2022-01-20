
package net.mcreator.fireemblemrenewed.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;
import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModItems;

import java.util.List;

public class AlonditeItem extends SwordItem {
	public AlonditeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
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
				return Ingredient.of(new ItemStack(FireEmblemRenewedModItems.DOUBLESTEEL));
			}
		}, 3, -3f, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_LEGENDARY_WEAPONS));
		setRegistryName("alondite");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("One of the two swords blessed by the goddess Ashera for Altina"));
		list.add(new TextComponent("one of the Three Heroes. Later wielded by the Black Knight"));
		list.add(new TextComponent("Rider of Daein"));
		list.add(new TextComponent("and General Zelgius of Begnion."));
	}
}
