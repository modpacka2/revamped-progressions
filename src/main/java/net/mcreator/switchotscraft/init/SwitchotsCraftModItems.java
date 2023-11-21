
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.switchotscraft.item.SharpRockItem;
import net.mcreator.switchotscraft.item.RockSawItem;
import net.mcreator.switchotscraft.item.RockItem;
import net.mcreator.switchotscraft.item.Plank9Item;
import net.mcreator.switchotscraft.item.Plank8Item;
import net.mcreator.switchotscraft.item.Plank7Item;
import net.mcreator.switchotscraft.item.Plank6Item;
import net.mcreator.switchotscraft.item.Plank5Item;
import net.mcreator.switchotscraft.item.Plank4Item;
import net.mcreator.switchotscraft.item.Plank3Item;
import net.mcreator.switchotscraft.item.Plank2Item;
import net.mcreator.switchotscraft.item.Plank1Item;
import net.mcreator.switchotscraft.item.Plank10Item;
import net.mcreator.switchotscraft.item.LogBarkItem;
import net.mcreator.switchotscraft.item.LogBark9Item;
import net.mcreator.switchotscraft.item.LogBark8Item;
import net.mcreator.switchotscraft.item.LogBark7Item;
import net.mcreator.switchotscraft.item.LogBark6Item;
import net.mcreator.switchotscraft.item.LogBark5Item;
import net.mcreator.switchotscraft.item.LogBark4Item;
import net.mcreator.switchotscraft.item.LogBark3Item;
import net.mcreator.switchotscraft.item.LogBark2Item;
import net.mcreator.switchotscraft.item.LogBark10Item;
import net.mcreator.switchotscraft.item.FibesrStringItem;
import net.mcreator.switchotscraft.item.FiberStringItem;
import net.mcreator.switchotscraft.item.BigfiberItem;
import net.mcreator.switchotscraft.item.BasicAxeItem;
import net.mcreator.switchotscraft.SwitchotsCraftMod;

