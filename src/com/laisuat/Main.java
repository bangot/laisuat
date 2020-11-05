package com.laisuat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double money = 1.0;
	int    moth  = 1;
	double interset_rate=1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("emter investment amount ;");
        money = input.nextDouble();
        System.out.println("emter number of month ;");
        moth = input.nextInt();
        System.out.println("Enter annual interest rate in percentage");
        interset_rate= input.nextDouble();
        double total_interset = 0 ;
        for (int i=0; i<moth;i++){
            total_interset += money *(interset_rate/100)/12*moth;

        }
        System.out.println("Total of interset" +total_interset);
    }
}
