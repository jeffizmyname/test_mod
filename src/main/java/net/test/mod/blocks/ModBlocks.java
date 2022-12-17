package net.test.mod.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.test.mod.item.ModItemGroup;
import net.test.mod.testMod;

public class ModBlocks {

    public static final Block FLOUR_BLOCK = registerBlock("flour_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(2f).requiresTool()), ModItemGroup.NOTHING_MOD);
    public static final Block NIGA_FLOUR_BLOCK = registerBlock("niga_flour_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(2f).requiresTool()), ModItemGroup.NOTHING_MOD);

    public static Block registerBlock(String name, Block block, ItemGroup group) {
         registerBlockItem(name, block, group);
         return Registry.register(Registries.BLOCK, new Identifier(testMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(testMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        testMod.LOGGER.info("registering mod blocks for" + testMod.MOD_ID);
    }
}
