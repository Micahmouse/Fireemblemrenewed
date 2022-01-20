
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fireemblemrenewed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fireemblemrenewed.item.WindelementItem;
import net.mcreator.fireemblemrenewed.item.UnstoppableDestinyItem;
import net.mcreator.fireemblemrenewed.item.ThunderelementItem;
import net.mcreator.fireemblemrenewed.item.ThunderItem;
import net.mcreator.fireemblemrenewed.item.SteelswordcrossguardItem;
import net.mcreator.fireemblemrenewed.item.SteelswordbladeItem;
import net.mcreator.fireemblemrenewed.item.SteelpowderItem;
import net.mcreator.fireemblemrenewed.item.SteelSwordItem;
import net.mcreator.fireemblemrenewed.item.SteelItem;
import net.mcreator.fireemblemrenewed.item.SteelAxeItem;
import net.mcreator.fireemblemrenewed.item.RagnellItem;
import net.mcreator.fireemblemrenewed.item.RagnellBladeItem;
import net.mcreator.fireemblemrenewed.item.MeteorItem;
import net.mcreator.fireemblemrenewed.item.LongswordbladeItem;
import net.mcreator.fireemblemrenewed.item.LightelementItem;
import net.mcreator.fireemblemrenewed.item.LightItem;
import net.mcreator.fireemblemrenewed.item.JavelinItem;
import net.mcreator.fireemblemrenewed.item.IronpowderItem;
import net.mcreator.fireemblemrenewed.item.IronSpearItem;
import net.mcreator.fireemblemrenewed.item.HiltItem;
import net.mcreator.fireemblemrenewed.item.HammerItem;
import net.mcreator.fireemblemrenewed.item.GoldCoinItem;
import net.mcreator.fireemblemrenewed.item.FireItem;
import net.mcreator.fireemblemrenewed.item.FireElementItem;
import net.mcreator.fireemblemrenewed.item.ElfireItem;
import net.mcreator.fireemblemrenewed.item.DoublesteelpowderItem;
import net.mcreator.fireemblemrenewed.item.DoublesteelItem;
import net.mcreator.fireemblemrenewed.item.DoubleironpowderItem;
import net.mcreator.fireemblemrenewed.item.DoublecoalpowderItem;
import net.mcreator.fireemblemrenewed.item.CoalpowderItem;
import net.mcreator.fireemblemrenewed.item.BlanktomeItem;
import net.mcreator.fireemblemrenewed.item.BlackKnightArmourItem;
import net.mcreator.fireemblemrenewed.item.AlonditeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FireEmblemRenewedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item STEEL = register(new SteelItem());
	public static final Item BLACK_KNIGHT_ARMOUR_HELMET = register(new BlackKnightArmourItem.Helmet());
	public static final Item BLACK_KNIGHT_ARMOUR_CHESTPLATE = register(new BlackKnightArmourItem.Chestplate());
	public static final Item BLACK_KNIGHT_ARMOUR_LEGGINGS = register(new BlackKnightArmourItem.Leggings());
	public static final Item BLACK_KNIGHT_ARMOUR_BOOTS = register(new BlackKnightArmourItem.Boots());
	public static final Item HAMMER = register(new HammerItem());
	public static final Item IRONPOWDER = register(new IronpowderItem());
	public static final Item DOUBLEIRONPOWDER = register(new DoubleironpowderItem());
	public static final Item DOUBLESTEEL = register(new DoublesteelItem());
	public static final Item COALPOWDER = register(new CoalpowderItem());
	public static final Item STEELPOWDER = register(new SteelpowderItem());
	public static final Item DOUBLECOALPOWDER = register(new DoublecoalpowderItem());
	public static final Item DOUBLESTEELPOWDER = register(new DoublesteelpowderItem());
	public static final Item UNSTOPPABLE_DESTINY = register(new UnstoppableDestinyItem());
	public static final Item STEEL_SWORD = register(new SteelSwordItem());
	public static final Item HILT = register(new HiltItem());
	public static final Item STEELSWORDBLADE = register(new SteelswordbladeItem());
	public static final Item STEELSWORDCROSSGUARD = register(new SteelswordcrossguardItem());
	public static final Item STEEL_AXE = register(new SteelAxeItem());
	public static final Item IRON_SPEAR = register(new IronSpearItem());
	public static final Item JAVELIN = register(new JavelinItem());
	public static final Item THUNDER = register(new ThunderItem());
	public static final Item METEOR = register(new MeteorItem());
	public static final Item GOLD_COIN = register(new GoldCoinItem());
	public static final Item LONGSWORDBLADE = register(new LongswordbladeItem());
	public static final Item RAGNELL_BLADE = register(new RagnellBladeItem());
	public static final Item FIRE_FLOWER = register(FireEmblemRenewedModBlocks.FIRE_FLOWER, FireEmblemRenewedModTabs.TAB_TOMES);
	public static final Item FIRE_ELEMENT = register(new FireElementItem());
	public static final Item FIRE = register(new FireItem());
	public static final Item THUNDERELEMENT = register(new ThunderelementItem());
	public static final Item LIGHTELEMENT = register(new LightelementItem());
	public static final Item WINDELEMENT = register(new WindelementItem());
	public static final Item BLANKTOME = register(new BlanktomeItem());
	public static final Item ELFIRE = register(new ElfireItem());
	public static final Item LIGHTNINGCOLLECTOR = register(FireEmblemRenewedModBlocks.LIGHTNINGCOLLECTOR, FireEmblemRenewedModTabs.TAB_TOMES);
	public static final Item LIGHT = register(new LightItem());
	public static final Item RAGNELL = register(new RagnellItem());
	public static final Item THE_BLACK_KNIGHT = register(
			new SpawnEggItem(FireEmblemRenewedModEntities.THE_BLACK_KNIGHT, -6750208, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("the_black_knight_spawn_egg"));
	public static final Item ALONDITE = register(new AlonditeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
