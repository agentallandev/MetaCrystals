
package com.github.agentallandev.metacrystals.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import com.github.agentallandev.metacrystals.world.inventory.Tier6WatchGUIMenu;
import com.github.agentallandev.metacrystals.procedures.IsValidCrystalItemProcedure;
import com.github.agentallandev.metacrystals.MetacrystalsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Tier6WatchGUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public Tier6WatchGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public Tier6WatchGUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(Tier6WatchGUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(Tier6WatchGUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = Tier6WatchGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 1 && changeType == 0) {

			IsValidCrystalItemProcedure.execute(entity);
		}
		if (slotID == 2 && changeType == 0) {

			IsValidCrystalItemProcedure.execute(entity);
		}
		if (slotID == 3 && changeType == 0) {

			IsValidCrystalItemProcedure.execute(entity);
		}
		if (slotID == 4 && changeType == 0) {

			IsValidCrystalItemProcedure.execute(entity);
		}
		if (slotID == 5 && changeType == 0) {

			IsValidCrystalItemProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MetacrystalsMod.addNetworkMessage(Tier6WatchGUISlotMessage.class, Tier6WatchGUISlotMessage::buffer, Tier6WatchGUISlotMessage::new,
				Tier6WatchGUISlotMessage::handler);
	}
}
