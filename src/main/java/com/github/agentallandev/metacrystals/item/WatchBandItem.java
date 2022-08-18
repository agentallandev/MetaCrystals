
package com.github.agentallandev.metacrystals.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class WatchBandItem extends Item {

	public WatchBandItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

}
