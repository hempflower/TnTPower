package cn.i_creator.tntpower;





import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.lwjgl.Sys;

@Mod(modid = Tntserver.MODID, version = Tntserver.VERSION,serverSideOnly=false)

public class Tntserver {
    public static final String MODID = "tntpower";
    public static final String VERSION = "1.0.0";
    @Mod.EventHandler
    public void FMLPostInitializationEvent(FMLPostInitializationEvent ev){
        System.out.println("===========TntServer===============");
        System.out.println("Start loading plugin.");

    }

}
