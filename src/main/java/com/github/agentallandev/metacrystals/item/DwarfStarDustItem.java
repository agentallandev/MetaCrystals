
package com.github.agentallandev.metacrystals.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class DwarfStarDustItem extends Item {

	public DwarfStarDustItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

}
