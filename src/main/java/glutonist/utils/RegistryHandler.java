package fr.hyzoox.glutonist.utils;

import fr.hyzoox.glutonist.GLMain;
import fr.hyzoox.glutonist.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GLMain.MODID);

//RegistryInit
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", ItemBase::new);

}

