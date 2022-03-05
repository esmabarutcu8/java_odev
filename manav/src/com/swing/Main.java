package com.swing;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double elma=3.67;
    double armut= 2.14;
    double domates= 1.11;
    double muz=0.95;
    double patlican=5.00;
    double a,e,d,m,p;
    Scanner input=new Scanner(System.in);

    System.out.println("armut kaç kilo:");
    a=input.nextDouble();
    System.out.println("elma kaç kilo:");
    e=input.nextDouble();
    System.out.println("domates kaç kilo:");
    d=input.nextDouble();
    System.out.println("muz kaç kilo:");
    m=input.nextDouble();
    System.out.println("patlıcan kaç kilo:");
    p=input.nextDouble();

    double toplam=(armut*a)+(elma*e)+(muz*m)+(domates*d)+(patlican*p);
    System.out.println("toplam tutar"+toplam);




    }
}
