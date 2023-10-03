import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
//        bt1();
//        bt3();
//        bt4();
//        bt5();
//          bt8();
        bt2();
    }


    public static void bt4(){
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" ******");
        System.out.println("********");
        System.out.println(" ******");
        System.out.println("  ***");
        System.out.println("   *");
    }

    public static void bt1(){
        Scanner bai1 = new Scanner(System.in);
        String name;
        int age;
        double annualPay;
        System.out.println("họ tên");
        name = bai1.nextLine();
        System.out.print("tuổi");
        age = bai1.nextInt();
        System.out.print("thu nhập");
        annualPay = bai1.nextDouble();

        System.out.println("tên tôi là "+name);
        System.out.println("tuổi của tôi "+age);
        System.out.println("thu nhập mong muốn "+annualPay);
    }
    public static void bt3(){
        System.out.println("Nguyễn Gia Khiêm \n 948/62 lê đức thọ, gò vấp \n 0901801906 \n cntt");
    }
    public static void bt5(){
        int i = 4600000;
        float f = 0.62f;
        float present;


    }
    public static void bt8(){
       Scanner bt8 = new Scanner(System.in);
        int cookie ;
        System.out.println("số bánh trong bịch");
        cookie = bt8.nextInt();
        float pack;
        System.out.println("ăn mấy phần phần bánh");
        pack = bt8.nextFloat();
        double kcal ;
        System.out.println("lượng kcal của 1 cái bánh");
        kcal = bt8.nextDouble();

        System.out.println("số phần đã ăn: "+pack);
        System.out.println("lượng kcal tiêu thụ: "+pack*kcal);



    }
    public static void bt2(){
       Scanner sc = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        char firstInitial;
        char middleInitial;
        char lastInitial;
        System.out.print("vui lòng nhập họ");
        firstName=sc.nextLine();

        System.out.print("vui lòng nhập tên đệm");
        middleName=sc.nextLine();

        System.out.print("vui lòng nhập tên");
        lastName=sc.nextLine();

        System.out.print("vui lòng nhập chữ đầu họ");
        firstInitial=sc.next().charAt(0);

        System.out.print("vui lòng nhập chữ đầu tên đệm");
        middleInitial=sc.next().charAt(0);

        System.out.print("vui lòng nhập chữ đầu họ");
        lastInitial=sc.next().charAt(0);

        System.out.println("họ và tên: "+firstName+ middleName+ lastName);
        System.out.println("tên viết tắt: "+firstInitial+ middleInitial+ lastInitial);

    }
}
