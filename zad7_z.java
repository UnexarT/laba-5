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
                if (E + x * x - 2 * x == 0) {
                    System.out.println("x не удовлетворяет ОДЗ");
                } else {
                    System.out.println("z = " + (1 + abs(cos(4 * pow(x, 4) + 6 * pow(x, 6)))) / (E + x * x - 2 * x));
                }
            } else if ( x >= 0 & x < 1) {
                if (cos(pow(tan(x*x),4)) == 1 || (1/2*x + (2*x - sin(3*x))/(1 - cos(pow(tan(x*x),4)))) < 0) {
                    System.out.println("x не удовлетворяет ОДЗ");
                } else {
                    System.out.println("z = " + pow((1/2*x + (2*x - sin(3*x))/(1 - cos(pow(tan(x*x),4)))),1/4f));
                }
            } else {
                if (x == 2 || x - 2 < 0) {
                    System.out.println("x не удовлетворяет ОДЗ");
                } else {
                    System.out.println("z = " + 2*abs(0.5 + (cos(pow(x,exp(PI))) - 2)/pow(x-2,1/2f)));
                }
            }
        }
    }

}

