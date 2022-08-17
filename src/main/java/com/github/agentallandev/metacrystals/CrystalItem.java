/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside com.github.agentallandev.metacrystals as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package com.github.agentallandev.metacrystals;

import net.minecraft.world.item.Item;
import com.mojang.authlib.Environment;
import javax.annotation.Nullable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import java.util.List;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import com.github.agentallandev.metacrystals.init.MetacrystalsModTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;


public class CrystalItem extends Item{
	public CrystalItem() {
		super(new Item.Properties().tab(MetacrystalsModTabs.TAB_CRYSTAL_CREATIVE_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flag) {
		if(stack.getOrCreateTag().getInt("tier") == 0)
		{
			stack.getOrCreateTag().putInt("tier", 1);
		}
		super.appendHoverText(stack, level, list, flag);
		list.add(new TextComponent("Tier " + stack.getOrCreateTag().getInt("tier") + " Crystal"));
   }

}