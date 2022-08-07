import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        int n=a.size();
        int swaps=0;
        int temp;
//        Bubble sort
        for(int i=0;i<n;i++){
            for (int j=0;j<(n-1);j++){
                if(a.get(j) > a.get(j+1)){
                    temp=a.get(j+1);
                    a.set(j+1,a.get(j));
                    a.set(j,temp);
                    swaps++;
                }
            }
        }
//        Display result
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
