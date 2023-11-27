package bai_tap_word;
import java.util.Scanner;

public class Quanlythuvien {
    int mtl, number;
    String nxb;
    void input(){
//        int mtl, number;
//        String nxb;
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập mã tài liệu: ");
        mtl = Integer.parseInt(sc.nextLine());
        System.out.print("vui lóng nhập số bản phát hành: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập nhà xuất bản: ");
        nxb = sc.nextLine();
    }
    void output(){
        System.out.println("mã tài liệu: " + mtl);
        System.out.println("số bản phát hành: " + number);
        System.out.println("nhà xuất bản: " + nxb);
    }
}

class sach{
    int soTrang;
    String tenTG;

    void input() {
//        int soTrang;
//        String tenTG;
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập số trang: ");
        soTrang = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập tên tác giả: ");
        tenTG = sc.nextLine();
    }

    void output() {
        System.out.println("số trang: "+soTrang);
        System.out.println("tên tác giả: "+tenTG);
    }
}
class tapchi{
    int sph, tph;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập số phát hành: ");
        sph = sc.nextInt();
        System.out.print("vui lòng nhập tháng phát hành: ");
        tph = sc.nextInt();
    }
    void output(){
        System.out.println("số phát hành: "+sph);
        System.out.println("tháng phát hành: "+tph);
    }
}
class bao{
    int nph;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập ngày phát hành: ");
    }
    void output(){
        System.out.println("ngày phát hành: "+nph);
    }
}
class quanlytailieu{
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.ĐỂ THOÁT");
        System.out.println("1.SÁCH");
        System.out.println("2.TẠP CHÍ");
        System.out.println("3.BÁO");
        System.out.print("vui lòng chọn: ");
        chon = sc.nextInt();

        switch(chon){
            case 0:
                System.out.println("HỦY CHỌN");
                break;
            case 1:
                Quanlythuvien ql = new Quanlythuvien();
                ql.input();
                sach s1 = new sach();
                s1.input();
                System.out.println("SÁCH");
                ql.output();
                s1.output();
                break;
            case 2:
                Quanlythuvien ql1 = new Quanlythuvien();
                ql1.input();
                tapchi tc = new tapchi();
                tc.input();
                System.out.println("TẠP CHÍ");
                ql1.output();
                tc.output();
                break;
            case 3:
                Quanlythuvien ql2 = new Quanlythuvien();
                ql2.input();
                bao b = new bao();
                b.input();
                System.out.println("BÁO");
                ql2.output();
                b.output();
                break;
        }
    }
}

