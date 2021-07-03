package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static void readNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời Nhập Số Nguyên : ");
        int so = Integer.parseInt(scanner.nextLine());
        System.out.println("Read ===> " + EnglishNumberToWords.convert(so));
        readNumber();
    }
    public static void main(String[] args) {
        readNumber();
    }
}
