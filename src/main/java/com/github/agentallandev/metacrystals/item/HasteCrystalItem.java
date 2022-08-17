
package com.github.agentallandev.metacrystals.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import com.github.agentallandev.metacrystals.procedures.HasteCrystalItemInHandTickProcedure;
import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;
import com.github.agentallandev.metacrystals.CrystalItem;

public class HasteCrystalItem extends CrystalItem {
	public HasteCrystalItem() {
		super();
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			HasteCrystalItemInHandTickProcedure.execute(entity);
	}
}
