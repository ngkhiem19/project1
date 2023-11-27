package bai_tap_word;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quanlykhachsan{
    /*
   bài tập quản lý khách sạn
     */
}
class Nguoi{
    String name;
    int age;
    long cccd;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("nhập số cccd: ");
        cccd = sc.nextLong();
    }
    void output(){
        System.out.println("họ và tên: "+name);
        System.out.println("tuổi: "+age);
        System.out.println("số cccd: "+cccd);
    }
}
class Hotel{
    public static void main(String[] args) {
    int A = 500;
    int B = 300;
    int C = 100;
    int phong, ngay;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.HỦY CHỌN");
        System.out.println("1.PHÒNG A");
        System.out.println("2.PHÒNG B");
        System.out.println("3.PHÒNG C");
        System.out.print("mời bạn chọn: ");
        phong = sc.nextInt();

        switch(phong){
            case 0:
                System.out.println("HỦY CHỌN");
                break;
            case 1:
                System.out.println("PHÒNG A");
                System.out.println("--------------------------------");
                System.out.println("MỜI BẠN NHẬP THÔNG TỊN");
                Nguoi ng = new Nguoi();
                ng.input();
                System.out.print("mời bạn chọn ngày thuê: ");
                ngay = sc.nextInt();
                System.out.println("--------------------------------");
                System.out.println("PHÒNG A");
                ng.output();
                System.out.println("số tiền bạn phải thanh toán là: "+(A*ngay)+"$");
                break;
            case 2:
                System.out.println("PHÒNG B");
                System.out.println("--------------------------------");
                System.out.println("MỜI BẠN NHẬP THÔNG TỊN");
                Nguoi ng1 = new Nguoi();
                ng1.input();
                System.out.print("mời bạn chọn ngày thuê: ");
                ngay = sc.nextInt();
                System.out.println("--------------------------------");
                System.out.println("PHÒNG B");
                ng1.output();
                System.out.println("số tiền bạn phải thanh toán là: "+(B*ngay)+"$");
                break;
            case 3:
                System.out.println("PHÒNG C");
                System.out.println("--------------------------------");
                System.out.println("MỜI BẠN NHẬP THÔNG TỊN");
                Nguoi ng2 = new Nguoi();
                ng2.input();
                System.out.print("mời bạn chọn ngày thuê: ");
                ngay = sc.nextInt();
                System.out.println("--------------------------------");
                System.out.println("PHÒNG C");
                ng2.output();
                System.out.println("số tiền bạn phải thanh toán là: "+(C*ngay)+"$");
                break;
        }
    }
}