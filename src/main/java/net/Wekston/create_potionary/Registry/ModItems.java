package net.Wekston.create_potionary.Registry;

import net.Wekston.create_potionary.CreatePotionaryMod;
import net.Wekston.create_potionary.Item.AppleJuiceItem;
import net.Wekston.create_potionary.Item.BerriesJuiceItem;
import net.Wekston.create_potionary.Item.GoldenAppleJuiceItem;
import net.Wekston.create_potionary.Item.GreenTeaItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePotionaryMod.MODID);


    public static final RegistryObject<Item> BERRIES_JUICE = ITEMS.register("berries_juice",
            () -> new BerriesJuiceItem(new Item.Properties().stacksTo(16).food(new FoodProperties.Builder()
                            .nutrition(2).saturationMod(.2F).alwaysEat()
                            .build()
                    )
            ));
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice",
            () -> new AppleJuiceItem(new Item.Properties().stacksTo(16).food(new FoodProperties.Builder()
                    .nutrition(8).saturationMod(.8F).alwaysEat()
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 30 * 20, 0, false, false, false), 1F)
                    .build()
            )
            ));
    public static final RegistryObject<Item> GOLDEN_APPLE_JUICE = ITEMS.register("golden_apple_juice",
            () -> new GoldenAppleJuiceItem(new Item.Properties().stacksTo(16).food(new FoodProperties.Builder()
                    .nutrition(8).saturationMod(2.5F).alwaysEat()
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 14 * 20, 1, false, false, false), 1.0f).effect(() ->new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0, false, false, false), 1.0F)
                    .build()
            )
            ));

    public static final RegistryObject<Item> GREEN_TEA = ITEMS.register("green_tea",
            () -> new GreenTeaItem(new Item.Properties().stacksTo(16).food(new FoodProperties.Builder()
                    .nutrition(5).saturationMod(.6F).alwaysEat()
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 60 * 20, 0, false, false, false), 1F)
                    .build()
            )
            ));

    public static final RegistryObject<Item> GREEN_TEA_LEAF = ITEMS.register("green_tea_leaf",
            () -> new Item(new Item.Properties()));

    public static RegistryObject<Item> BERRIES_JUICE_FLUID_BUCKET = ITEMS.register(
            "berries_juice_fluid_bucket",
            () -> new BucketItem(
                    ModFluid.BERRIES_JUICE_FLUID,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
            )
    );

    public static RegistryObject<Item> APPLE_JUICE_FLUID_BUCKET = ITEMS.register(
            "apple_juice_fluid_bucket",
            () -> new BucketItem(
                    ModFluid.APPLE_JUICE_FLUID,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
            )
    );

    public static RegistryObject<Item> GOLDEN_APPLE_JUICE_FLUID_BUCKET = ITEMS.register(
            "golden_apple_juice_fluid_bucket",
            () -> new BucketItem(
                    ModFluid.GOLDEN_APPLE_JUICE_FLUID,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
            )
    );

    public static RegistryObject<Item> GREEN_TEA_FLUID_BUCKET = ITEMS.register(
            "green_tea_fluid_bucket",
            () -> new BucketItem(
                    ModFluid.GREEN_TEA_FLUID,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
            )
    );
}
