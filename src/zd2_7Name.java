import java.util.Scanner;

/**
 * Created by Ross on 08.08.2017.
 */
public class zd2_7Name {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = text.nextLine(); //либо = new Scanner(System.in).nextLine();
        System.out.println(name);
    }
}