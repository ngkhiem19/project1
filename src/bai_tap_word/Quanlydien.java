package bai_tap_word;

import java.util.Scanner;

public class Quanlydien {
    int sodien;
    String name, address;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("vui lòng nhập mã số điện: ");
        sodien = Integer.parseInt(sc.nextLine());
    }
    void output(){
        System.out.println("họ và tên: "+name);
        System.out.println("địa chỉ: "+address);
        System.out.println("mã số điện: "+sodien);
    }
}
class Bienlai{
    public static void main(String[] args) {
        int dienmoi = 200;
        int diencu = 180;

        Quanlydien ql = new Quanlydien();
        ql.input();
        System.out.println("BIÊN LAI ĐIỆN");
        ql.output();
        System.out.println("TỔNG HÓA ĐƠN = "+(dienmoi - diencu)*5);
    }
}
