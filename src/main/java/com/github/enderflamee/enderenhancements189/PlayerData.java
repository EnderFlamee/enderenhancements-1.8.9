package com.github.enderflamee.enderenhancements189;

import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.Slot;
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
            ((ContainerChest) EnderEnhancements.mc.thePlayer.openContainer).toString();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static ContainerChest getCurrentGUI() {
            return ((ContainerChest) EnderEnhancements.mc.thePlayer.openContainer);
    }

    public static ItemStack getInventoryItemStack(int slot) {
        if (getCurrentGUI().inventorySlots.get(slot).getHasStack()) {
            return getCurrentGUI().inventorySlots.get(slot).getStack();
        }
            return new ItemStack(Items.banner,0);
    }

    public static Slot getInventorySlot(int slot) {
        return getCurrentGUI().inventorySlots.get(slot);
    }

    public static String getCurrentGUIName() {
        if (IsInGUI()) {
            return ((ContainerChest) EnderEnhancements.mc.thePlayer.openContainer).getLowerChestInventory().getDisplayName().getUnformattedText();
        }
        return "";
    }
}

