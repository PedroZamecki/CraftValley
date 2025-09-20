package org.zamecki.craft_valley;

import net.fabricmc.api.ModInitializer;
import static org.zamecki.craft_valley.Globals.*;

public class CraftValley implements ModInitializer {

    @Override
    public void onInitialize() {
        LOGGER.info("Craft Valley initialized with id: " + MOD_ID);
    }
}
