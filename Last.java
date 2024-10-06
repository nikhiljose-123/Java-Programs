import java.util.*;
public class Last {
    public static void main(String[] args) {
        String[] word=null;
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        word=s.split(" ");
        for(int i=0;i<word.length;i++){
            char last=word[i].charAt(word[i].length()-1);
            if(Character.isLetter(last)){
                System.out.print(last);
            }

        }
    }
}
