package dev.longeh.automine.commands;

import dev.longeh.automine.utils.C;
import dev.longeh.automine.config.Config;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class AutoMineCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "automine";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/automine";
    }

    @Override
    public List<String> getCommandAliases() {
        return new ArrayList<String>();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(Config.getInstance().isAutoMineEnabled()) {
            Config.getInstance().setAutoMineEnabled(false);
            sender.addChatMessage(new ChatComponentText(C.C("&4&lAuto Mine &8- &fAuto Miner has now been &c&ndisabled&r.")));
            return;
        }
        Config.getInstance().setAutoMineEnabled(true);
        sender.addChatMessage(new ChatComponentText(C.C("&4&lAuto Mine &8- &fAuto Miner has now been &a&nenabled&r.")));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
