import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество этажей и номер квартиры:");
        int N = scn.nextInt();
        int a = scn.nextInt();
        if (N == 0){
            System.out.println("Ошибка ввода количества этажей");
        } else if (a > N*5 || a <= 0) {
            System.out.println("Ошибка ввода номера квартиры");
        } else if (a % 5 == 0){
            System.out.println("Ваш этаж №" + a/5);
        } else {
            System.out.println("Ваш этаж №" + (a/5 + 1));
        }
    }
}
