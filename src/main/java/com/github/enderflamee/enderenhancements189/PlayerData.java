package com.github.enderflamee.enderenhancements189;

import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Objects;

public class PlayerData {
    private String SkyblockLocation;
    private String SkyblockIsland;

    public String getCurrentLocation() {
        return SkyblockLocation;
    }
    public String getCurrentIsland() {
        return SkyblockIsland;
    }

    public static boolean CheckGUIName(String str) {
        return Objects.equals(getCurrentGUIName(), str);
    }

    public static boolean IsInGUI() {
        try {
             EnderEnhancements.mc.thePlayer.openContainer.toString();
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static ContainerChest getCurrentGUI() {
        if (EnderEnhancements.mc.thePlayer.openContainer instanceof ContainerChest) {
            return ((ContainerChest) EnderEnhancements.mc.thePlayer.openContainer);
        }
        throw new NullPointerException();
    }

    public static ItemStack checkInventorySlot(int slot) {
     //   if ()
        return null;
    }

    public static String getCurrentGUIName() {
        if (EnderEnhancements.mc.thePlayer.openContainer instanceof ContainerChest) {
            return ((ContainerChest) EnderEnhancements.mc.thePlayer.openContainer).getLowerChestInventory().getDisplayName().getUnformattedText();
        }
        throw new NullPointerException();
    }
}

