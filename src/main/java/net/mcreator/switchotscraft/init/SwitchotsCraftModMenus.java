
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.switchotscraft.world.inventory.DontspawnMenu;
import net.mcreator.switchotscraft.SwitchotsCraftMod;

public class SwitchotsCraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SwitchotsCraftMod.MODID);
	public static final RegistryObject<MenuType<DontspawnMenu>> DONTSPAWN = REGISTRY.register("dontspawn", () -> IForgeMenuType.create(DontspawnMenu::new));
}
