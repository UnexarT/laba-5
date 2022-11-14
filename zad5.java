import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте Х:");
        double x = scn.nextDouble();
        System.out.println("Задайте Y:");
        double y = scn.nextDouble();
        if (figOne(x,y) || figTwo(x,y) || figThree(x,y)) {
            System.out.println("Попадание в первую фигуру");
        } else if(figFour(x,y) || figFive(x,y)){
            System.out.println("Попадание во вторую фигуру");
        } else {
            System.out.println("Точка не попала");
        }
    }
    public static double k(double x1,double y1,double x2,double y2){
        return (y1 - y2)/(x1 - x2);
    }
    public static double b(double x1,double y1,double x2,double y2){
        return y1 - x1*k(x1,y1,x2,y2);
    }
    public static boolean figOne(double x, double y) {
        if (y >= x * k(-4, 0, 1, 4) + b(-4, 0, 1, 4) &&
                y <= x * k(1, 4, -7, 5) + b(1, 4, -7, 5) &&
                y >= x * k(-4, 0, -7, 5) + b(-4, 0, -7, 5)) {
            return true;
        }
        return false;
    }
    public static boolean figTwo(double x, double y) {
        if (y <= x * k(-4, 0, -7, 5) + b(-4, 0, -7, 5) &&
                y >= x * k(-6, -4, -7, 5) + b(-6, -4, -7, 5)  &&
                y >= x * k(-6, -4, -4, 0) + b(-6, -4, -4, 0)) {
            return true;
        }
        return false;
    }
    public static boolean figThree(double x, double y) {
        if (y <= x * k(-6, -4, -4, 0) + b(-6, -4, -4, 0) &&
                y >= x * k(-2, -6, -6, -4) + b(-2, -6, -6, -4) &&
                y <= x * k(-2, -6, -4, 0) + b(-2, -6, -4, 0)) {
            return true;
        }
        return false;
    }
    public static boolean figFour(double x, double y) {
        if (y >= x * k(1, -7, 3, -4) + b(1, -7, 3, -4) &&
                y <= x * k(1, -2, 3, -1) + b(1, -2, 3, -1) &&
                x >= 1 && x <= 3) {
            return true;
        }
        return false;
    }
    public static boolean figFive(double x, double y) {
        if (y <= x * k(3, -1, 5,2) + b(3, -1, 5,2) &&
                y >= x * k(3, -4, 6, -3) + b(3, -4, 6, -3) &&
                y <= x * k(6, -3, 5,2) + b(6, -3, 5,2) && x >= 3) {
            return true;
        }
        return false;
    }
}

