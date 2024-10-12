import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Smallest_based_on {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char smallest=s.charAt(0);
        int asci=(int)smallest;
        for(int i=1;i<s.length();i++){
           int  new_asci=(int)s.charAt(i);
           if(new_asci<asci){
               asci=new_asci;
               smallest=s.charAt(i);
           }
        }
        System.out.println(smallest);
    }
}

