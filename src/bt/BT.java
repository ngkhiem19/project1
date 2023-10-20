package bt;

import java.util.Arrays;
import java.util.Scanner;

public class BT {
    public BT() {
    }

    public void bt1() {
        int[] so = {1, 3, 5, 7, 9, 19, 6, 5, 4, 67, 1};
        int sum = 0;

//        for(int i = 0; i < so.length; i++){
//            so[i] = i + 5;
//        }
//        System.out.println(so[0]+" "+so[2]+" "+so[3]);


        for (int i = 2; i < so.length - 1; i++) {
//            so[i] = so[i] * 2;
            System.out.print(so[i] + " ");


//            if ((so[i] % 2) == 1) {
//                        so[i]=so[i] + 1;
//            }
        }
    }

    public void bt2() {
        int[] so = {1, 3, 5, 7, 9, 19, 6, 5, 4, 67, 1};
        int MAX = 0;
        for (int i = 0; i < so.length; i++) {
//          MAX = so[i];

            if (MAX < so[i]) {
                MAX = so[i];
            }

        }
        System.out.println(MAX);

    }

    public void bt3() {
        int[] so = {1, 3, 5, 7, 9, 19, 6, 5, 4, 67, 2};
        System.out.println(Arrays.toString(so));

        for (int i = 0, j = so.length - 1; i < j; i++, j--) {
            int temp = so[i];
            so[i] = so[j];
            so[j] = temp;
        }
        System.out.println(Arrays.toString(so));

    }

    public void bt4() {
        int[] so = {1, 3, 5, 9, 6, 7, 8};
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("nhập số cần tìm trong mảng: ");
        a = sc.nextInt();

        for (int i = 0; i < so.length; i++) {
            if (a == so[i]) {
                System.out.println("năm ở vị trí số: " + (i + 1));
            }
        }

    }

    public void bt5() {
        int[] list = {1, 3, 5, 4, 6, 7, 11, 10};

        Scanner sc = new Scanner(System.in);
        int a;
//
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                System.out.print(list[i] + " ");
            }
        }
    }

    public void bt6() {
        int[] so = {1, 3, 2, 3, 6, 9, 6, 7};
        System.out.println("các phần tử trùng lặp nhau: ");
        for (int i = 0; i < so.length; i++) {
            for (int j = i + 1; j < so.length; j++) {
                if (so[i] == so[j])
                    System.out.println(so[i]);
            }
        }
    }

    public void bt9() {
        int[] so = {1, 3, 5, 7, 9, 19, 6, 5, 4, 67, 2};
        for (int i = 0; i < so.length; i++) {
            for (int j = i + 1; j < so.length - 2; j++)
                if (so[i] < so[j]) {
                    int temp = so[i];
                    so[i] = so[j];
                    so[j] = temp;
                }
            System.out.println("phần tử lớn thứ 2 là: " + so[i]);
            return;

        }
    }

    public void bt7() {
        int[] so = {1, 3, 2, 3, 6, 9, 6, 7};
        int sum = 0;
        for (int i = 0; i < so.length; i++) {
            sum = sum + so[i];
        }
        System.out.println(sum / so.length);
    }

    public void bt8() {
        int[] so = {1, 3, 5, 7, 9, 19, 6, 4, 5, 67, 2};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter a: ");
//        int a = sc.nextInt();
        int count = 0;

        for (int i = 0; i < so.length; i++) {
            for (int j = i + 1; j < so.length; j++) {
                count = so[i];
                if (so[i] == so[j])
                    System.out.println("giá trị trùng lặp "+so[i]);

            }
//            System.out.println("giá trị ");
            System.out.println("giá trị "+ so[i] + " xuất hiện "+ count +" lần");
        }

    }
}