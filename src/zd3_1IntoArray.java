import java.util.Scanner;

/**
 * Created by Ross on 09.08.2017.
 */
public class zd3_1IntoArray {
    public static void main(String[] args) {
        //int z = 100;
        System.out.println("Введите число для преобразования");
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        char[] array1 = Integer.toString(z).toCharArray();
        int[] array2 = new int[array1.length];

            for (int i = 0; i < array1.length ; i++) {
            array2[i] = Character.getNumericValue(array1[i]);
            }

            System.out.print("[");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i]);
                if (i < array2.length - 1) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
            }
        }
    }
}
