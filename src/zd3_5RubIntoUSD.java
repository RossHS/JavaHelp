import java.util.Scanner;

/**
 * Created by Ross on 09.08.2017.
 */
public class zd3_5RubIntoUSD {
    public static void main(String[] args) {
        zd3_5RubIntoUSD usd = new zd3_5RubIntoUSD();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество рублей и курс валют");
        double dollar =usd.change(scan.nextDouble(),scan.nextDouble());
        System.out.println(dollar);
        System.out.println("хех");
    }
    private double change(double rub, double rates){
        return rub/rates;
    }
}
