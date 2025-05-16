package com.github.enderflamee.enderenhancements189.features.general;

import com.github.enderflamee.enderenhancements189.EnderEnhancements;
import com.github.enderflamee.enderenhancements189.PlayerData;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AutoExperimentationTable {

    public static List<Integer> ExperimentOrder = new ArrayList<>();
    public static boolean IsReadyForNextPattern = true;


    @SubscribeEvent
    public void OnTick(TickEvent.ClientTickEvent event) {
        if (EnderEnhancements.ConfigFile.AutoExperimentation) {
            if (PlayerData.IsInGUI() && PlayerData.getCurrentGUIName().contains("Chronomatron") && !PlayerData.getCurrentGUIName().contains("➜")) {
                if (PlayerData.getInventoryItemStack(49).getItem() == Item.getItemFromBlock(Blocks.glowstone)) {
                    for (int i = 0; i < PlayerData.getCurrentGUI().getLowerChestInventory().getSizeInventory(); i++) {
                        ItemStack itemstack = PlayerData.getInventoryItemStack(i);
                        if (itemstack.getItem() == Item.getItemFromBlock(Blocks.stained_hardened_clay)) {
                            if (IsReadyForNextPattern) {
                                ExperimentOrder.add(i);
                                System.out.println(ExperimentOrder);
                                IsReadyForNextPattern = false;
                                return;
                            }
                        }
                        if (itemstack.getItem() == Item.getItemFromBlock(Blocks.stained_glass)) {
                            if (!IsReadyForNextPattern) {
                                if (!ExperimentOrder.isEmpty() && ExperimentOrder.get(ExperimentOrder.size() - 1) == i) {
                                    IsReadyForNextPattern = true;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
