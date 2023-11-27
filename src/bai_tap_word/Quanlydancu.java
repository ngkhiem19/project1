package bai_tap_word;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Quanlydancu {
    String address;
    int member;
    //hộ gia đình
        void input(){

            Scanner sc = new Scanner(System.in);
            System.out.print("vui lòng nhập số thành viên trong gia đình: ");
            member = Integer.parseInt(sc.nextLine());
            System.out.print("vui lòng nhập địa chỉ: ");
            address = sc.nextLine();
        }
        void output(){
            System.out.println("số thành viên trong gia đình: "+member);
            System.out.println("địa chỉ: "+address);
        }
}
class People{
    int age, cmnd;
    String name, profession;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập họ và tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập số cmnd: ");
        cmnd = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhập công việc: ");
        profession = sc.nextLine();
    }
    void output(){
        System.out.println("họ và tên: "+name);
        System.out.println("tuổi: "+age);
        System.out.println("số cmnd: "+cmnd);
        System.out.println("công việc: "+profession);
    }
}
class Khupho{
    void family() {
        int chon;
        Scanner sc = new Scanner(System.in);

        chon = sc.nextInt();

        switch(chon){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
