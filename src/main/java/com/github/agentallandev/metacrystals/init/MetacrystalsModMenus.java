
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import com.github.agentallandev.metacrystals.world.inventory.Tier6WatchGUIMenu;
import com.github.agentallandev.metacrystals.world.inventory.Tier5WatchGUIMenu;
import com.github.agentallandev.metacrystals.world.inventory.Tier4WatchGUIMenu;
import com.github.agentallandev.metacrystals.world.inventory.Tier3WatchGUIMenu;
import com.github.agentallandev.metacrystals.world.inventory.Tier2WatchGUIMenu;
import com.github.agentallandev.metacrystals.world.inventory.Tier1WatchGUIMenu;
import com.github.agentallandev.metacrystals.world.inventory.CrystalInfuserMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetacrystalsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<Tier6WatchGUIMenu> TIER_6_WATCH_GUI = register("tier_6_watch_gui",
			(id, inv, extraData) -> new Tier6WatchGUIMenu(id, inv, extraData));
	public static final MenuType<Tier5WatchGUIMenu> TIER_5_WATCH_GUI = register("tier_5_watch_gui",
			(id, inv, extraData) -> new Tier5WatchGUIMenu(id, inv, extraData));
	public static final MenuType<Tier4WatchGUIMenu> TIER_4_WATCH_GUI = register("tier_4_watch_gui",
			(id, inv, extraData) -> new Tier4WatchGUIMenu(id, inv, extraData));
	public static final MenuType<Tier3WatchGUIMenu> TIER_3_WATCH_GUI = register("tier_3_watch_gui",
			(id, inv, extraData) -> new Tier3WatchGUIMenu(id, inv, extraData));
	public static final MenuType<Tier2WatchGUIMenu> TIER_2_WATCH_GUI = register("tier_2_watch_gui",
			(id, inv, extraData) -> new Tier2WatchGUIMenu(id, inv, extraData));
	public static final MenuType<Tier1WatchGUIMenu> TIER_1_WATCH_GUI = register("tier_1_watch_gui",
			(id, inv, extraData) -> new Tier1WatchGUIMenu(id, inv, extraData));
	public static final MenuType<CrystalInfuserMenu> CRYSTAL_INFUSER = register("crystal_infuser",
			(id, inv, extraData) -> new CrystalInfuserMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
