import java.util.*;
public class Vowls_consonent_count {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().replace(" ","");
        s=s.toLowerCase();
        int v_count=0;
        int c_count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v_count++;
            }
            else{
                c_count++;
            }
        }
    }
        System.out.println("Vowels count:"+v_count);
        System.out.println("Consonents count:"+c_count);
    }

}
