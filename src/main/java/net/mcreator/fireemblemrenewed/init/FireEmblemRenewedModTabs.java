
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fireemblemrenewed.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FireEmblemRenewedModTabs {
	public static CreativeModeTab TAB_LEGENDARY_WEAPONS;
	public static CreativeModeTab TAB_ADDITIONAL_MUSIC;
	public static CreativeModeTab TAB_TOMES;
	public static CreativeModeTab TAB_SPECIALWEAPONITEMS;

	public static void load() {
		TAB_LEGENDARY_WEAPONS = new CreativeModeTab("tablegendary_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.NETHERITE_SWORD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ADDITIONAL_MUSIC = new CreativeModeTab("tabadditional_music") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.MUSIC_DISC_STAL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOMES = new CreativeModeTab("tabtomes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FireEmblemRenewedModItems.THUNDER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SPECIALWEAPONITEMS = new CreativeModeTab("tabspecialweaponitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FireEmblemRenewedModItems.DOUBLESTEEL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
