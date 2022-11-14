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
        } else if(figFour(x,y) || figFive(x,y) || figSix(x,y)){
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
        if (y <= x * k(-8, 0, -6, 6) + b(-8, 0, -6, 6) &&
                y <= x * k(-4, -6, -6, 6) + b(-4, -6, -6, 6) &&
                y >= x * k(-4, -6, -8, 0) + b(-4, -6, -8, 0)) {
            return true;
        }
        return false;
    }
    public static boolean figTwo(double x, double y) {
        if (x >= - 8 &&
                y >= -6  &&
                y <= x * k(-4, -6, -8, 0) + b(-4, -6, -8, 0)) {
            return true;
        }
        return false;
    }
    public static boolean figThree(double x, double y) {
        if (y <= x * k(-8, -2, -2, 2) + b(-8, -2, -2, 2) &&
                y >= x * k(-4, -6, -6, 6) + b(-4, -6, -6, 6) &&
                y >= x * k(-4, -6, -2, 2) + b(-4, -6, -2, 2)) {
            return true;
        }
        return false;
    }
    public static boolean figFour(double x, double y) {
        double x2 = (4 - b(2, -2, -2, 6))/k(2, -2, -2, 6);
        if (y <= x * k(-2, -6, x2, 4) + b(-2, -6, x2, 4) &&
                y <= x * k(2, -2, -2, 6) + b(2, -2, -2, 6) &&
                y >= x * k(-2, -6, 2, -2) + b(-2, -6, 2, -2)) {
            return true;
        }
        return false;
    }
    public static boolean figFive(double x, double y) {
        if (y <= x * k(4, -8, 2, -2) + b(4, -8, 2, -2) &&
                y >= x * k(-2, -6, 8, -4) + b(-2, -6, 8, -4) &&
                y <= x * k(-2, -6, 2, -2) + b(-2, -6, 2, -2)) {
            return true;
        }
        return false;
    }
    public static boolean figSix(double x, double y) {
        double y2 = 6 * k(2, -2, -6, 0) + b(2, -2, -6, 0);
        double x1 = -(b(2, -2, -6, 0) - b(4, -8, 2, -2))/
                (k(2, -2, -6, 0) - k(4, -8, 2, -2)); /*нашел из системы уравнений пересекающихся прямых*/
        double y1 = x1*k(4, -8, 2, -2) + b(4, -8, 2, -2);
        if (y >= x * k(4, -8, 2, -2) + b(4, -8, 2, -2) &&
                y >= x * k(x1, y1, 6, y2) + b(-2, -6, 8, -4) &&
                y <= x * k(2, -2, -6, 0) + b(2, -2, -6, 0)) {
            return true;
        }
        return false;
    }
}

