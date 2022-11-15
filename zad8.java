import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите номер планеты от Солнца:");
        int x = scn.nextInt();
        switch (x){
            case 1:
                System.out.println("Меркурий V = 48 км/с");
                break;
            case 2:
                System.out.println("Венера V = 35,0 км/c");
                break;
            case 3:
                System.out.println("Земля V = 29,765 км/с");
                break;
            case 4:
                System.out.println("Марс V = 24,13 км/с");
                break;
            case 5:
                System.out.println("Юпитер V = 13,1 км/c");
                break;
            case 6:
                System.out.println("Сатурн V = 9,69 км/с");
                break;
            case 7:
                System.out.println("Уран V = 6,81 км/с");
                break;
            case 8:
                System.out.println("Нептун V = 5,4349 км/с");
                break;
            default:
                System.out.println("Ошибка данных");
        }
    }
}
