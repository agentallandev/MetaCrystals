
package com.github.agentallandev.metacrystals.item;

import com.github.agentallandev.metacrystals.procedures.AgilityCrystalItemInHandTickProcedure;
import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;

public class AgilityCrystalItem extends Item {
	public AgilityCrystalItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			AgilityCrystalItemInHandTickProcedure.execute(entity);
	}
}
