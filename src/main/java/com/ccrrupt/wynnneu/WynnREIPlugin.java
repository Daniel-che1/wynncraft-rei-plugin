package com.ccrrupt.wynnneu;

import me.shedaniel.rei.api.client.entry.EntryStack;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class WynnREIPlugin implements REIClientPlugin {
    @Override
    public Identifier getPluginIdentifier() {
        return new Identifier("wynnneu", "plugin");
    }

    @Override
    public void registerEntries(EntryRegistry registry) {
        List<WynnItem> items = WynnItemLoader.load();

        for (WynnItem item : items) {
            EntryStack<?> entry = EntryStack.of(Items.NETHERITE_SWORD) // You can change this to item.icon parsing later
                .tooltip(Text.of(item.name + " - Lv. " + item.level))
                .setting(EntryStack.Settings.TOOLTIP_ENABLED, true);

            registry.add(entry);
        }
    }
}
