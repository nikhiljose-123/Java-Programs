import java.util.*;
public class Space_Character_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().strip();
        int c_count=0;
        int o_count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                o_count+=1;
            }
            else{
                c_count+=1;
            }
        }
        System.out.println("space count:"+o_count);
        System.out.println("charcter count:"+c_count);
    }
}
