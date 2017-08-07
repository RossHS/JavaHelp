import java.util.Scanner;

/**
 * Created by ${Ross} on 06.08.2017.
 */
public class zd2_5Palindrome {
    public static void main(String[] args) {
        boolean z;
        String number;
        zd2_5Palindrome k = new zd2_5Palindrome();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число на проверку");
        number = scan.nextLine();
        z = k.IsPalindrome(number);
        if (z == true){
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
    }

    public boolean IsPalindrome(String a){
        int i = 0;
        int j = a.length() - 1;
        while ( j > i) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
