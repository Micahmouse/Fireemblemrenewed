
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

import java.util.List;

public class RagnellItem extends SwordItem {
	public RagnellItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_LEGENDARY_WEAPONS));
		setRegistryName("ragnell");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("One of the two swords blessed by the goddess Ashera for Altina"));
		list.add(new TextComponent("one of the Three Heroes. Later wielded by Ike"));
		list.add(new TextComponent("the Radiant Hero and his descendant"));
		list.add(new TextComponent("Priam."));
	}
}
