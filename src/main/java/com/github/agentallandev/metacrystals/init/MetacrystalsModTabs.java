
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MetacrystalsModTabs {
	public static CreativeModeTab TAB_CRYSTAL_CREATIVE_TAB;

	public static void load() {
		TAB_CRYSTAL_CREATIVE_TAB = new CreativeModeTab("tabcrystal_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MetacrystalsModItems.FIGHTING_CRYSTAL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
