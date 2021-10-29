package dev.longeh.automine.utils;

import net.minecraft.util.EnumChatFormatting;

public class C {

    public static String C(final String string) {
        return string.replaceAll("&0", EnumChatFormatting.BLACK.toString())
                .replaceAll("&1", EnumChatFormatting.DARK_BLUE.toString())
                .replaceAll("&2", EnumChatFormatting.DARK_GREEN.toString())
                .replaceAll("&3", EnumChatFormatting.DARK_AQUA.toString())
                .replaceAll("&4", EnumChatFormatting.DARK_RED.toString())
                .replaceAll("&5", EnumChatFormatting.DARK_PURPLE.toString())
                .replaceAll("&6", EnumChatFormatting.GOLD.toString())
                .replaceAll("&7", EnumChatFormatting.GRAY.toString())
                .replaceAll("&8", EnumChatFormatting.DARK_GRAY.toString())
                .replaceAll("&9", EnumChatFormatting.BLUE.toString())
                .replaceAll("&a", EnumChatFormatting.GREEN.toString())
                .replaceAll("&b", EnumChatFormatting.AQUA.toString())
                .replaceAll("&c", EnumChatFormatting.RED.toString())
                .replaceAll("&d", EnumChatFormatting.LIGHT_PURPLE.toString())
                .replaceAll("&e", EnumChatFormatting.YELLOW.toString())
                .replaceAll("&f", EnumChatFormatting.WHITE.toString())
                .replaceAll("&l", EnumChatFormatting.BOLD.toString())
                .replaceAll("&o", EnumChatFormatting.ITALIC.toString())
                .replaceAll("&k", EnumChatFormatting.OBFUSCATED.toString())
                .replaceAll("&r", EnumChatFormatting.RESET.toString())
                .replaceAll("&n", EnumChatFormatting.UNDERLINE.toString())
                .replaceAll("&m", EnumChatFormatting.STRIKETHROUGH.toString());
    }
}
