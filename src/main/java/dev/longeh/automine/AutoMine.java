package dev.longeh.automine;

import dev.longeh.automine.commands.AutoMineCommand;
import dev.longeh.automine.listeners.AutoMineListener;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = AutoMine.MODID, version = AutoMine.VERSION)
public class AutoMine
{
    public static final String MODID = "AutoMine";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new AutoMineCommand());

        MinecraftForge.EVENT_BUS.register(new AutoMineListener());
    }
}
