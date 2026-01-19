package com.ostoff2.ostogredients.item;

import com.ostoff2.ostogredients.OstogredientsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OstogredientsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> OSTOGREDIENTS_TAB = CREATIVE_MODE_TAB.register("ostogredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INCOMPLETE_FLUID_PIPE.get()))
                    .title(Component.translatable("creativetab.ostogredients.ostogredients"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.INCOMPLETE_FLUID_PIPE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
