package net.mcreator.fireemblemrenewed.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

public class BlackKnightnotdamagedProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().broadcastMessage(new TextComponent("Do you want to die?"), ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
