import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int flag = 0;
        String str = "";
        String result = "";
        List<Integer> array = new ArrayList<>();
        int[] mas = new int[num2];

        for ( int i = 1; i <= num1; i++) {
            mas[flag] = i;
            array.add(mas[flag]);

            if (array.get(0) == mas[num2 - 1]) {
                break;
            }

            if (flag == num2 - 1) {
                array.add(mas[flag]);
                flag = 0;
                mas[flag] = i;
            }

            flag += 1;

            if (i == num1) {
                i = 0;
            }

            if (array.get(0) == mas[num2 - 1]) {
                break;
            }
        }

        for (int i = 0; i <= array.size() - 1; i += num2) {
            str = String.valueOf(array.get(i));
            result += str;
        }
        System.out.println(result);
    }
}