import java.util.*;
public class Char_odd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=1;i<s.length();i+=2){
            System.err.print(s.charAt(i));
        }
    }
}
