import java.util.Scanner;

/**
 * Created by Ross on 09.08.2017.
 */
public class zd2_10Date {
    public static void main(String[] args) {
        int hours,min,sec,day;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во суток");
        day = scan.nextInt();
        hours = day*24;
        min = hours*60;
        sec = min*60;
        System.out.println("Суток: " + day + "\nЧасов: " + hours +
                            "\nМинут: " + min + "\nСекунд: " + sec);
    }
}
