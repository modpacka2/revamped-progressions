
package net.mcreator.switchotscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BigfiberItem extends Item {
	public BigfiberItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
