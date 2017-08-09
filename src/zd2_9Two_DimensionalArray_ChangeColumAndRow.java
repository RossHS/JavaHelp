/**
 * Created by Ross on 09.08.2017.
 */
public class zd2_9Two_DimensionalArray_ChangeColumAndRow {
    public static void main(String args[]) {
        char[][] arr = new char[3][3];
        char[][] arr1 = new char[3][3];
        char ch = '`';
        int c = arr.length - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ch++;
                arr[i][j] = ch;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++, c--) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[i][j] = arr[j][c];
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
