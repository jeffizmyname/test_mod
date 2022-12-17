package net.test.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.test.mod.blocks.ModBlocks;
import net.test.mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

public class testMod implements ModInitializer {
    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}