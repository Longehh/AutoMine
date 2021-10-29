package dev.longeh.automine.listeners;

import dev.longeh.automine.config.Config;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class AutoMineListener {

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent e) {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().thePlayer;
        if(Config.getInstance().isAutoMineEnabled()) {
            int locX = (int) entityPlayerSP.posX;
            int locY = (int) entityPlayerSP.posY;
            int locZ = (int) entityPlayerSP.posZ;
            World world = entityPlayerSP.worldObj;
            int radius = 3;
            for(int x = -radius; x < radius + 1; x++) {
                for(int y = -radius; y < radius + 1; y++) {
                    for (int z = -radius; z < radius + 1; z++) {
                        IBlockState blockState = world.getBlockState(new BlockPos(locX + x, locY + y, locZ + z));
                        if (blockState.getBlock().getLocalizedName().equals("Nether Quartz Ore")) {
                            Minecraft.getMinecraft().playerController.clickBlock(new BlockPos(locX + x, locY + y, locZ + z), EnumFacing.EAST);
                            entityPlayerSP.swingItem();
                        }
                    }
                }
            }
        }
    }
}
