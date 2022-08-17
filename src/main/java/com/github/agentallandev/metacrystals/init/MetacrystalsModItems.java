
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

import com.github.agentallandev.metacrystals.item.Tier6WatchItem;
import com.github.agentallandev.metacrystals.item.PowerCrystalItem;
import com.github.agentallandev.metacrystals.item.MagicCrystalItem;
import com.github.agentallandev.metacrystals.item.HasteCrystalItem;
import com.github.agentallandev.metacrystals.item.FightingCrystalItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
