
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.agentallandev.metacrystals.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import com.github.agentallandev.metacrystals.network.CrystalCycleUpMessage;
import com.github.agentallandev.metacrystals.network.CrystalCycleDownMessage;
import com.github.agentallandev.metacrystals.MetacrystalsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MetacrystalsModKeyMappings {
	public static final KeyMapping CRYSTAL_CYCLE_UP = new KeyMapping("key.metacrystals.crystal_cycle_up", GLFW.GLFW_KEY_INSERT,
			"key.categories.metacrystals");
	public static final KeyMapping CRYSTAL_CYCLE_DOWN = new KeyMapping("key.metacrystals.crystal_cycle_down", GLFW.GLFW_KEY_DELETE,
			"key.categories.metacrystals");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(CRYSTAL_CYCLE_UP);
		ClientRegistry.registerKeyBinding(CRYSTAL_CYCLE_DOWN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == CRYSTAL_CYCLE_UP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MetacrystalsMod.PACKET_HANDLER.sendToServer(new CrystalCycleUpMessage(0, 0));
						CrystalCycleUpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == CRYSTAL_CYCLE_DOWN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MetacrystalsMod.PACKET_HANDLER.sendToServer(new CrystalCycleDownMessage(0, 0));
						CrystalCycleDownMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
