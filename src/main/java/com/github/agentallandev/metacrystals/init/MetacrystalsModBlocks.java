
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.github.agentallandev.metacrystals.block.CrystalOreBlockBlock;
import com.github.agentallandev.metacrystals.MetacrystalsMod;

public class MetacrystalsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MetacrystalsMod.MODID);
	public static final RegistryObject<Block> CRYSTAL_ORE_BLOCK = REGISTRY.register("crystal_ore_block", () -> new CrystalOreBlockBlock());
}
