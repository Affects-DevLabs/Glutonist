package fr.hyzoox.Glutonist.utils;

import fr.hyzoox.Glutonist.GLMain;
import fr.hyzoox.Glutonist.items.ItemBase;
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

