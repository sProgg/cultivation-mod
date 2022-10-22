package net.jakku.cultivation.item;

import net.jakku.cultivation.CultivationMain;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CultivationItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CultivationMain.MODID);

    public static final RegistryObject<Item> MANUAL = ITEMS.register("cultivationmanual",
            () -> new Item(new Item.Properties().tab(CultivationCreativeModeTab.CULT_TAB)));

    public static final RegistryObject<Item> FORMINGPILL = ITEMS.register("formingpill",
            () -> new Item(new Item.Properties().tab(CultivationCreativeModeTab.CULT_TAB)));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}


