package bai_tap_word;

import java.util.Scanner;

public class Quanlynhanvien {
    int age;
    String name, address, gender;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("vui lòng nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("vui lòng nhâp giới tính: ");
        gender = sc.nextLine();
        System.out.print("vui lòng nhập địa chỉ: ");
        address = sc.nextLine();
    }
    void output(){
        System.out.println("họ và tên: "+name);
        System.out.println("tuổi: "+age);
        System.out.println("giới tính: "+gender);
        System.out.println("địa chỉ: "+address);
    }
}
class congnhan{
    int level;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập bậc: ");
        level = sc.nextInt();
    }
    void output(){
        System.out.println("bậc: "+level);
    }
}
class kysu{
    String nganh;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập ngành đào tạo: ");
        nganh = sc.nextLine();
    }
    void output(){
        System.out.println("ngành đào tạo: "+nganh);
    }
}
class staff{
    String job;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui lòng nhập công việc: ");
        job = sc.next();
    }
    void output(){
        System.out.println("công việc: "+job);
    }
}
class quanlycanbo{
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.GỌI CÔNG NHÂN");
        System.out.println("2.GỌI KĨ SƯ");
        System.out.println("3.GỌI NHÂN VIÊN");
        System.out.println("0.THOÁT");
        System.out.print("vui lòng nhập số: ");
        chon = sc.nextInt();

        switch(chon){
            case 0:
                System.out.println("HỦY CHỌN");
                break;
            case 1:
                Quanlynhanvien ql = new Quanlynhanvien();
                ql.input();
                congnhan cn = new congnhan();
                cn.input();
                System.out.println("CÔNG NHÂN");
                ql.output();
                cn.output();
                break;
            case 2:
                Quanlynhanvien ql1 = new Quanlynhanvien();
                ql1.input();
                kysu ks = new kysu();
                ks.input();
                System.out.println("KỸ SƯ");
                ql1.output();
                ks.output();
                break;
            case 3:
                Quanlynhanvien ql2 = new Quanlynhanvien();
                ql2.input();
                staff st = new staff();
                st.input();
                System.out.println("NHÂN VIÊN");
                ql2.output();
                st.output();
                break;
        }
    }
}