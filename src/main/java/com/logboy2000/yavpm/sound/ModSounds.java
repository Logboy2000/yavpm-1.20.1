package com.logboy2000.yavpm.sound;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent VINE_BOOM = registerSoundEvent("vine_boom");
    public static SoundEvent CAREFREE_MUSIC_DISC = registerSoundEvent("carefree_music_disc");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(YetAnotherVanillaPlusMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
