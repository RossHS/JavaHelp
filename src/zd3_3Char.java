import java.util.Scanner;

/**
 * Created by Ross on 09.08.2017.
 */
public class zd3_3Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ez = scan.next().charAt(0);

        if (Character.isDigit(ez) == true){
            System.out.println("Цифра");
        }
        if (Character.isLetter(ez) == true){
            System.out.println("Буква");
        }
        else {
            System.out.println("Знак пунктуации");
        }
    }
}
