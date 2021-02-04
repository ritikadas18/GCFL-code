
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(char i;s1.toCharArray();){
            a[i-97]++;
        }
        for(char i;s2.toCharArray();){
            b[i-97]++;
        }
        int s=0;
        int p;
        for(int i=0;i<26;i++){
            p=a[i]-b[i];
            p=Math.abs(p);
            s=s+p;
        }
        return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
