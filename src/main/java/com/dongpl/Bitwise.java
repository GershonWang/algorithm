package com.dongpl;

import java.util.Scanner;

/**
 * 位运算
 */
public class Bitwise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入十进制整数：");
        int num = scanner.nextInt();
        print(num);
    }

    public static void print(int num){
        System.out.print("返回的二进制数据：");
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

}
