package me.azureluma.azure;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Azure implements ModInitializer {

    public static AzureConfig CONFIG = new AzureConfig();

    @Override
    public void onInitialize() {
        AutoConfig.register(AzureConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(AzureConfig.class).getConfig();
    }
}
