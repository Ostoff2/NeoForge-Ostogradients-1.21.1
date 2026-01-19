package com.ostoff2.ostogredients.item;

import com.ostoff2.ostogredients.OstogredientsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final  DeferredRegister.Items ITEMS = DeferredRegister.createItems(OstogredientsMod.MOD_ID);

    public static final DeferredItem<Item> INCOMPLETE_FLUID_PIPE = ITEMS.register("incomplete_fluid_pipe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
