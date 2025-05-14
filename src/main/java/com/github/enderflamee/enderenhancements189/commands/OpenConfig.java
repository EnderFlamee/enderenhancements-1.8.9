package com.github.enderflamee.enderenhancements189.commands;

import com.github.enderflamee.enderenhancements189.EnderEnhancements;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OpenConfig extends CommandBase {
    @Override
    public String getCommandName() {
        return "ee";
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "";
    }

    @Override
    public List<String> getCommandAliases() {
        return new ArrayList<>(Arrays.asList("enderenhancements","ender"));
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        EnderEnhancements.display = EnderEnhancements.ConfigFile.gui();
    }
}
