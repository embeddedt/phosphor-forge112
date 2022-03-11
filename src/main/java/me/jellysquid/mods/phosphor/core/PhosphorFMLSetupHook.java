package me.jellysquid.mods.phosphor.core;

import net.minecraftforge.fml.relauncher.IFMLCallHook;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

public class PhosphorFMLSetupHook implements IFMLCallHook {
    private static final Logger logger = LogManager.getLogger("Phosphor Forge Core");

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public Void call() {
        Mixins.addConfiguration("mixins.phosphor.json");

        return null;
    }
}
