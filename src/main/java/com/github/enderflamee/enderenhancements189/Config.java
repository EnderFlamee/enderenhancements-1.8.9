package com.github.enderflamee.enderenhancements189;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.JVMAnnotationPropertyCollector;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;

public class Config extends Vigilant {
    public static Config INSTANCE = new Config();

    @Property(type = PropertyType.CHECKBOX,
            name = "Cancel Sword Block",
            description = "Cancel the sword block animation.",
            category = "Skyblock",
            subcategory = "General")
    public boolean CancelSwordBlock = false;

    public Config() {
        super(new File("./config/enderenhancements/config.toml"),"EnderEnhancements", new JVMAnnotationPropertyCollector());
        initialize();
    }

}
