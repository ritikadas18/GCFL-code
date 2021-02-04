import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int lettercount[] = new int[26];
        for(char ch : s.toCharArray())
        {
            lettercount[ch-'a']++;
        }
        int counter = 0;
        for(int i :lettercount)
        {
            if( i%2 == 1)
            {
                counter++;
            }
            if(counter >1)              
                break;
        }
        if(counter <=1)
        return "YES";
        else
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
