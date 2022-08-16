
package com.github.agentallandev.metacrystals.item;

import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;

public class PowerCrystalItem extends Item {
	public PowerCrystalItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
