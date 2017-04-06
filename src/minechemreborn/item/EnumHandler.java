package minechemreborn.item;


import net.minecraft.util.IStringSerializable;

class EnumHandler {
    public enum Chemicals implements IStringSerializable{
        EMPTY("empty",0),
        CARBON("carbon",1);


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
