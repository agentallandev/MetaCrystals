
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.github.agentallandev.metacrystals.block.entity.WatchAssemblyUnitBlockEntity;
import com.github.agentallandev.metacrystals.block.entity.CrystalInfuserBlockBlockEntity;
import com.github.agentallandev.metacrystals.MetacrystalsMod;

public class MetacrystalsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			MetacrystalsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CRYSTAL_INFUSER_BLOCK = register("crystal_infuser_block",
			MetacrystalsModBlocks.CRYSTAL_INFUSER_BLOCK, CrystalInfuserBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WATCH_ASSEMBLY_UNIT = register("watch_assembly_unit",
			MetacrystalsModBlocks.WATCH_ASSEMBLY_UNIT, WatchAssemblyUnitBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
