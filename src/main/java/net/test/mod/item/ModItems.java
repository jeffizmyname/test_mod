package net.test.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.test.mod.testMod;

public class ModItems {

    public static final Item BAGJET = RegisterItem("bagjet",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build())), ModItemGroup.NOTHING_MOD);

    public static final Item BAGJEL = RegisterItem("bagjel",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build())), ModItemGroup.NOTHING_MOD);

    public static final Item FLOUR = RegisterItem("flour",
            new Item(new FabricItemSettings()), ModItemGroup.NOTHING_MOD);

    public static final Item NIGA_FLOUR = RegisterItem("niga_flour",
            new Item(new FabricItemSettings()), ModItemGroup.NOTHING_MOD);




    private static Item RegisterItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(testMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        testMod.LOGGER.info("registering mod items for" + testMod.MOD_ID);
    }

}
