
package com.github.agentallandev.metacrystals.item;

import com.github.agentallandev.metacrystals.procedures.AcrobaticsCrystalItemInHandTickProcedure;
import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;

public class AcrobaticsCrystalItem extends Item {
	public AcrobaticsCrystalItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			AcrobaticsCrystalItemInHandTickProcedure.execute(entity);
	}
}