public class SwitchotsCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SwitchotsCraftMod.MODID);
	public static final RegistryObject<Item> LOG_BARK = REGISTRY.register("log_bark", () -> new LogBarkItem());
	public static final RegistryObject<Item> ROCK = REGISTRY.register("rock", () -> new RockItem());
	public static final RegistryObject<Item> LOG_BARK_2 = REGISTRY.register("log_bark_2", () -> new LogBark2Item());
	public static final RegistryObject<Item> LOG_BARK_3 = REGISTRY.register("log_bark_3", () -> new LogBark3Item());
	public static final RegistryObject<Item> LOG_BARK_4 = REGISTRY.register("log_bark_4", () -> new LogBark4Item());
	public static final RegistryObject<Item> LOG_BARK_5 = REGISTRY.register("log_bark_5", () -> new LogBark5Item());
	public static final RegistryObject<Item> LOG_BARK_6 = REGISTRY.register("log_bark_6", () -> new LogBark6Item());
	public static final RegistryObject<Item> LOG_BARK_7 = REGISTRY.register("log_bark_7", () -> new LogBark7Item());
	public static final RegistryObject<Item> LOG_BARK_8 = REGISTRY.register("log_bark_8", () -> new LogBark8Item());
	public static final RegistryObject<Item> LOG_BARK_9 = REGISTRY.register("log_bark_9", () -> new LogBark9Item());
	public static final RegistryObject<Item> LOG_BARK_10 = REGISTRY.register("log_bark_10", () -> new LogBark10Item());
	public static final RegistryObject<Item> FIBER_STRING = REGISTRY.register("fiber_string", () -> new FiberStringItem());
	public static final RegistryObject<Item> BIGFIBER = REGISTRY.register("bigfiber", () -> new BigfiberItem());
	public static final RegistryObject<Item> FIBESR_STRING = REGISTRY.register("fibesr_string", () -> new FibesrStringItem());
	public static final RegistryObject<Item> SHARP_ROCK = REGISTRY.register("sharp_rock", () -> new SharpRockItem());
	public static final RegistryObject<Item> ROCK_SAW = REGISTRY.register("rock_saw", () -> new RockSawItem());
	public static final RegistryObject<Item> BASIC_AXE = REGISTRY.register("basic_axe", () -> new BasicAxeItem());
	public static final RegistryObject<Item> CUTTING_LOG = block(SwitchotsCraftModBlocks.CUTTING_LOG);
	public static final RegistryObject<Item> PLANK_1 = REGISTRY.register("plank_1", () -> new Plank1Item());
	public static final RegistryObject<Item> PLANK_2 = REGISTRY.register("plank_2", () -> new Plank2Item());
	public static final RegistryObject<Item> PLANK_3 = REGISTRY.register("plank_3", () -> new Plank3Item());
	public static final RegistryObject<Item> PLANK_4 = REGISTRY.register("plank_4", () -> new Plank4Item());
	public static final RegistryObject<Item> PLANK_5 = REGISTRY.register("plank_5", () -> new Plank5Item());
	public static final RegistryObject<Item> PLANK_6 = REGISTRY.register("plank_6", () -> new Plank6Item());
	public static final RegistryObject<Item> PLANK_7 = REGISTRY.register("plank_7", () -> new Plank7Item());
	public static final RegistryObject<Item> PLANK_8 = REGISTRY.register("plank_8", () -> new Plank8Item());
	public static final RegistryObject<Item> PLANK_9 = REGISTRY.register("plank_9", () -> new Plank9Item());
	public static final RegistryObject<Item> PLANK_10 = REGISTRY.register("plank_10", () -> new Plank10Item());
	public static final RegistryObject<Item> L_1 = block(SwitchotsCraftModBlocks.L_1);
	public static final RegistryObject<Item> L_2 = block(SwitchotsCraftModBlocks.L_2);
	public static final RegistryObject<Item> L_3 = block(SwitchotsCraftModBlocks.L_3);
	public static final RegistryObject<Item> L_4 = block(SwitchotsCraftModBlocks.L_4);
	public static final RegistryObject<Item> L_5 = block(SwitchotsCraftModBlocks.L_5);
	public static final RegistryObject<Item> L_6 = block(SwitchotsCraftModBlocks.L_6);
	public static final RegistryObject<Item> L_7 = block(SwitchotsCraftModBlocks.L_7);
	public static final RegistryObject<Item> L_8 = block(SwitchotsCraftModBlocks.L_8);
	public static final RegistryObject<Item> L_9 = block(SwitchotsCraftModBlocks.L_9);
	public static final RegistryObject<Item> L_10 = block(SwitchotsCraftModBlocks.L_10);
	public static final RegistryObject<Item> L_11 = block(SwitchotsCraftModBlocks.L_11);
	public static final RegistryObject<Item> L_12 = block(SwitchotsCraftModBlocks.L_12);
	public static final RegistryObject<Item> L_13 = block(SwitchotsCraftModBlocks.L_13);
	public static final RegistryObject<Item> L_14 = block(SwitchotsCraftModBlocks.L_14);
	public static final RegistryObject<Item> L_15 = block(SwitchotsCraftModBlocks.L_15);
	public static final RegistryObject<Item> L_16 = block(SwitchotsCraftModBlocks.L_16);
	public static final RegistryObject<Item> L_17 = block(SwitchotsCraftModBlocks.L_17);
	public static final RegistryObject<Item> L_18 = block(SwitchotsCraftModBlocks.L_18);
	public static final RegistryObject<Item> L_19 = block(SwitchotsCraftModBlocks.L_19);
	public static final RegistryObject<Item> L_20 = block(SwitchotsCraftModBlocks.L_20);
	public static final RegistryObject<Item> L_21 = block(SwitchotsCraftModBlocks.L_21);
	public static final RegistryObject<Item> L_22 = block(SwitchotsCraftModBlocks.L_22);
	public static final RegistryObject<Item> L_23 = block(SwitchotsCraftModBlocks.L_23);
	public static final RegistryObject<Item> L_24 = block(SwitchotsCraftModBlocks.L_24);
	public static final RegistryObject<Item> L_25 = block(SwitchotsCraftModBlocks.L_25);
	public static final RegistryObject<Item> L_26 = block(SwitchotsCraftModBlocks.L_26);
	public static final RegistryObject<Item> L_27 = block(SwitchotsCraftModBlocks.L_27);
	public static final RegistryObject<Item> L_28 = block(SwitchotsCraftModBlocks.L_28);
	public static final RegistryObject<Item> L_29 = block(SwitchotsCraftModBlocks.L_29);
	public static final RegistryObject<Item> L_30 = block(SwitchotsCraftModBlocks.L_30);
	public static final RegistryObject<Item> L_31 = block(SwitchotsCraftModBlocks.L_31);
	public static final RegistryObject<Item> L_32 = block(SwitchotsCraftModBlocks.L_32);
	public static final RegistryObject<Item> L_33 = block(SwitchotsCraftModBlocks.L_33);
	public static final RegistryObject<Item> L_34 = block(SwitchotsCraftModBlocks.L_34);
	public static final RegistryObject<Item> L_35 = block(SwitchotsCraftModBlocks.L_35);
	public static final RegistryObject<Item> L_36 = block(SwitchotsCraftModBlocks.L_36);
	public static final RegistryObject<Item> L_37 = block(SwitchotsCraftModBlocks.L_37);
	public static final RegistryObject<Item> L_38 = block(SwitchotsCraftModBlocks.L_38);
	public static final RegistryObject<Item> L_39 = block(SwitchotsCraftModBlocks.L_39);
	public static final RegistryObject<Item> L_40 = block(SwitchotsCraftModBlocks.L_40);
	public static final RegistryObject<Item> L_41 = block(SwitchotsCraftModBlocks.L_41);
	public static final RegistryObject<Item> L_42 = block(SwitchotsCraftModBlocks.L_42);
	public static final RegistryObject<Item> L_43 = block(SwitchotsCraftModBlocks.L_43);
	public static final RegistryObject<Item> L_44 = block(SwitchotsCraftModBlocks.L_44);
	public static final RegistryObject<Item> L_45 = block(SwitchotsCraftModBlocks.L_45);
	public static final RegistryObject<Item> L_46 = block(SwitchotsCraftModBlocks.L_46);
	public static final RegistryObject<Item> L_47 = block(SwitchotsCraftModBlocks.L_47);
	public static final RegistryObject<Item> L_48 = block(SwitchotsCraftModBlocks.L_48);
	public static final RegistryObject<Item> L_49 = block(SwitchotsCraftModBlocks.L_49);
	public static final RegistryObject<Item> L_50 = block(SwitchotsCraftModBlocks.L_50);
	public static final RegistryObject<Item> L_51 = block(SwitchotsCraftModBlocks.L_51);
	public static final RegistryObject<Item> L_52 = block(SwitchotsCraftModBlocks.L_52);
	public static final RegistryObject<Item> L_53 = block(SwitchotsCraftModBlocks.L_53);
	public static final RegistryObject<Item> L_54 = block(SwitchotsCraftModBlocks.L_54);
	public static final RegistryObject<Item> L_55 = block(SwitchotsCraftModBlocks.L_55);
	public static final RegistryObject<Item> L_56 = block(SwitchotsCraftModBlocks.L_56);
	public static final RegistryObject<Item> L_57 = block(SwitchotsCraftModBlocks.L_57);
	public static final RegistryObject<Item> L_58 = block(SwitchotsCraftModBlocks.L_58);
	public static final RegistryObject<Item> L_59 = block(SwitchotsCraftModBlocks.L_59);
	public static final RegistryObject<Item> L_60 = block(SwitchotsCraftModBlocks.L_60);
	public static final RegistryObject<Item> L_61 = block(SwitchotsCraftModBlocks.L_61);
	public static final RegistryObject<Item> L_62 = block(SwitchotsCraftModBlocks.L_62);
	public static final RegistryObject<Item> L_63 = block(SwitchotsCraftModBlocks.L_63);
	public static final RegistryObject<Item> L_64 = block(SwitchotsCraftModBlocks.L_64);
	public static final RegistryObject<Item> L_65 = block(SwitchotsCraftModBlocks.L_65);
	public static final RegistryObject<Item> L_66 = block(SwitchotsCraftModBlocks.L_66);
	public static final RegistryObject<Item> L_67 = block(SwitchotsCraftModBlocks.L_67);
	public static final RegistryObject<Item> L_68 = block(SwitchotsCraftModBlocks.L_68);
	public static final RegistryObject<Item> L_69 = block(SwitchotsCraftModBlocks.L_69);
	public static final RegistryObject<Item> L_70 = block(SwitchotsCraftModBlocks.L_70);
	public static final RegistryObject<Item> L_71 = block(SwitchotsCraftModBlocks.L_71);
	public static final RegistryObject<Item> L_72 = block(SwitchotsCraftModBlocks.L_72);
	public static final RegistryObject<Item> L_73 = block(SwitchotsCraftModBlocks.L_73);
	public static final RegistryObject<Item> L_74 = block(SwitchotsCraftModBlocks.L_74);
	public static final RegistryObject<Item> L_75 = block(SwitchotsCraftModBlocks.L_75);
	public static final RegistryObject<Item> L_76 = block(SwitchotsCraftModBlocks.L_76);
	public static final RegistryObject<Item> L_77 = block(SwitchotsCraftModBlocks.L_77);
	public static final RegistryObject<Item> L_78 = block(SwitchotsCraftModBlocks.L_78);
	public static final RegistryObject<Item> L_79 = block(SwitchotsCraftModBlocks.L_79);
	public static final RegistryObject<Item> L_80 = block(SwitchotsCraftModBlocks.L_80);
	public static final RegistryObject<Item> L_81 = block(SwitchotsCraftModBlocks.L_81);
	public static final RegistryObject<Item> L_82 = block(SwitchotsCraftModBlocks.L_82);
	public static final RegistryObject<Item> L_83 = block(SwitchotsCraftModBlocks.L_83);
	public static final RegistryObject<Item> L_84 = block(SwitchotsCraftModBlocks.L_84);
	public static final RegistryObject<Item> L_85 = block(SwitchotsCraftModBlocks.L_85);
	public static final RegistryObject<Item> L_86 = block(SwitchotsCraftModBlocks.L_86);
	public static final RegistryObject<Item> L_87 = block(SwitchotsCraftModBlocks.L_87);
	public static final RegistryObject<Item> L_88 = block(SwitchotsCraftModBlocks.L_88);
	public static final RegistryObject<Item> L_89 = block(SwitchotsCraftModBlocks.L_89);
	public static final RegistryObject<Item> L_90 = block(SwitchotsCraftModBlocks.L_90);
	public static final RegistryObject<Item> L_91 = block(SwitchotsCraftModBlocks.L_91);
	public static final RegistryObject<Item> L_92 = block(SwitchotsCraftModBlocks.L_92);
	public static final RegistryObject<Item> L_93 = block(SwitchotsCraftModBlocks.L_93);
	public static final RegistryObject<Item> L_94 = block(SwitchotsCraftModBlocks.L_94);
	public static final RegistryObject<Item> L_95 = block(SwitchotsCraftModBlocks.L_95);
	public static final RegistryObject<Item> L_96 = block(SwitchotsCraftModBlocks.L_96);
	public static final RegistryObject<Item> L_97 = block(SwitchotsCraftModBlocks.L_97);
	public static final RegistryObject<Item> L_98 = block(SwitchotsCraftModBlocks.L_98);
	public static final RegistryObject<Item> L_99 = block(SwitchotsCraftModBlocks.L_99);
	public static final RegistryObject<Item> L_100 = block(SwitchotsCraftModBlocks.L_100);
	public static final RegistryObject<Item> L_101 = block(SwitchotsCraftModBlocks.L_101);
	public static final RegistryObject<Item> L_102 = block(SwitchotsCraftModBlocks.L_102);
	public static final RegistryObject<Item> L_103 = block(SwitchotsCraftModBlocks.L_103);
	public static final RegistryObject<Item> L_104 = block(SwitchotsCraftModBlocks.L_104);
	public static final RegistryObject<Item> L_105 = block(SwitchotsCraftModBlocks.L_105);
	public static final RegistryObject<Item> L_106 = block(SwitchotsCraftModBlocks.L_106);
	public static final RegistryObject<Item> L_107 = block(SwitchotsCraftModBlocks.L_107);
	public static final RegistryObject<Item> L_108 = block(SwitchotsCraftModBlocks.L_108);
	public static final RegistryObject<Item> L_109 = block(SwitchotsCraftModBlocks.L_109);
	public static final RegistryObject<Item> L_110 = block(SwitchotsCraftModBlocks.L_110);
	public static final RegistryObject<Item> L_111 = block(SwitchotsCraftModBlocks.L_111);
	public static final RegistryObject<Item> L_112 = block(SwitchotsCraftModBlocks.L_112);
	public static final RegistryObject<Item> L_113 = block(SwitchotsCraftModBlocks.L_113);
	public static final RegistryObject<Item> L_114 = block(SwitchotsCraftModBlocks.L_114);
	public static final RegistryObject<Item> L_115 = block(SwitchotsCraftModBlocks.L_115);
	public static final RegistryObject<Item> L_116 = block(SwitchotsCraftModBlocks.L_116);
	public static final RegistryObject<Item> L_117 = block(SwitchotsCraftModBlocks.L_117);
	public static final RegistryObject<Item> L_118 = block(SwitchotsCraftModBlocks.L_118);
	public static final RegistryObject<Item> L_119 = block(SwitchotsCraftModBlocks.L_119);
	public static final RegistryObject<Item> L_120 = block(SwitchotsCraftModBlocks.L_120);
	public static final RegistryObject<Item> L_121 = block(SwitchotsCraftModBlocks.L_121);
	public static final RegistryObject<Item> L_122 = block(SwitchotsCraftModBlocks.L_122);
	public static final RegistryObject<Item> L_123 = block(SwitchotsCraftModBlocks.L_123);
	public static final RegistryObject<Item> L_124 = block(SwitchotsCraftModBlocks.L_124);
	public static final RegistryObject<Item> L_125 = block(SwitchotsCraftModBlocks.L_125);
	public static final RegistryObject<Item> L_126 = block(SwitchotsCraftModBlocks.L_126);
	public static final RegistryObject<Item> L_127 = block(SwitchotsCraftModBlocks.L_127);
	public static final RegistryObject<Item> L_128 = block(SwitchotsCraftModBlocks.L_128);
	public static final RegistryObject<Item> L_129 = block(SwitchotsCraftModBlocks.L_129);
	public static final RegistryObject<Item> L_130 = block(SwitchotsCraftModBlocks.L_130);
	public static final RegistryObject<Item> L_131 = block(SwitchotsCraftModBlocks.L_131);
	public static final RegistryObject<Item> L_132 = block(SwitchotsCraftModBlocks.L_132);
	public static final RegistryObject<Item> L_133 = block(SwitchotsCraftModBlocks.L_133);
	public static final RegistryObject<Item> L_134 = block(SwitchotsCraftModBlocks.L_134);
	public static final RegistryObject<Item> L_135 = block(SwitchotsCraftModBlocks.L_135);
	public static final RegistryObject<Item> L_136 = block(SwitchotsCraftModBlocks.L_136);
	public static final RegistryObject<Item> L_137 = block(SwitchotsCraftModBlocks.L_137);
	public static final RegistryObject<Item> L_138 = block(SwitchotsCraftModBlocks.L_138);
	public static final RegistryObject<Item> L_139 = block(SwitchotsCraftModBlocks.L_139);
	public static final RegistryObject<Item> L_140 = block(SwitchotsCraftModBlocks.L_140);
	public static final RegistryObject<Item> L_141 = block(SwitchotsCraftModBlocks.L_141);
	public static final RegistryObject<Item> L_142 = block(SwitchotsCraftModBlocks.L_142);
	public static final RegistryObject<Item> L_143 = block(SwitchotsCraftModBlocks.L_143);
	public static final RegistryObject<Item> L_144 = block(SwitchotsCraftModBlocks.L_144);
	public static final RegistryObject<Item> L_145 = block(SwitchotsCraftModBlocks.L_145);
	public static final RegistryObject<Item> L_146 = block(SwitchotsCraftModBlocks.L_146);
	public static final RegistryObject<Item> L_147 = block(SwitchotsCraftModBlocks.L_147);
	public static final RegistryObject<Item> L_148 = block(SwitchotsCraftModBlocks.L_148);
	public static final RegistryObject<Item> L_149 = block(SwitchotsCraftModBlocks.L_149);
	public static final RegistryObject<Item> L_150 = block(SwitchotsCraftModBlocks.L_150);
	public static final RegistryObject<Item> L_151 = block(SwitchotsCraftModBlocks.L_151);
	public static final RegistryObject<Item> L_152 = block(SwitchotsCraftModBlocks.L_152);
	public static final RegistryObject<Item> L_153 = block(SwitchotsCraftModBlocks.L_153);
	public static final RegistryObject<Item> L_154 = block(SwitchotsCraftModBlocks.L_154);
	public static final RegistryObject<Item> L_155 = block(SwitchotsCraftModBlocks.L_155);
	public static final RegistryObject<Item> L_156 = block(SwitchotsCraftModBlocks.L_156);
	public static final RegistryObject<Item> L_157 = block(SwitchotsCraftModBlocks.L_157);
	public static final RegistryObject<Item> L_158 = block(SwitchotsCraftModBlocks.L_158);
	public static final RegistryObject<Item> L_159 = block(SwitchotsCraftModBlocks.L_159);
	public static final RegistryObject<Item> L_160 = block(SwitchotsCraftModBlocks.L_160);
	public static final RegistryObject<Item> L_161 = block(SwitchotsCraftModBlocks.L_161);
	public static final RegistryObject<Item> L_162 = block(SwitchotsCraftModBlocks.L_162);
	public static final RegistryObject<Item> L_163 = block(SwitchotsCraftModBlocks.L_163);
	public static final RegistryObject<Item> L_164 = block(SwitchotsCraftModBlocks.L_164);
	public static final RegistryObject<Item> L_165 = block(SwitchotsCraftModBlocks.L_165);
	public static final RegistryObject<Item> L_166 = block(SwitchotsCraftModBlocks.L_166);
	public static final RegistryObject<Item> L_167 = block(SwitchotsCraftModBlocks.L_167);
	public static final RegistryObject<Item> L_168 = block(SwitchotsCraftModBlocks.L_168);
	public static final RegistryObject<Item> L_169 = block(SwitchotsCraftModBlocks.L_169);
	public static final RegistryObject<Item> L_170 = block(SwitchotsCraftModBlocks.L_170);
	public static final RegistryObject<Item> L_171 = block(SwitchotsCraftModBlocks.L_171);
	public static final RegistryObject<Item> L_172 = block(SwitchotsCraftModBlocks.L_172);
	public static final RegistryObject<Item> L_173 = block(SwitchotsCraftModBlocks.L_173);
	public static final RegistryObject<Item> L_174 = block(SwitchotsCraftModBlocks.L_174);
	public static final RegistryObject<Item> L_175 = block(SwitchotsCraftModBlocks.L_175);
	public static final RegistryObject<Item> L_176 = block(SwitchotsCraftModBlocks.L_176);
	public static final RegistryObject<Item> L_177 = block(SwitchotsCraftModBlocks.L_177);
	public static final RegistryObject<Item> L_178 = block(SwitchotsCraftModBlocks.L_178);
	public static final RegistryObject<Item> L_179 = block(SwitchotsCraftModBlocks.L_179);
	public static final RegistryObject<Item> L_180 = block(SwitchotsCraftModBlocks.L_180);
	public static final RegistryObject<Item> L_181 = block(SwitchotsCraftModBlocks.L_181);
	public static final RegistryObject<Item> L_182 = block(SwitchotsCraftModBlocks.L_182);
	public static final RegistryObject<Item> L_183 = block(SwitchotsCraftModBlocks.L_183);
	public static final RegistryObject<Item> L_184 = block(SwitchotsCraftModBlocks.L_184);
	public static final RegistryObject<Item> L_185 = block(SwitchotsCraftModBlocks.L_185);
	public static final RegistryObject<Item> L_186 = block(SwitchotsCraftModBlocks.L_186);
	public static final RegistryObject<Item> L_187 = block(SwitchotsCraftModBlocks.L_187);
	public static final RegistryObject<Item> L_188 = block(SwitchotsCraftModBlocks.L_188);
	public static final RegistryObject<Item> L_189 = block(SwitchotsCraftModBlocks.L_189);
	public static final RegistryObject<Item> L_190 = block(SwitchotsCraftModBlocks.L_190);
	public static final RegistryObject<Item> L_191 = block(SwitchotsCraftModBlocks.L_191);
	public static final RegistryObject<Item> L_192 = block(SwitchotsCraftModBlocks.L_192);
	public static final RegistryObject<Item> L_193 = block(SwitchotsCraftModBlocks.L_193);
	public static final RegistryObject<Item> L_194 = block(SwitchotsCraftModBlocks.L_194);
	public static final RegistryObject<Item> L_195 = block(SwitchotsCraftModBlocks.L_195);
	public static final RegistryObject<Item> L_196 = block(SwitchotsCraftModBlocks.L_196);
	public static final RegistryObject<Item> L_197 = block(SwitchotsCraftModBlocks.L_197);
	public static final RegistryObject<Item> L_198 = block(SwitchotsCraftModBlocks.L_198);
	public static final RegistryObject<Item> L_199 = block(SwitchotsCraftModBlocks.L_199);
	public static final RegistryObject<Item> L_200 = block(SwitchotsCraftModBlocks.L_200);
	public static final RegistryObject<Item> P_1 = block(SwitchotsCraftModBlocks.P_1);
	public static final RegistryObject<Item> P_2 = block(SwitchotsCraftModBlocks.P_2);
	public static final RegistryObject<Item> P_3 = block(SwitchotsCraftModBlocks.P_3);
	public static final RegistryObject<Item> P_4 = block(SwitchotsCraftModBlocks.P_4);
	public static final RegistryObject<Item> P_5 = block(SwitchotsCraftModBlocks.P_5);
	public static final RegistryObject<Item> P_6 = block(SwitchotsCraftModBlocks.P_6);
	public static final RegistryObject<Item> P_7 = block(SwitchotsCraftModBlocks.P_7);
	public static final RegistryObject<Item> P_8 = block(SwitchotsCraftModBlocks.P_8);
	public static final RegistryObject<Item> P_9 = block(SwitchotsCraftModBlocks.P_9);
	public static final RegistryObject<Item> P_10 = block(SwitchotsCraftModBlocks.P_10);
	public static final RegistryObject<Item> P_11 = block(SwitchotsCraftModBlocks.P_11);
	public static final RegistryObject<Item> P_12 = block(SwitchotsCraftModBlocks.P_12);
	public static final RegistryObject<Item> P_13 = block(SwitchotsCraftModBlocks.P_13);
	public static final RegistryObject<Item> P_14 = block(SwitchotsCraftModBlocks.P_14);
	public static final RegistryObject<Item> P_15 = block(SwitchotsCraftModBlocks.P_15);
	public static final RegistryObject<Item> P_16 = block(SwitchotsCraftModBlocks.P_16);
	public static final RegistryObject<Item> P_17 = block(SwitchotsCraftModBlocks.P_17);
	public static final RegistryObject<Item> P_18 = block(SwitchotsCraftModBlocks.P_18);
	public static final RegistryObject<Item> P_19 = block(SwitchotsCraftModBlocks.P_19);
	public static final RegistryObject<Item> P_20 = block(SwitchotsCraftModBlocks.P_20);
	public static final RegistryObject<Item> P_21 = block(SwitchotsCraftModBlocks.P_21);
	public static final RegistryObject<Item> P_22 = block(SwitchotsCraftModBlocks.P_22);
	public static final RegistryObject<Item> P_23 = block(SwitchotsCraftModBlocks.P_23);
	public static final RegistryObject<Item> P_24 = block(SwitchotsCraftModBlocks.P_24);
	public static final RegistryObject<Item> P_25 = block(SwitchotsCraftModBlocks.P_25);
	public static final RegistryObject<Item> P_26 = block(SwitchotsCraftModBlocks.P_26);
	public static final RegistryObject<Item> P_27 = block(SwitchotsCraftModBlocks.P_27);
	public static final RegistryObject<Item> P_28 = block(SwitchotsCraftModBlocks.P_28);
	public static final RegistryObject<Item> P_29 = block(SwitchotsCraftModBlocks.P_29);
	public static final RegistryObject<Item> P_30 = block(SwitchotsCraftModBlocks.P_30);
	public static final RegistryObject<Item> P_31 = block(SwitchotsCraftModBlocks.P_31);
	public static final RegistryObject<Item> P_32 = block(SwitchotsCraftModBlocks.P_32);
	public static final RegistryObject<Item> P_33 = block(SwitchotsCraftModBlocks.P_33);
	public static final RegistryObject<Item> P_34 = block(SwitchotsCraftModBlocks.P_34);
	public static final RegistryObject<Item> P_35 = block(SwitchotsCraftModBlocks.P_35);
	public static final RegistryObject<Item> P_36 = block(SwitchotsCraftModBlocks.P_36);
	public static final RegistryObject<Item> P_37 = block(SwitchotsCraftModBlocks.P_37);
	public static final RegistryObject<Item> P_38 = block(SwitchotsCraftModBlocks.P_38);
	public static final RegistryObject<Item> P_39 = block(SwitchotsCraftModBlocks.P_39);
	public static final RegistryObject<Item> P_40 = block(SwitchotsCraftModBlocks.P_40);
	public static final RegistryObject<Item> P_41 = block(SwitchotsCraftModBlocks.P_41);
	public static final RegistryObject<Item> P_42 = block(SwitchotsCraftModBlocks.P_42);
	public static final RegistryObject<Item> P_43 = block(SwitchotsCraftModBlocks.P_43);
	public static final RegistryObject<Item> P_44 = block(SwitchotsCraftModBlocks.P_44);
	public static final RegistryObject<Item> P_45 = block(SwitchotsCraftModBlocks.P_45);
	public static final RegistryObject<Item> P_46 = block(SwitchotsCraftModBlocks.P_46);
	public static final RegistryObject<Item> P_47 = block(SwitchotsCraftModBlocks.P_47);
	public static final RegistryObject<Item> P_48 = block(SwitchotsCraftModBlocks.P_48);
	public static final RegistryObject<Item> P_49 = block(SwitchotsCraftModBlocks.P_49);
	public static final RegistryObject<Item> P_50 = block(SwitchotsCraftModBlocks.P_50);
	public static final RegistryObject<Item> P_51 = block(SwitchotsCraftModBlocks.P_51);
	public static final RegistryObject<Item> P_52 = block(SwitchotsCraftModBlocks.P_52);
	public static final RegistryObject<Item> P_53 = block(SwitchotsCraftModBlocks.P_53);
	public static final RegistryObject<Item> P_54 = block(SwitchotsCraftModBlocks.P_54);
	public static final RegistryObject<Item> P_55 = block(SwitchotsCraftModBlocks.P_55);
	public static final RegistryObject<Item> P_56 = block(SwitchotsCraftModBlocks.P_56);
	public static final RegistryObject<Item> P_57 = block(SwitchotsCraftModBlocks.P_57);
	public static final RegistryObject<Item> P_58 = block(SwitchotsCraftModBlocks.P_58);
	public static final RegistryObject<Item> P_59 = block(SwitchotsCraftModBlocks.P_59);
	public static final RegistryObject<Item> P_60 = block(SwitchotsCraftModBlocks.P_60);
	public static final RegistryObject<Item> P_61 = block(SwitchotsCraftModBlocks.P_61);
	public static final RegistryObject<Item> P_62 = block(SwitchotsCraftModBlocks.P_62);
	public static final RegistryObject<Item> P_63 = block(SwitchotsCraftModBlocks.P_63);
	public static final RegistryObject<Item> P_64 = block(SwitchotsCraftModBlocks.P_64);
	public static final RegistryObject<Item> P_65 = block(SwitchotsCraftModBlocks.P_65);
	public static final RegistryObject<Item> P_66 = block(SwitchotsCraftModBlocks.P_66);
	public static final RegistryObject<Item> P_67 = block(SwitchotsCraftModBlocks.P_67);
	public static final RegistryObject<Item> P_68 = block(SwitchotsCraftModBlocks.P_68);
	public static final RegistryObject<Item> P_69 = block(SwitchotsCraftModBlocks.P_69);
	public static final RegistryObject<Item> P_70 = block(SwitchotsCraftModBlocks.P_70);
	public static final RegistryObject<Item> P_71 = block(SwitchotsCraftModBlocks.P_71);
	public static final RegistryObject<Item> P_72 = block(SwitchotsCraftModBlocks.P_72);
	public static final RegistryObject<Item> P_73 = block(SwitchotsCraftModBlocks.P_73);
	public static final RegistryObject<Item> P_74 = block(SwitchotsCraftModBlocks.P_74);
	public static final RegistryObject<Item> P_75 = block(SwitchotsCraftModBlocks.P_75);
	public static final RegistryObject<Item> P_76 = block(SwitchotsCraftModBlocks.P_76);
	public static final RegistryObject<Item> P_77 = block(SwitchotsCraftModBlocks.P_77);
	public static final RegistryObject<Item> P_78 = block(SwitchotsCraftModBlocks.P_78);
	public static final RegistryObject<Item> P_79 = block(SwitchotsCraftModBlocks.P_79);
	public static final RegistryObject<Item> P_80 = block(SwitchotsCraftModBlocks.P_80);
	public static final RegistryObject<Item> P_81 = block(SwitchotsCraftModBlocks.P_81);
	public static final RegistryObject<Item> P_82 = block(SwitchotsCraftModBlocks.P_82);
	public static final RegistryObject<Item> P_83 = block(SwitchotsCraftModBlocks.P_83);
	public static final RegistryObject<Item> P_84 = block(SwitchotsCraftModBlocks.P_84);
	public static final RegistryObject<Item> P_85 = block(SwitchotsCraftModBlocks.P_85);
	public static final RegistryObject<Item> P_86 = block(SwitchotsCraftModBlocks.P_86);
	public static final RegistryObject<Item> P_87 = block(SwitchotsCraftModBlocks.P_87);
	public static final RegistryObject<Item> P_88 = block(SwitchotsCraftModBlocks.P_88);
	public static final RegistryObject<Item> P_89 = block(SwitchotsCraftModBlocks.P_89);
	public static final RegistryObject<Item> P_90 = block(SwitchotsCraftModBlocks.P_90);
	public static final RegistryObject<Item> P_91 = block(SwitchotsCraftModBlocks.P_91);
	public static final RegistryObject<Item> P_92 = block(SwitchotsCraftModBlocks.P_92);
	public static final RegistryObject<Item> P_93 = block(SwitchotsCraftModBlocks.P_93);
	public static final RegistryObject<Item> P_94 = block(SwitchotsCraftModBlocks.P_94);
	public static final RegistryObject<Item> P_95 = block(SwitchotsCraftModBlocks.P_95);
	public static final RegistryObject<Item> P_96 = block(SwitchotsCraftModBlocks.P_96);
	public static final RegistryObject<Item> P_97 = block(SwitchotsCraftModBlocks.P_97);
	public static final RegistryObject<Item> P_98 = block(SwitchotsCraftModBlocks.P_98);
	public static final RegistryObject<Item> P_99 = block(SwitchotsCraftModBlocks.P_99);
	public static final RegistryObject<Item> P_100 = block(SwitchotsCraftModBlocks.P_100);
	public static final RegistryObject<Item> CL_2 = block(SwitchotsCraftModBlocks.CL_2);
	public static final RegistryObject<Item> CL_3 = block(SwitchotsCraftModBlocks.CL_3);
	public static final RegistryObject<Item> CL_4 = block(SwitchotsCraftModBlocks.CL_4);
	public static final RegistryObject<Item> CL_5 = block(SwitchotsCraftModBlocks.CL_5);
	public static final RegistryObject<Item> CL_6 = block(SwitchotsCraftModBlocks.CL_6);
	public static final RegistryObject<Item> CL_7 = block(SwitchotsCraftModBlocks.CL_7);
	public static final RegistryObject<Item> CL_8 = block(SwitchotsCraftModBlocks.CL_8);
	public static final RegistryObject<Item> CL_9 = block(SwitchotsCraftModBlocks.CL_9);
	public static final RegistryObject<Item> CL_10 = block(SwitchotsCraftModBlocks.CL_10);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}