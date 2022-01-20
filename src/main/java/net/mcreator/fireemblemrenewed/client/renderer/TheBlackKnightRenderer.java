package net.mcreator.fireemblemrenewed.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.fireemblemrenewed.entity.TheBlackKnightEntity;

public class TheBlackKnightRenderer extends HumanoidMobRenderer<TheBlackKnightEntity, HumanoidModel<TheBlackKnightEntity>> {
	public TheBlackKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(TheBlackKnightEntity entity) {
		return new ResourceLocation("fire_emblem_renewed:textures/2021_05_24_black-knight-fire-emblem--re-edit-17902943.png");
	}
}
