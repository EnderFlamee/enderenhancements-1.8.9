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

    public static List<String> ExperimentOrder = new ArrayList<>();

    @SubscribeEvent
    public void OnTick(TickEvent.ClientTickEvent event) {
        if (EnderEnhancements.ConfigFile.AutoExperimentation) {
            if (PlayerData.IsInGUI() && PlayerData.getCurrentGUIName().contains("Chronomatron") && !PlayerData.getCurrentGUIName().contains("➜")) {
                if (PlayerData.checkInventorySlot(49).getItem() == Item.getItemFromBlock(Blocks.glowstone)) {
                    for (int i = 0; i < PlayerData.getCurrentGUI().getLowerChestInventory().getSizeInventory(); i++) {
                        ItemStack itemstack = PlayerData.checkInventorySlot(i);
                        if (itemstack.getItem() == Item.getItemFromBlock(Blocks.stained_glass)) {
                            if (!ExperimentOrder.contains(itemstack.getDisplayName())) {
                                ExperimentOrder.add(itemstack.getDisplayName());
                                System.out.println(ExperimentOrder);
//                            }
                            }
                        }
                    }
                }
            }
        }
    }
}
