
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.github.agentallandev.metacrystals.item.WatchCore6Item;
import com.github.agentallandev.metacrystals.item.WatchCore5Item;
import com.github.agentallandev.metacrystals.item.WatchCore4Item;
import com.github.agentallandev.metacrystals.item.WatchCore3Item;
import com.github.agentallandev.metacrystals.item.WatchCore2Item;
import com.github.agentallandev.metacrystals.item.WatchCore1Item;
import com.github.agentallandev.metacrystals.item.WatchBuckleItem;
import com.github.agentallandev.metacrystals.item.WatchBandItem;
import com.github.agentallandev.metacrystals.item.Tier6WatchItem;
import com.github.agentallandev.metacrystals.item.Tier5WatchItem;
import com.github.agentallandev.metacrystals.item.Tier4WatchItem;
import com.github.agentallandev.metacrystals.item.Tier3WatchItem;
import com.github.agentallandev.metacrystals.item.Tier2WatchItem;
import com.github.agentallandev.metacrystals.item.Tier1WatchItem;
import com.github.agentallandev.metacrystals.item.PowerCrystalItem;
import com.github.agentallandev.metacrystals.item.MagicCrystalItem;
import com.github.agentallandev.metacrystals.item.HasteCrystalItem;
import com.github.agentallandev.metacrystals.item.FightingCrystalItem;
import com.github.agentallandev.metacrystals.item.DwarfStarDustItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloySwordItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloyShovelItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloyPickaxeItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloyIngotItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloyHoeItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloyAxeItem;
import com.github.agentallandev.metacrystals.item.DwarfStarAlloyArmorItem;
import com.github.agentallandev.metacrystals.item.AquaticCrystalItem;
import com.github.agentallandev.metacrystals.item.AgilityCrystalItem;
import com.github.agentallandev.metacrystals.item.AcrobaticsCrystalItem;
import com.github.agentallandev.metacrystals.MetacrystalsMod;

public class MetacrystalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MetacrystalsMod.MODID);
	public static final RegistryObject<Item> CRYSTAL_ORE_BLOCK = block(MetacrystalsModBlocks.CRYSTAL_ORE_BLOCK,
			MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB);
	public static final RegistryObject<Item> MAGIC_CRYSTAL = REGISTRY.register("magic_crystal", () -> new MagicCrystalItem());
	public static final RegistryObject<Item> FIGHTING_CRYSTAL = REGISTRY.register("fighting_crystal", () -> new FightingCrystalItem());
	public static final RegistryObject<Item> HASTE_CRYSTAL = REGISTRY.register("haste_crystal", () -> new HasteCrystalItem());
	public static final RegistryObject<Item> ACROBATICS_CRYSTAL = REGISTRY.register("acrobatics_crystal", () -> new AcrobaticsCrystalItem());
	public static final RegistryObject<Item> AQUATIC_CRYSTAL = REGISTRY.register("aquatic_crystal", () -> new AquaticCrystalItem());
	public static final RegistryObject<Item> AGILITY_CRYSTAL = REGISTRY.register("agility_crystal", () -> new AgilityCrystalItem());
	public static final RegistryObject<Item> POWER_CRYSTAL = REGISTRY.register("power_crystal", () -> new PowerCrystalItem());
	public static final RegistryObject<Item> TIER_6_WATCH = REGISTRY.register("tier_6_watch", () -> new Tier6WatchItem());
	public static final RegistryObject<Item> TIER_5_WATCH = REGISTRY.register("tier_5_watch", () -> new Tier5WatchItem());
	public static final RegistryObject<Item> TIER_4_WATCH = REGISTRY.register("tier_4_watch", () -> new Tier4WatchItem());
	public static final RegistryObject<Item> TIER_3_WATCH = REGISTRY.register("tier_3_watch", () -> new Tier3WatchItem());
	public static final RegistryObject<Item> TIER_2_WATCH = REGISTRY.register("tier_2_watch", () -> new Tier2WatchItem());
	public static final RegistryObject<Item> TIER_1_WATCH = REGISTRY.register("tier_1_watch", () -> new Tier1WatchItem());
	public static final RegistryObject<Item> CRYSTAL_INFUSER_BLOCK = block(MetacrystalsModBlocks.CRYSTAL_INFUSER_BLOCK,
			MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB);
	public static final RegistryObject<Item> WATCH_BAND = REGISTRY.register("watch_band", () -> new WatchBandItem());
	public static final RegistryObject<Item> WATCH_BUCKLE = REGISTRY.register("watch_buckle", () -> new WatchBuckleItem());
	public static final RegistryObject<Item> WATCH_CORE_1 = REGISTRY.register("watch_core_1", () -> new WatchCore1Item());
	public static final RegistryObject<Item> WATCH_CORE_2 = REGISTRY.register("watch_core_2", () -> new WatchCore2Item());
	public static final RegistryObject<Item> WATCH_CORE_3 = REGISTRY.register("watch_core_3", () -> new WatchCore3Item());
	public static final RegistryObject<Item> WATCH_CORE_4 = REGISTRY.register("watch_core_4", () -> new WatchCore4Item());
	public static final RegistryObject<Item> WATCH_CORE_5 = REGISTRY.register("watch_core_5", () -> new WatchCore5Item());
	public static final RegistryObject<Item> WATCH_CORE_6 = REGISTRY.register("watch_core_6", () -> new WatchCore6Item());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_INGOT = REGISTRY.register("dwarf_star_alloy_ingot",
			() -> new DwarfStarAlloyIngotItem());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_BLOCK = block(MetacrystalsModBlocks.DWARF_STAR_ALLOY_BLOCK,
			MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB);
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_PICKAXE = REGISTRY.register("dwarf_star_alloy_pickaxe",
			() -> new DwarfStarAlloyPickaxeItem());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_AXE = REGISTRY.register("dwarf_star_alloy_axe", () -> new DwarfStarAlloyAxeItem());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_SWORD = REGISTRY.register("dwarf_star_alloy_sword",
			() -> new DwarfStarAlloySwordItem());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_SHOVEL = REGISTRY.register("dwarf_star_alloy_shovel",
			() -> new DwarfStarAlloyShovelItem());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_HOE = REGISTRY.register("dwarf_star_alloy_hoe", () -> new DwarfStarAlloyHoeItem());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_ARMOR_HELMET = REGISTRY.register("dwarf_star_alloy_armor_helmet",
			() -> new DwarfStarAlloyArmorItem.Helmet());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_ARMOR_CHESTPLATE = REGISTRY.register("dwarf_star_alloy_armor_chestplate",
			() -> new DwarfStarAlloyArmorItem.Chestplate());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_ARMOR_LEGGINGS = REGISTRY.register("dwarf_star_alloy_armor_leggings",
			() -> new DwarfStarAlloyArmorItem.Leggings());
	public static final RegistryObject<Item> DWARF_STAR_ALLOY_ARMOR_BOOTS = REGISTRY.register("dwarf_star_alloy_armor_boots",
			() -> new DwarfStarAlloyArmorItem.Boots());
	public static final RegistryObject<Item> DWARF_STAR_DUST = REGISTRY.register("dwarf_star_dust", () -> new DwarfStarDustItem());
	public static final RegistryObject<Item> WATCH_ASSEMBLY_UNIT = block(MetacrystalsModBlocks.WATCH_ASSEMBLY_UNIT,
			MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
