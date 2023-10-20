public class Spd {
    int so_nhac_cu;
    String name_nhac_cu;

    Spd(int so_nhac_cu, String name_nhac_cu ){
        this.so_nhac_cu= so_nhac_cu;
        this.name_nhac_cu= name_nhac_cu;

    }

    void soluong(){
        System.out.println("số lượng nhạc cụ cần thiết: "+so_nhac_cu);
    }
    void nhaccu(){
        System.out.println("nhạc cụ cần chuẩn bị: "+name_nhac_cu);
    }

    public static void main(String[] args) {
        Spd nc = new Spd(8,"guitar, keyboard, spd, bass, cello, violin, percurstion, sax");
        nc.soluong();
        nc.nhaccu();


      int i;
        for(i = 0; i <= 10; i++) {
            System.out.print(i);
        }
    }
}
