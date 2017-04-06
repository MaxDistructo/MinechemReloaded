package minechemreborn.item;


import net.minecraft.util.IStringSerializable;

public class EnumHandler {
    public enum Chemicals implements IStringSerializable{
        EMPTY("empty",0),
        H("hydrogen",1),
        HE("helium",2),
        LI("lithium",3),
        BE("berilium",4),
        B("boron",5),
        C("carbon",6),
        N("nitrogen",7),
        O("oxygen",8),
        F("fluoride",9),
        NE("neon",10),
        NA("sodium",11),
        MG("magnisium",12),
        AL("aluminum",13),
        SI("silicon",14),
        P("phosphorus",15),
        S("sulfer",16),
        CL("chlorine",17),
        K("potassium",19),
        CA("calcium",20),
        TI("titanium",22),
        CR("chromium",24),
        FE("iron",26),
        CO("cobalt",27),
        NI("nickel",28),
        CU("copper",29),
        ZN("zinc",30),
        AG("silver",47),
        SN("tin",50),
        OS("osmium",76),
        PT("platinum",78),
        AU("gold",79),
        PB("lead",82),
        U("uranium",92)
        ;
        
        


        private int ID;
        private String name;

       Chemicals(String name, int ID) {
             this.name = name;
             this.ID = ID;


         }

    @Override
        public String toString(){
            return getName();
        }
    @Override
        public String getName(){
        return this.name;
    }
    public int getID(){
            return ID;
        }
    }


}
