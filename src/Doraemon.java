public class Doraemon {
    int soBaoBoi;
    String shape;
    String bestfriend;

    Doraemon( int soBaoBoi, String shape, String bestfriend){
        this.soBaoBoi= soBaoBoi;
        this.shape= shape;
        this.bestfriend= bestfriend;
    }
    void bb(){
        System.out.println("số bảo bối của Doraemon là: "+soBaoBoi);
    }
    void sbb(){
        this.soBaoBoi=soBaoBoi - 1;
        System.out.println("sau khi lấy 1 bảo bối ra thì còn "+soBaoBoi+" bảo bối");
    }
    void hinhdang(){
        System.out.println("đặc điểm nhận dạng doraemon: "+shape);
    }
    void bff(){
        System.out.println("bạn thân của Doraemon là: "+bestfriend);
    }

    public static void main(String[] args) {
        Doraemon dr = new Doraemon(1000,"xanh, mập, lùn","Nobita");
        dr.bb();
        dr.sbb();
        dr.hinhdang();
        dr.bff();
    }


}
