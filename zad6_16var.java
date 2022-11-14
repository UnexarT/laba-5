import java.util.Scanner;
import static java.lang.Math.*;

public class zad6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте Х:");
        double x = scn.nextDouble();
        System.out.println("Задайте Y:");
        double y = scn.nextDouble();
        if (x*x+y*y <= 36 && y >= 0) {
            if (Tryeng(x, y) == false) {
                if (pow(y - 3, 2) + pow(x + 1, 2) >= 4) {
                    System.out.println("Попадание в закрашенную область");
                } else if (Okr(x, y)) {
                    System.out.println("Попадание в закрашенную область");
                } else {
                    System.out.println("Точка не попала");
                }
            } else {
                System.out.println("Точка не попала");
            }
        } else {
            System.out.println("Точка не попала");
        }
    }
    public static double k(double x1,double y1,double x2,double y2){
        return (y1 - y2)/(x1 - x2);
    }
    public static double b(double x1,double y1,double x2,double y2) {
        return y1 - x1 * k(x1, y1, x2, y2);
    }
    public static boolean Tryeng(double x, double y) {
        if ((y < x * k(-1, 0, -4, 3) + b(-1, 0, -4, 3) &&
                x > -4) ||
                (y < x * k(-1, 0, 3, 3) + b(-1, 0, 4, 3) &&
                y < x * k(4, 0, 3, 3) + b(4, 0, 3, 3))) {
            return true;
        }
        return false;
    }
    public static boolean Okr(double x, double y) {
        if (pow(y-3,2) + pow(x+2,2) <= 1 || pow(y-3,2) + x*x <= 1) {
            return true;
        }
        return false;
    }
}
