import java.util.Scanner;

/**
 * Created by Ross on 09.08.2017.
 */
public class zd3_4TimeAndSpeed {
    public static void main(String[] args) {
        int n,t,s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите растояние в км:");
        n = scan.nextInt();
        System.out.println("Введите время в часах:");
        t = scan.nextInt();
        s = n/t;
        System.out.println("Cкорость с которой нужно ехать: " + s + " км/ч");
    }
}
