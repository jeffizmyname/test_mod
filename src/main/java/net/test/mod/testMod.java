package net.test.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

public class testMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("testmod");
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {


        LOGGER.info("Hello Fabric world!");
        Registry.register(Registries.ITEM, new Identifier("testmod", "custom_item"), CUSTOM_ITEM);
    }
}