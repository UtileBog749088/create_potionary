package net.Wekston.create_potionary.Registry;

import net.Wekston.create_potionary.CreatePotionaryMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreatePotionaryMod.MODID);

    public static RegistryObject<LiquidBlock> BERRIES_JUICE_FLUID_BLOCK = BLOCKS.register(
            "berries_juice_fluid_block",
            () -> new LiquidBlock(
                    ModFluid.BERRIES_JUICE_FLUID,
                    BlockBehaviour.Properties.copy(Blocks.WATER)
            )
    );
    public static RegistryObject<LiquidBlock> APPLE_JUICE_FLUID_BLOCK = BLOCKS.register(
            "apple_fluid_block",
            () -> new LiquidBlock(
                    ModFluid.APPLE_JUICE_FLUID,
                    BlockBehaviour.Properties.copy(Blocks.WATER)
            )
    );
    public static RegistryObject<LiquidBlock> GOLDEN_APPLE_JUICE_FLUID_BLOCK = BLOCKS.register(
            "golden_apple_fluid_block",
            () -> new LiquidBlock(
                    ModFluid.GOLDEN_APPLE_JUICE_FLUID,
                    BlockBehaviour.Properties.copy(Blocks.WATER)
            )
    );
    public static RegistryObject<LiquidBlock> GREEN_TEA_FLUID_BLOCK = BLOCKS.register(
            "green_tea_fluid_block",
            () -> new LiquidBlock(
                    ModFluid.GREEN_TEA_FLUID,
                    BlockBehaviour.Properties.copy(Blocks.WATER)
            )
    );
}