package net.test.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.test.mod.testMod;

public class ModItemGroup {
    public static final ItemGroup NOTHING_MOD = FabricItemGroup.builder(new Identifier(testMod.MOD_ID))
            .displayName(Text.literal("Nothing Mod"))
            .icon(() -> new ItemStack(ModItems.BAGJEL))
            .build();
}
