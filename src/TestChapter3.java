public class TestChapter3 {
    public static void main(String[] args) {
//        bt1();
//        bt2();
//        bt3();
//        bt5();
//        bt6();
//        bt7();
//        bt10();
//        bt12();
//        bt14();
    }

    public static void bt1() {
        int x = 100;
        if (x == 100) {
            boolean var1 = false;
        }

    }

    public static void bt2() {
        int y = 10;
        boolean x;
        if (y == 10) {
            x = false;
        } else {
            x = true;
        }

    }

    public static void bt3() {
        int sales = 10000;
        if (sales == 10000) {
            System.out.println("thì CommissionRate = 0.10");
        } else if (sales <= 15000) {
            System.out.println("thì CommissionRate = 0.15");
        } else if (sales > 15000) {
            System.out.println("thì CommissionRate =0.20");
        }

    }

    public static void bt5() {
        int one = 15;
        int two = 105;
        if (one > 10) {
            System.out.println(one);
        } else if (one < 10) {
            System.out.println(10);
        }

        if (two > 100) {
            System.out.println(two);
        } else if (two < 100) {
            System.out.println(100);
        }

    }

    public static void bt6() {
        int a = 68;
        if (a >= 0 && a <= 100) {
            System.out.println("“The number is valid");
        } else {
            System.out.println("“The number isn't valid");
        }

    }

    public static void bt7() {
        int a = 68;
        if (a >= -50 && a <= 150) {
            System.out.println("The number is valid");
        } else {
            System.out.println("The number isn't valid");
        }

    }

    public static void bt10() {
        int number = 3;
        switch (number) {
            case 1:
                System.out.println("bạn đã chọn 1");
                break;
            case 2:
                System.out.println("bạn đã chọn 2");
                break;
            case 3:
                System.out.println("bạn đã chọn 3");
                break;
            default:
                System.out.println("xin vui lòng chọn lại");
        }

    }

    public static void bt12() {
        double number = 12345.56789;
        if (number == 12345.56789) {
            System.out.println(12345.7);
        } else {
            System.out.println("ko hiện gì cả");
        }

    }

    public static void bt14() {
        int number = 1234567;
        if (number == 1234567) {
            System.out.println("12345.7");
        } else {
            System.out.println("ko hiện gì cả");
        }

    }
}





