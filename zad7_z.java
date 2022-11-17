import java.util.Scanner;

import static java.lang.Math.*;

public class zad7_z {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте х в диапазоне [-4,4]:");
        double x = scn.nextDouble();
        if (x > 4 || x < -4) {
            System.out.println("Неверный х");
        } else {
            if (x < 0) {
                if (cos(2*x+1)+exp(x*x)/(E+x*x) < 0 || x*x == -E) {
                    System.out.println("x не удовлетворяет ОДЗ");
                } else {
                    System.out.println("z = " + sqrt(cos(2*x+1)+exp(x*x)/(E+x*x)));
                }
            } else if (x >= 0 & x <= 1) {
                System.out.println("z = " + (2*pow(cos(pow(sin(x),3)),2)));
            } else {
                if (x == 2 || (1/(x-2) + abs(2*sin(pow(3*x,1/4f))) < 0)) {
                    System.out.println("x не удовлетворяет ОДЗ");
                } else {
                    System.out.println("z = " + sqrt(1/(x-2) + abs(2*sin(pow(3*x,1/4f)))));
                }
            }
        }
    }

}

