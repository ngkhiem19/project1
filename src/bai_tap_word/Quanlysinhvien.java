package bai_tap_word;

import java.util.Scanner;

public class Quanlysinhvien {
    int number, level;
    String name, address;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập số báo danh: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("vui lòng nhập mức ưu tiên: ");
        level = Integer.parseInt(sc.nextLine());
    }
    void output(){
        System.out.println("họ và tên: "+name);
        System.out.println("số báo danh: "+number);
        System.out.println("dịa chỉ: "+address);
        System.out.println("mức ưu tiên: "+level);
    }
}
class quanlydaihoc{
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.THOÁT");
        System.out.println("1.KHỐI A");
        System.out.println("2.KHỐI B");
        System.out.println("3.KHỐI C");
        System.out.print("mời bạn chọn: ");
        chon = sc.nextInt();

        switch(chon){
            case 0:
                System.out.println("THOÁT");
                break;
            case 1:
                System.out.println("TOÁN, LÝ, HÓA");
                break;
            case 2:
                System.out.println("TÓAN, HÓA, SINH");
                break;
            case 3:
                System.out.println("VĂN, SỬ, ĐỊA");
                break;
        }
    }
}