package net.test.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.test.mod.testMod;

public class ModItems {

    public static final Item BAGJET = RegisterItem("bagjet",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build())));

    public static final Item BAGJEL = RegisterItem("bagjel",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build())));

    public static final Item FLOUR = RegisterItem("flour",
            new Item(new FabricItemSettings()));

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(testMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        testMod.LOGGER.info("registering mod items for" + testMod.MOD_ID);
    }

}
