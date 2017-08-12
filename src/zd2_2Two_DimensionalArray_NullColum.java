import java.util.Scanner;

/**
 * Created by Ross on 12.08.2017.
 */
public class zd2_2Two_DimensionalArray_NullColum {
    static int[][] a = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {9, 10, 11}, {12, 13, 14}};

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        zd2_2Two_DimensionalArray_NullColum go = new zd2_2Two_DimensionalArray_NullColum();
        go.print();
        System.out.println("Введите номер столбца массива, который хотите обнулить");
        go.colum(a, scan.nextInt());
        go.print();
    }
//метод для обнуления заданного столбца
    private int[][] colum(int[][] a, int index){
        if (index>0 && index<a.length) {
            for (int i = 0; i < a.length; i++) {
                a[i][index - 1] = 0;
            }
        } else {
            System.out.println("Вы ввели некорректное значение номера столбца.");
            colum(a, new  Scanner(System.in).nextInt());
        }
        return a;
    }
//вывод массива в консоль
    private void print(){
        for (int i = 0; i < a.length  ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j] + "|");
            }
            System.out.println();
        }
    }
}
