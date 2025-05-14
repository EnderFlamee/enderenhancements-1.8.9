package com.github.enderflamee.enderenhancements189;

import com.github.enderflamee.enderenhancements189.commands.OpenConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid = "enderenhancements", useMetadata=true)
public class EnderEnhancements {

    public static final Minecraft mc = Minecraft.getMinecraft();
    public static Config ConfigFile = Config.INSTANCE;
    public static GuiScreen display = null;
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        ClientCommandHandler.instance.registerCommand(new OpenConfig());
        ConfigFile.initialize();
        System.out.println("D*-*irt: " + Blocks.dirt.getUnlocalizedName());
		// Below is a demonstration of an access-transformed class access.
        System.out.println("Color State: " + new GlStateManager.Color());
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        if (display != null) {
            mc.displayGuiScreen(display);
            display = null;
        }
    }
}

// add a config

// add no block animation