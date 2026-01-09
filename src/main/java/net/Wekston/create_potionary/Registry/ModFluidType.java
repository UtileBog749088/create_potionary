package net.Wekston.create_potionary.Registry;

import net.Wekston.create_potionary.CreatePotionaryMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Consumer;
public class ModFluidType {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreatePotionaryMod.MODID);

    public static RegistryObject<FluidType> BERRIES_JUICE_FLUID_TYPE = FLUID_TYPES.register(
            "berries_juice_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.create_potionary.berries_juice_fluid")
                    .fallDistanceModifier(0F)
                    .canExtinguish(true)
                    .canConvertToSource(false)
                    .supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                    .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
                    .canHydrate(false)) {

                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/berries_juice_fluid_still");
                        private static final ResourceLocation FLOWING_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/berries_juice_fluid_flow");

                        @Override
                        public ResourceLocation getStillTexture() {
                            return STILL_TEXTURE;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return FLOWING_TEXTURE;
                        }

                    });
                }
            }
    );

    public static RegistryObject<FluidType> APPLE_JUICE_FLUID_TYPE = FLUID_TYPES.register(
            "apple_juice_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.create_potionary.apple_juice_fluid")
                    .fallDistanceModifier(0F)
                    .canExtinguish(true)
                    .canConvertToSource(false)
                    .supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                    .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
                    .canHydrate(false)) {

                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/apple_juice_fluid_still");
                        private static final ResourceLocation FLOWING_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/apple_juice_fluid_flow");

                        @Override
                        public ResourceLocation getStillTexture() {
                            return STILL_TEXTURE;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return FLOWING_TEXTURE;
                        }

                    });
                }
            }
    );


    public static RegistryObject<FluidType> GOLDEN_APPLE_JUICE_FLUID_TYPE = FLUID_TYPES.register(
            "golden_apple_juice_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.create_potionary.golden_apple_juice_fluid")
                    .fallDistanceModifier(0F)
                    .canExtinguish(true)
                    .canConvertToSource(false)
                    .supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                    .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
                    .canHydrate(false)) {

                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/golden_apple_juice_fluid_still");
                        private static final ResourceLocation FLOWING_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/golden_apple_juice_fluid_flow");

                        @Override
                        public ResourceLocation getStillTexture() {
                            return STILL_TEXTURE;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return FLOWING_TEXTURE;
                        }

                    });
                }
            }
    );


    public static RegistryObject<FluidType> GREEN_TEA_FLUID_TYPE = FLUID_TYPES.register(
            "green_tea_fluid_type",
            () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.create_potionary.green_tea_fluid")
                    .fallDistanceModifier(0F)
                    .canExtinguish(true)
                    .canConvertToSource(false)
                    .supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                    .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
                    .canHydrate(false)) {

                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/green_tea_fluid_still");
                        private static final ResourceLocation FLOWING_TEXTURE =
                                ResourceLocation.fromNamespaceAndPath("create_potionary", "block/green_tea_fluid_flow");

                        @Override
                        public ResourceLocation getStillTexture() {
                            return STILL_TEXTURE;
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return FLOWING_TEXTURE;
                        }

                    });
                }
            }
    );
}