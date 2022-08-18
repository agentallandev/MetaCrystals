
package com.github.agentallandev.metacrystals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;

public class WatchBandItem extends Item {
	public WatchBandItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
