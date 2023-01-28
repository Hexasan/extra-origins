/*
 * All Rights Reserved (c) 2022 MoriyaShiine
 */

package moriyashiine.extraorigins.common.registry;

import moriyashiine.extraorigins.common.ExtraOrigins;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticleTypes {
	public static final ParticleType<DefaultParticleType> OFFENSE_SPORE = FabricParticleTypes.simple();
	public static final ParticleType<DefaultParticleType> DEFENSE_SPORE = FabricParticleTypes.simple();
	public static final ParticleType<DefaultParticleType> MOBILITY_SPORE = FabricParticleTypes.simple();

	public static void init() {
		Registry.register(Registries.PARTICLE_TYPE, new Identifier(ExtraOrigins.MOD_ID, "offense_spore"), OFFENSE_SPORE);
		Registry.register(Registries.PARTICLE_TYPE, new Identifier(ExtraOrigins.MOD_ID, "defense_spore"), DEFENSE_SPORE);
		Registry.register(Registries.PARTICLE_TYPE, new Identifier(ExtraOrigins.MOD_ID, "mobility_spore"), MOBILITY_SPORE);
	}
}
