package net.mcreator.switchotscraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.switchotscraft.entity.CrabEntity;

public class CrabModel extends GeoModel<CrabEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrabEntity entity) {
		return new ResourceLocation("switchots_craft", "animations/crab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrabEntity entity) {
		return new ResourceLocation("switchots_craft", "geo/crab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrabEntity entity) {
		return new ResourceLocation("switchots_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
