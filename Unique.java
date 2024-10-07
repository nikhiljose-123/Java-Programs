import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().replace(" ","");
        LinkedHashMap <Character,Integer>count=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(!count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),1);
            }
            else{
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
        }
        count.forEach((key,value)->{
            if(value==1){
                System.out.print(key);
            }
        });
    }
}
