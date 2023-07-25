import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1,input2;
        input1=sc.next();
        input2=sc.next();
        for(int itr1=0;itr1<input1.length();itr1++)
        {
            boolean match=false;
            for(int itr2=0;itr2<input2.length();itr2++)
            {
                if(input1.charAt(itr1)==input2.charAt(itr2)){
                    match=true;
                }    
            }
            if(!match)
            {
                System.out.print(input1.charAt(itr1));
            }
        }
    }
}