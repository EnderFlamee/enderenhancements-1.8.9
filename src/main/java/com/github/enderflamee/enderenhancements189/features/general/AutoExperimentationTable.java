package com.github.enderflamee.enderenhancements189.features.general;

import com.github.enderflamee.enderenhancements189.EnderEnhancements;
import com.github.enderflamee.enderenhancements189.PlayerData;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.List;

public class AutoExperimentationTable {

    private static List<Integer> ExperimentOrder;

    @SubscribeEvent
    public void OnTick(TickEvent.ClientTickEvent event) {
        if (EnderEnhancements.ConfigFile.AutoExperimentation) {
            if (PlayerData.IsInGUI() && PlayerData.getCurrentGUIName().contains("Chronomatron") && !PlayerData.getCurrentGUIName().contains("➜")) {
                //if ()
            //    ExperimentOrder.add()
            }
        }
    }
}
