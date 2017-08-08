import java.util.Scanner;

/**
 * Created by Ross on 08.08.2017.
 */
public class zd2_6MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Введите число для таблицы умножения");
        int x = new Scanner(System.in).nextInt();
        new zd2_6MultiplicationTable().Table(x);

    }
    public void Table(int x){
        for (int i = 0; i < 10 ; i++) {
            int result = x * i;
            System.out.println(x + " * " + i + " = " + result);

        }
    }
}
