import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named 'Main'.
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        input=sc.nextLine();
        int len = input.length();
        char arr[] = input.toCharArray();
        for(int i=0;i<len;i++)
        {
            
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                arr[i]='z';
            }
        }
        System.out.println(arr);
    }
}