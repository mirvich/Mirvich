import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer>mass = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        addMass(file);

        int min = (minValue());
        int max = (maxValue());
        int minRes = Integer.MAX_VALUE;
        for (int i = min; i < max; i++) {
            int res = (getResult(i));
            if (res < minRes) {
                minRes = res;
            }
        }
        System.out.println(minRes);
    }

    private static void addMass (File file) throws IOException {
        mass = new ArrayList<>();
        BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        while ((line = buff.readLine()) != null) {
            mass.add(Integer.parseInt(line));
        }
        buff.close();
    }

    private static int minValue () {
        int min = Integer.MAX_VALUE;
        for (int i:mass) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int maxValue () {
        int max = Integer.MIN_VALUE;
        for (int i:mass) {
            if ( i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int getResult(int target) {
        int result = 0;
        for (int i=0; i<mass.size();i++) {
            int val = mass.get(i);
            while (val!=target) {
                if (val<target) {
                    val = val+1;
                }else {
                    val = val-1;
                }
                result++;
            }
        }
        return result;
    }
}
