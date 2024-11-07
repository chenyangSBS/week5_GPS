package org.example;

import java.util.Scanner;

public class GPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr;
        int hh = 0; // 小时
        int mm = 0; // 分钟
        int ss = 0; // 秒


        do {
            inputStr = in.nextLine();// 输入GPS字符串
            // 你的代码逻辑





        } while (inputStr.equals("END") == false); // 当输入的字符串不是END，继续循环

        System.out.printf("%02d:%02d:%02d", hh, mm, ss); // 输出根据最后一条语句得到的北京时间
    }
}
