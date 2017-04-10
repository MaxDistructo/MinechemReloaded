package minechemreborn;

import minechemreborn.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Main.MODID, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.10.2]")
public class Main {
    public static final String MODID = "minechem";
    public static final String name = "Minechem Reborn";
    public static final String version = "0.0.1";
    public static final String chemicalsString[] = {"h","he","li","be","b","c","n","o","f","ne","na","mg","al","si","p","s","cl","ar","k","ca","sc","ti","v","cr","mn","fe","co","ni","cu","zn","ga","ge","as","se","br","kr","rb","sr","y","zr","nb","mo","tc","ru","rh","pd","ag","cd","in","sn","sb","te","i","xe","cs","ba","hf","ta","w","re","os","ir","pt","au","hg","ti","pb","bi","po","at","rn","fr","ra","la","ce","pr","nd","pm","sm","eu","gd","tb","dy","ho","er","tm","yb","lu","ac","th","pa","u","np","pu","am","cm","bk","cf","es","fm","md","no","lr"};
    public static final String chemicalsNeeded[] = {"h","he","li","be","b","c","n","o","f","ne","na","mg","al","si","p","s","cl","k","ca","ti","cr","fe","co","ni","cu","zn","ag","sn","os","pt","au","pb","u"};

    @Mod.Instance(MODID)
    public static Main instance;

    @SidedProxy(serverSide = "minechemreborn.proxy.CommonProxy", clientSide = "minechemreborn.proxy.ClientProxy")
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        System.out.println(name + " is loading!");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
