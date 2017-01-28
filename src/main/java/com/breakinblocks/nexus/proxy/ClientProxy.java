package com.breakinblocks.nexus.proxy;

import com.breakinblocks.nexus.Nexus;
import com.breakinblocks.nexus.handlers.TextureHandler;
import com.breakinblocks.nexus.registry.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		TextureHandler.registerFluidRenderers();
		ModItems.itemBuffer.forEach(e -> tryHandleItemModel(e,e.getRegistryName().getResourcePath()));
	}

	@Override
	public void tryHandleItemModel(Item item, String name) {
		TextureHandler.handle(item, name);
	}
}
