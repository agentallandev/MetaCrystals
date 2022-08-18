
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.github.agentallandev.metacrystals.client.gui.WatchAssemblyUnitGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.Tier6WatchGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.Tier5WatchGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.Tier4WatchGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.Tier3WatchGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.Tier2WatchGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.Tier1WatchGUIScreen;
import com.github.agentallandev.metacrystals.client.gui.CrystalInfuserScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MetacrystalsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MetacrystalsModMenus.TIER_6_WATCH_GUI, Tier6WatchGUIScreen::new);
			MenuScreens.register(MetacrystalsModMenus.TIER_5_WATCH_GUI, Tier5WatchGUIScreen::new);
			MenuScreens.register(MetacrystalsModMenus.TIER_4_WATCH_GUI, Tier4WatchGUIScreen::new);
			MenuScreens.register(MetacrystalsModMenus.TIER_3_WATCH_GUI, Tier3WatchGUIScreen::new);
			MenuScreens.register(MetacrystalsModMenus.TIER_2_WATCH_GUI, Tier2WatchGUIScreen::new);
			MenuScreens.register(MetacrystalsModMenus.TIER_1_WATCH_GUI, Tier1WatchGUIScreen::new);
			MenuScreens.register(MetacrystalsModMenus.CRYSTAL_INFUSER, CrystalInfuserScreen::new);
			MenuScreens.register(MetacrystalsModMenus.WATCH_ASSEMBLY_UNIT_GUI, WatchAssemblyUnitGUIScreen::new);
		});
	}
}
