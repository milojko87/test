package Radnik;

import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class Radnik {
    private String ime; 
    private String prezime;
    private double kss;

    public static double cena_prevoza = 0.0;
    public static double cena_rada = 0.0;
    public static int br_radnika = 0;

    public Radnik(){
        ime = new String("");
        prezime = new String("");
        kss = 1.0;
    }
    public static double prevoz(){
	return (br_radnika * cena_prevoza);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ime:  ");
        ime = sc.next();
        System.out.println("Unesi prezime:  ");
        prezime = sc.next();
        System.out.println("Unesi kss:  ");
        kss = sc.nextDouble();
    }
    public void output(){
        System.out.println("ime: "+ime+"  Prezime: "+ prezime + "Zarada: "+ kss * cena_rada);
    }
}




