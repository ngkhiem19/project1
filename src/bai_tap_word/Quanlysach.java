package bai_tap_word;

import java.util.Scanner;

public class Quanlysach {
    int age;
    String lop, name;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập lớp: ");
        lop = sc.nextLine();
    }
    void output(){
        System.out.println("họ và tên: "+name);
        System.out.println("tuổi: "+age);
        System.out.println("lớp: "+lop);
    }
}
class muonsach{
    public static void main(String[] args) {
        int chon, ngay;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.HỦY");
        System.out.println("1.SÁCH");
        System.out.println("2.TRUYỆN");
        System.out.println("3.SÁCH GIÁO KHOA");
        System.out.print("mời bạn chọn: ");
        chon = sc.nextInt();


        switch(chon){
            case 0:
                System.out.println("THOÁT CHƯƠNG TRìNH");
                break;
            case 1:
                Quanlysach ql = new Quanlysach();
                ql.input();
                System.out.print("vui lòng nhập ngày mượn: ");
                ngay = sc.nextInt();
                System.out.println("MƯỢN SÁCH");
                ql.output();
                System.out.println("số ngày mượn: "+ngay+" ngày");
                break;
            case 2:
                Quanlysach ql1 = new Quanlysach();
                ql1.input();
                System.out.print("vui lòng nhập ngày mượn: ");
                ngay = sc.nextInt();
                System.out.println("MƯỢN TRUYỆN");
                ql1.output();
                System.out.println("số ngày mượn: "+ngay+" ngày");
                break;
            case 3:
                Quanlysach ql2 = new Quanlysach();
                ql2.input();
                System.out.print("vui lòng nhập ngày mượn: ");
                ngay = sc.nextInt();
                System.out.println("MƯỢN SÁCH GIÁO KHOA");
                ql2.output();
                System.out.println("số ngày mượn: "+ngay+" ngày");
                break;
        }
    }
}
