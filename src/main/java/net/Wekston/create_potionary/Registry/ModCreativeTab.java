package net.Wekston.create_potionary.Registry;


import net.Wekston.create_potionary.CreatePotionaryMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePotionaryMod.MODID);

    public static final RegistryObject<CreativeModeTab> CREATE_POTIONARY_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLDEN_APPLE_JUICE.get()))
                    .title(Component.translatable("creativetab.create_potionary_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GREEN_TEA_LEAF.get());
                        pOutput.accept(ModItems.BERRIES_JUICE_FLUID_BUCKET.get());
                        pOutput.accept(ModItems.APPLE_JUICE_FLUID_BUCKET.get());
                        pOutput.accept(ModItems.GOLDEN_APPLE_JUICE_FLUID_BUCKET.get());
                        pOutput.accept(ModItems.GREEN_TEA_FLUID_BUCKET.get());
                        pOutput.accept(ModItems.BERRIES_JUICE.get());
                        pOutput.accept(ModItems.APPLE_JUICE.get());
                        pOutput.accept(ModItems.GOLDEN_APPLE_JUICE.get());
                        pOutput.accept(ModItems.GREEN_TEA.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
