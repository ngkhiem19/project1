package bai_tap_word;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sophuc {
    public static void main(String[] args) {

        int sophuc;
        double phanthuc, phanao;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phức: ");
        sophuc = sc.nextInt();
        System.out.println("số phức: "+sophuc);
        System.out.println("số phức cộng 2: "+(sophuc+2));
        System.out.println("số phức nhân 2: "+(sophuc*2));
    }
}
