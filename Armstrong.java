import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int num=Integer.parseInt(s);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int digit=Character.getNumericValue(s.charAt(i));
            sum+=Math.pow(digit,s.length());
        }
        if(sum==num){
            System.out.println("Armstrong");
         }
         else{
            System.out.println("Not Armstrong");
         }
    }
}
