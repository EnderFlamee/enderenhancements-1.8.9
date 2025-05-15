package com.github.enderflamee.enderenhancements189;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.JVMAnnotationPropertyCollector;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;

public class Config extends Vigilant {
    public static Config INSTANCE = new Config();

    @Property(
            type = PropertyType.SWITCH,
            name = "Cancel Sword Block",
            description = "Cancel the sword block animation.",
            category = "General",
            subcategory = "Visual"
    )
    public boolean CancelSwordBlock = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Auto Experimentation Table",
            description = "Automatically completes the experimentation table.",
            category = "Solvers",
            subcategory = "Enchanting"
    )
    public boolean AutoExperimentation = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Auto Bonzo Mask (Cheat)",
            description = "Automatically equips bonzo mask at low health without opening the inventory.",
            category = "Dungeons",
            subcategory = "Auto Items"
    )
    public boolean AutoBonzoMaskCheat = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Auto Bonzo Mask (Legit)",
            description = "Automatically equips bonzo mask at low health with opening the inventory.",
            category = "Dungeons",
            subcategory = "Auto Items"
    )
    public boolean AutoBonzoMaskLegit = false;

    @Property(
            type = PropertyType.PERCENT_SLIDER,
            name = "Auto Bonzo Health Amount",
            description = "At what health you want the bonzo mask to trigger.",
            category = "Dungeons",
            subcategory = "Auto Items"
    )
    public float AutoBonzoHealthAmount = 0.15f;

    public Config() {
        super(new File("./config/enderenhancements/config.toml"),"EnderEnhancements", new JVMAnnotationPropertyCollector());
        initialize();
    }

}
