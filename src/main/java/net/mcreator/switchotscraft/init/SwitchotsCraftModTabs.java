
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.switchotscraft.SwitchotsCraftMod;

public class SwitchotsCraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SwitchotsCraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATIVE_TABLE = REGISTRY.register("creative_table",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.switchots_craft.creative_table")).icon(() -> new ItemStack(SwitchotsCraftModItems.ROCK_SAW.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SwitchotsCraftModItems.LOG_BARK.get());
				tabData.accept(SwitchotsCraftModItems.ROCK.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_2.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_3.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_4.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_5.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_6.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_7.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_8.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_9.get());
				tabData.accept(SwitchotsCraftModItems.LOG_BARK_10.get());
				tabData.accept(SwitchotsCraftModItems.FIBER_STRING.get());
				tabData.accept(SwitchotsCraftModItems.BIGFIBER.get());
				tabData.accept(SwitchotsCraftModItems.FIBESR_STRING.get());
				tabData.accept(SwitchotsCraftModItems.SHARP_ROCK.get());
				tabData.accept(SwitchotsCraftModItems.ROCK_SAW.get());
				tabData.accept(SwitchotsCraftModItems.BASIC_AXE.get());
				tabData.accept(SwitchotsCraftModBlocks.CUTTING_LOG.get().asItem());
				tabData.accept(SwitchotsCraftModItems.PLANK_1.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_2.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_3.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_4.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_5.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_6.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_7.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_8.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_9.get());
				tabData.accept(SwitchotsCraftModItems.PLANK_10.get());
				tabData.accept(SwitchotsCraftModBlocks.CL_2.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_3.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_4.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_5.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_6.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_7.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_8.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_9.get().asItem());
				tabData.accept(SwitchotsCraftModBlocks.CL_10.get().asItem());
			}).withSearchBar().build());
}
