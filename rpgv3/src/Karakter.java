public class Karakter {
    protected GameInfo objGameInfo;
    protected Item objItemAwal;//untuk item default NPC dan player


    public GameInfo getObjGameInfo() {
        return objGameInfo;
    }

    public void setObjItemAwal(Item objItemAwal) {
        this.objItemAwal = objItemAwal;
    }
}
