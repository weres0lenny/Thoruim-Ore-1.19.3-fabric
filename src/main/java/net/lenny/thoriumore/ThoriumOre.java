package net.lenny.thoriumore;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lenny.thoriumore.item.ModItemGroup;
import net.lenny.thoriumore.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.lenny.thoriumore.item.ModItems.CITRINE;

//very important comment
public class ThoriumOre implements ModInitializer {
	public static final String MOD_ID = "thoriumore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}
