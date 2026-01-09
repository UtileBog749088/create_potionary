package net.Wekston.create_potionary.Registry;

import net.Wekston.create_potionary.CreatePotionaryMod;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = CreatePotionaryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModFluid.BERRIES_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluid.FLOWING_BERRIES_JUICE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluid.APPLE_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluid.FLOWING_APPLE_JUICE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluid.GOLDEN_APPLE_JUICE_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluid.FLOWING_GOLDEN_APPLE_JUICE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluid.GREEN_TEA_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluid.FLOWING_GREEN_TEA.get(), RenderType.translucent());

        });
    }
}