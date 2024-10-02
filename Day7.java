import java.util.random.*;
public class Day7 {
    public static void main (String [] args){
        // int nums[]={1,2,3};
        // System.out.println(nums[0]);
        // nums[0]=5;
        // System.out.println(nums[0]);
        // int nums[]=new int[4];
        // nums[0]=1;
        // nums[1]=2;
        // nums[2]=3;
        // nums[3]=4;
        // for (int i=0;i<=3;i++){
        //     System.out.println(nums[i]);
        // }
        
        int nums[][]=new int[3][4];
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                
                nums[i][j]=(int)(Math.random()*10);

            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");

    }
    System.out.println("");
}
}
}