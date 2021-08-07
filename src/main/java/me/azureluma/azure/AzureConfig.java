package me.azureluma.azure;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "azure")
public class AzureConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip()
    public boolean azureValue = true;
}
