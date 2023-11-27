package bai_tap_word;

import java.util.Scanner;

public class Quanlyxe {
    int id;
    String gia, brand, color, nsx;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập ngày sản xuất: ");
        nsx = sc.nextLine();
        System.out.print("vui lòng nhập giá bán: ");
        gia = sc.nextLine();
        System.out.print("vui lòng nhập hãng xe: ");
        brand = sc.nextLine();
        System.out.print("vui lòng nhập màu xe: ");
        color = sc.nextLine();
    }
    void output(){
        System.out.println("ID: "+id);
        System.out.println("ngày sản xuất: "+nsx);
        System.out.println("giá bán: "+gia);
        System.out.println("hãng xe: "+brand);
        System.out.println("màu xe: "+color);
    }
}
class oto{
    int slot;
    String engine;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập chỗ ngồi: ");
        slot = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập kiểu động cơ: ");
        engine = sc.nextLine();
    }
    void output(){
        System.out.println("chỗ ngồi: "+slot);
        System.out.println("kiểu động cơ: "+engine);
    }
}
class bike{
    String cc;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập phân khối xe: ");
        cc = sc.nextLine();
    }
    void output(){
        System.out.println("phân khối xe: "+cc);
    }
}
class truck{
    String payload;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập trọng tải: ");
        payload = sc.nextLine();
    }
    void output(){
        System.out.println("trong tải: "+payload);
    }
}
class Quanlyphuongtien{
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.thoát");
        System.out.println("1.oto");
        System.out.println("2.bike");
        System.out.println("3.truck");
        System.out.print("mời bạn chọn: ");
        chon = sc.nextInt();

        switch(chon){
            case 0:
                System.out.println("THOÁT");
                break;
            case 1:
                Quanlyxe ql = new Quanlyxe();
                ql.input();
                oto o = new oto();
                o.input();
                System.out.println("--------------------");
                ql.output();
                o.output();
                break;
            case 2:
                Quanlyxe ql1 = new Quanlyxe();
                ql1.input();
                bike b = new bike();
                b.input();
                System.out.println("--------------------");
                ql1.output();
                b.output();
                break;
            case 3:
                Quanlyxe ql2 = new Quanlyxe();
                ql2.input();
                truck t = new truck();
                t.input();
                System.out.println("--------------------");
                ql2.output();
                t.output();
                break;
        }

    }
}