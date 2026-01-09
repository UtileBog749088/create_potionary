package net.Wekston.create_potionary.Registry;

import net.Wekston.create_potionary.CreatePotionaryMod;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluid {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreatePotionaryMod.MODID);

        public static RegistryObject<FlowingFluid> BERRIES_JUICE_FLUID = FLUIDS.register(
                "berries_juice_fluid",
                () -> new ForgeFlowingFluid.Source(ModFluid.BERRIES_JUICE_PROPERTIES)
        );

        public static RegistryObject<FlowingFluid> FLOWING_BERRIES_JUICE = FLUIDS.register(
                "flowing_berries_juice",
                () -> new ForgeFlowingFluid.Flowing(ModFluid.BERRIES_JUICE_PROPERTIES)
        );


    public static RegistryObject<FlowingFluid> APPLE_JUICE_FLUID = FLUIDS.register(
            "apple_juice_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluid.APPLE_JUICE_PROPERTIES)
    );

    public static RegistryObject<FlowingFluid> FLOWING_APPLE_JUICE = FLUIDS.register(
            "flowing_apple_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluid.APPLE_JUICE_PROPERTIES)
    );
    public static RegistryObject<FlowingFluid> GOLDEN_APPLE_JUICE_FLUID = FLUIDS.register(
            "golden_apple_juice_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluid.GOLDEN_APPLE_JUICE_PROPERTIES)
    );

    public static RegistryObject<FlowingFluid> FLOWING_GOLDEN_APPLE_JUICE = FLUIDS.register(
            "flowing_golden_apple_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluid.GOLDEN_APPLE_JUICE_PROPERTIES)
    );
    public static RegistryObject<FlowingFluid> GREEN_TEA_FLUID = FLUIDS.register(
            "green_tea_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluid.GREEN_TEA_PROPERTIES)
    );

    public static RegistryObject<FlowingFluid> FLOWING_GREEN_TEA = FLUIDS.register(
            "flowing_green_tea",
            () -> new ForgeFlowingFluid.Flowing(ModFluid.GREEN_TEA_PROPERTIES)
    );







    public static final ForgeFlowingFluid.Properties BERRIES_JUICE_PROPERTIES =
                new ForgeFlowingFluid.Properties(
                        ModFluidType.BERRIES_JUICE_FLUID_TYPE,
                        BERRIES_JUICE_FLUID,
                        FLOWING_BERRIES_JUICE
                )
                        .slopeFindDistance(2)
                        .levelDecreasePerBlock(2)
                        .block(ModBlocks.BERRIES_JUICE_FLUID_BLOCK)
                        .bucket(ModItems.BERRIES_JUICE_FLUID_BUCKET);



    public static final ForgeFlowingFluid.Properties APPLE_JUICE_PROPERTIES =
            new ForgeFlowingFluid.Properties(
                    ModFluidType.APPLE_JUICE_FLUID_TYPE,
                    APPLE_JUICE_FLUID,
                    FLOWING_APPLE_JUICE
            )
                    .slopeFindDistance(2)
                    .levelDecreasePerBlock(2)
                    .block(ModBlocks.APPLE_JUICE_FLUID_BLOCK)
                    .bucket(ModItems.APPLE_JUICE_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties GOLDEN_APPLE_JUICE_PROPERTIES =
        new ForgeFlowingFluid.Properties(
                ModFluidType.GOLDEN_APPLE_JUICE_FLUID_TYPE,
                GOLDEN_APPLE_JUICE_FLUID,
                FLOWING_GOLDEN_APPLE_JUICE
        )
                .slopeFindDistance(2)
                .levelDecreasePerBlock(2)
                .block(ModBlocks.GOLDEN_APPLE_JUICE_FLUID_BLOCK)
                .bucket(ModItems.GOLDEN_APPLE_JUICE_FLUID_BUCKET);


    public static final ForgeFlowingFluid.Properties GREEN_TEA_PROPERTIES =
            new ForgeFlowingFluid.Properties(
                    ModFluidType.GREEN_TEA_FLUID_TYPE,
                    GREEN_TEA_FLUID,
                    FLOWING_GREEN_TEA
            )
                    .slopeFindDistance(2)
                    .levelDecreasePerBlock(2)
                    .block(ModBlocks.GREEN_TEA_FLUID_BLOCK)
                    .bucket(ModItems.GREEN_TEA_FLUID_BUCKET);
    }
