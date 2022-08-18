
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.github.agentallandev.metacrystals.block.WatchAssemblyUnitBlock;
import com.github.agentallandev.metacrystals.block.DwarfStarAlloyBlockBlock;
import com.github.agentallandev.metacrystals.block.CrystalOreBlockBlock;
import com.github.agentallandev.metacrystals.block.CrystalInfuserBlockBlock;
import com.github.agentallandev.metacrystals.MetacrystalsMod;

public class MetacrystalsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MetacrystalsMod.MODID);
	public static final RegistryObject<Block> CRYSTAL_ORE_BLOCK = REGISTRY.register("crystal_ore_block", () -> new CrystalOreBlockBlock());
	public static final RegistryObject<Block> CRYSTAL_INFUSER_BLOCK = REGISTRY.register("crystal_infuser_block",
			() -> new CrystalInfuserBlockBlock());
	public static final RegistryObject<Block> DWARF_STAR_ALLOY_BLOCK = REGISTRY.register("dwarf_star_alloy_block",
			() -> new DwarfStarAlloyBlockBlock());
	public static final RegistryObject<Block> WATCH_ASSEMBLY_UNIT = REGISTRY.register("watch_assembly_unit", () -> new WatchAssemblyUnitBlock());
}
