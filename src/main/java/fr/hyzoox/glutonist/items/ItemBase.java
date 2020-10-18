package fr.hyzoox.glutonist.items;

import fr.hyzoox.glutonist.GLMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(GLMain.TAB));
    }
}
