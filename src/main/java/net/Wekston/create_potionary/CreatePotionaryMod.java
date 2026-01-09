package net.Wekston.create_potionary;

import net.Wekston.create_potionary.Registry.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreatePotionaryMod.MODID)
public class CreatePotionaryMod
{
    public static final String MODID = "create_potionary";

    public CreatePotionaryMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModFluidType.FLUID_TYPES.register(modEventBus);
        ModFluid.FLUIDS.register(modEventBus);
        ModCreativeTab.register(modEventBus);
    }
}
