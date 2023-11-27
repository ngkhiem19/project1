package bai_tap_word;

import java.util.Scanner;

public class Quanlygiaovien {
    int age, mgv;
    String name, que;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập quê: ");
        que = sc.nextLine();
        System.out.print("vui lòng nhập mã gíao viên: ");
        mgv = Integer.parseInt(sc.nextLine());
    }
    void output(){
        System.out.println("họ và tên: "+ name);
        System.out.println("tuổi: "+age);
        System.out.println("quê quán: "+que);
        System.out.println("mã giáo viên: "+mgv);
    }
}
class luong{
    public static void main(String[] args) {
        int luong = 8000;
        int phat = 100;
        int thuong = 50;
        int gvien = 0;
        int tre = phat;
        int chuyen = thuong;
        Scanner sc = new Scanner(System.in);

        switch(gvien){
            case 0:
                Quanlygiaovien ql1 = new Quanlygiaovien();
                ql1.input();
                System.out.print("vui lòng nhập ngày đi trễ: ");
                tre = sc.nextInt();
                System.out.print("vui lòng số chuyên cần: ");
                chuyen = sc.nextInt();
                System.out.println("-----------------------");
                ql1.output();
                System.out.println("tiền lương: "+(luong + chuyen - tre));
            case 1:
                Quanlygiaovien ql2 = new Quanlygiaovien();
                ql2.input();
                System.out.print("vui lòng nhập ngày đi trễ: ");
                tre = sc.nextInt();
                System.out.print("vui lòng số chuyên cần: ");
                chuyen = sc.nextInt();
                System.out.println("-----------------------");
                ql2.output();
                System.out.println("tiền lương: "+(luong + chuyen - tre));
            case 2:
                Quanlygiaovien ql3 = new Quanlygiaovien();
                ql3.input();
                System.out.print("vui lòng nhập ngày đi trễ: ");
                tre = sc.nextInt();
                System.out.print("vui lòng số chuyên cần: ");
                chuyen = sc.nextInt();
                System.out.println("-----------------------");
                ql3.output();
                System.out.println("tiền lương: "+(luong + chuyen - tre));
        }
    }
}
