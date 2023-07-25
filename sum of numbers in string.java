import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int sum = 0;
        int itr = 0;
        while (itr < str.length()) 
        {
            String num = "0";
            int asc = (int) str.charAt(itr);
            while (47 < asc && asc < 58) 
            {
                num += str.charAt(itr);
                if (itr == str.length() - 1)
                    break;
                itr += 1;
                asc = (int) str.charAt(itr);
            }
            sum += Integer.parseInt(num);
            itr += 1;
        }
        System.out.println(sum);
    }
}