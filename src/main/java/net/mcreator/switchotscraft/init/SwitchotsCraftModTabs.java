
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
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.switchots_craft.creative_table")).icon(() -> new ItemStack(SwitchotsCraftModItems.OAKROCKSAW.get())).displayItems((parameters, tabData) -> {
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
				tabData.accept(SwitchotsCraftModItems.OAKSTICK.get());
				tabData.accept(SwitchotsCraftModItems.SPRUCE_STICK.get());
				tabData.accept(SwitchotsCraftModItems.BIRCH_STICK.get());
				tabData.accept(SwitchotsCraftModItems.JUNGLE_STICK.get());
				tabData.accept(SwitchotsCraftModItems.ACACIA_STICK.get());
				tabData.accept(SwitchotsCraftModItems.DARK_OAK_STICK.get());
				tabData.accept(SwitchotsCraftModItems.MANGROVE_STICK.get());
				tabData.accept(SwitchotsCraftModItems.CHERRY_STICK.get());
				tabData.accept(SwitchotsCraftModItems.CRIMSON_STICK.get());
				tabData.accept(SwitchotsCraftModItems.WARPED_STICK.get());
				tabData.accept(SwitchotsCraftModItems.BAMBOO_STICK.get());
				tabData.accept(SwitchotsCraftModItems.OAKROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.SPRUCEROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.BIRCHROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.JUNGLEROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.ACACIAROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.DARKOAKROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.MANGROVEROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.CHERRYROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.CRIMSONROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.WARPEDROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.BAMBOOROCKSAW.get());
				tabData.accept(SwitchotsCraftModItems.OAKHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.SPRUCEHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.BIRCHHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.JUNGLEHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.ACACIAHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.DARK_OAKHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.MANGROVEHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.CHERRYHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.CRIMSONHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.WARPEDHATCHET.get());
				tabData.accept(SwitchotsCraftModItems.BAMBOOHATCHET.get());
			}).withSearchBar().build());
}
