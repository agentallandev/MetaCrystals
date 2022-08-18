
package com.github.agentallandev.metacrystals.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.github.agentallandev.metacrystals.init.MetacrystalsModItems;

public class DwarfStarAlloySwordItem extends SwordItem {
	public DwarfStarAlloySwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MetacrystalsModItems.DWARF_STAR_ALLOY_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
