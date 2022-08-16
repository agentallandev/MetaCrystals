
package com.github.agentallandev.metacrystals.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import com.github.agentallandev.metacrystals.procedures.HasteCrystalItemInHandTickProcedure;
import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;

public class HasteCrystalItem extends Item {
	public HasteCrystalItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			HasteCrystalItemInHandTickProcedure.execute(entity);
	}
}
