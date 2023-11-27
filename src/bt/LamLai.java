package bt;

import java.util.Arrays;
import java.util.Scanner;

public class LamLai {
        public void bt1(){
            int [] so = {1, 4, 6, 8, 10};
            int sum = 0;

            for(int i = 0; i < so.length; i++){
                sum = sum + so[i];
            }
            System.out.println(sum);
        }
        public void bt2(){
            int [] so = {1, 4, 6, 8, 10, 99, 101, 34, 11, 19};
            int MAX = 0;
                for(int i = 0; i < so.length; i++){
                    if(MAX < so[i]){
                        MAX = so[i];
                    }
                }
            System.out.println(MAX);
        }

        public void bt3(){
            int [] so = {1, 4, 6, 8, 10, 100, 25};


            for(int i = 0, j = so.length - 1; i < j; i++, j--){
                int temp = so[i];
                so[i] = so[j];
                so[j] = temp;
            }
            System.out.println(Arrays.toString(so));
        }

        public void bt4(){
            int [] so = {1, 4, 6, 8, 10, 100, 25};
            int a;
                Scanner sc = new Scanner(System.in);
                System.out.print("giá trị cần nhập: ");
                a = sc.nextInt();

                for(int i = 0 ; i < so.length - 1; i++){
                    if( a == so[i]){
                        System.out.println("giá trị nằm ở vị trí: "+(i+1));
                    }
                }
        }
        public void bt5() {
            int[] list = {1, 3, 5, 4, 6, 7, 11, 10};
//
//            Scanner sc = new Scanner(System.in);
//            int a;
//
            for (int i = 0; i < list.length; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] > list[j]) {
                        int temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
                System.out.print(list[i] + " ");
            }
        }
        public void bt6(){
            int[] so = {1, 3, 2, 3, 6, 9, 6, 7};

            for(int i = 0; i < so.length; i++){
                for(int j = i + 1; j < so.length; j++){
                    if(so[i] == so[j]){
                        System.out.println("số phần tử lặp lại trong mảng là: "+so[i]);
                    }
                }
            }
        }

        public void bt7(){
            int [] so = {1, 4, 6, 8, 10};
            int sum = 0;

            for(int i = 0; i < so.length; i++){
                sum = sum + so[i];
            }
            System.out.println(sum/so.length);
        }

        public void bt8() {
            int[] so = {1, 3, 2, 3, 6, 9, 6, 7, 3, 7, 9};

            for (int i = 0; i < so.length; i++) {
//                tạo biến lần
                int count = 1;
//                nếu so[i] khác -1 thì chạy tiếp không đếm số đã đi qua
                if (so[i] != -1) {
                    for (int j = i + 1; j < so.length; j++) {
                        if (so[i] == so[j]) {
                            so[j] = -1;
                            count++;
                        }
                    }
                    if(count > 1){
                        System.out.println("số phần tử lặp lại trong mảng là "+so[i]+" lặp lại "+count+" lần");
                    }
                }
            }
        }
        public void bt9(){
            int[] so = {1, 3, 5, 4, 6, 7, 11, 10, 100};
            for (int i = 0; i < so.length; i++) {
                for (int j = i + 1; j < so.length-2; j++)
                    if (so[i] < so[j]) {
                        int temp = so[i];
                        so[i] = so[j];
                        so[j] = temp;
                    }
                System.out.println("phần tử lớn thứ 2 là: " + so[i]);
                return;

            }
        }
        public void bt10() {
            int[] so = {1, 4, 6, 8, 10, -100, 8, -35, -9};

            for (int i = 0; i < so.length; i++) {
                for(int j = i + 1; j < so.length; j++) {
                    if (so[i] > 0) {
                        System.out.println("các só nguyên tố trong mảng số nguyên: " + so[i] + " ");
                    }
                }
            }
        }


}
