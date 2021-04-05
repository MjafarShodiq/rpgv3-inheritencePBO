import java.util.ArrayList;

//class NPC menjadi turunan dari class Karakter
public class NPC extends Karakter{
    //kunci dipindahkan dari ruangan
    //private Item  objKunci; diganti menjadi objItemAwal di class Karakter
    private ArrayList<String> arrAksi = new ArrayList<>();
    //private GameInfo objGameInfo; tidak digunakan karena atribut sudah ada di class Karakter
    private boolean isKenal = false;

    public NPC() {
        //init kunci
        objItemAwal = new Item("Kunci");
        objItemAwal.setDeskripsi("Sebuah kunci kecil yang sudah agak berkarat");

        //aksi npc
        arrAksi.add("Perkenalan dgn NPC");
        arrAksi.add("Minta kunci");

    }

    public void prosesAksi(int subPil) {
        //1: perkenalan dengan npc
        //2: buka pintu
        if (subPil == 1) {
            System.out.println("Halo saya penjaga pintu ini");
            isKenal = true;
        } else if (subPil == 2) {
            if (isKenal) {
                //berikan kunci pada player
                if (objItemAwal==null) {
                    System.out.println("Masa lupa, kunci kan sudah saya berikan!");
                } else
                {
                    System.out.println("Kunci diberikan pada player");
                    objGameInfo.getObjPlayer().addItem(objItemAwal);     //tambahkan  objek ini pada player
                    objItemAwal = null;
                }

            } else {
                System.out.println("Siapa anda? kenalan dulu dong");
            }
        }
    }

    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
        objItemAwal.setObjGameInfo(objGameInfo);
    }

    public ArrayList<String> getAksi() {
        return arrAksi;
    }
}
