import java.util.*;
public class Small_Vowel {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.toLowerCase();
    char smallest='z'+1;
    
    for(int i=0;i<s.length();i++){
        char current=s.charAt(i);
        if(current=='a'||current=='e'||current=='i'||current=='o'||current=='u'){
            if(s.charAt(i)< smallest){
                smallest=s.charAt(i);
            }
        }
    }
    System.out.println(smallest);
    }
}
