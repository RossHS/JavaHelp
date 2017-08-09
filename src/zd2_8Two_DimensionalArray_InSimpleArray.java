/**
 * Created by Ross on 09.08.2017.
 */
public class zd2_8Two_DimensionalArray_InSimpleArray {
    public static void main(String[] args) {
        int[][] a = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {9, 10, 11}, {12, 13, 14}};
        int[] b = new int[a.length * a[0].length];//находим длину массива 5*3=15

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //присваеваем для каждой строки по элементу
                b[i * a[i].length + j] = a[i][j];
                System.out.print(a[i][j] + "|");
            }
            System.out.println();
        }
        for (int i : b) { //цикл for для каждого элемента b выполняется
            System.out.print(i + " ");
        }
    }
}