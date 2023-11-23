
package net.mcreator.switchotscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BambooStickItem extends Item {
	public BambooStickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
