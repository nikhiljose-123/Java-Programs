import java.util.*;
class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId,String os,String brand, int price){
        this.phoneId=phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
    public int getPhoneId(){
        return phoneId;
    }
    public String getOs(){
        return os;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
}

public class Device_Management {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phone []ph=new Phone[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            ph[i]=new Phone(a,b,c,d);
        }
        String p_brand=sc.nextLine();
        String p_os=sc.nextLine();

        int result1=get(ph,p_brand);
        if(result1>0){
            System.out.println(result1);
        }
        else{
            System.out.println("The given brand is not available");
        }

        int [] result2=getPh(ph, p_os);
        if(result2==null){
            System.out.println("No phones are available with specified os and price range");
        }
        else{
            for(int i=0;i<result2.length;i++){
                System.out.println(result2[i]);
            }
        }
    }

    public static int get(Phone[]ph,String b){
        int sum=0;
        for(int i=0;i<ph.length;i++){
            if(ph[i].getBrand().equalsIgnoreCase(b)){
                sum=sum+ph[i].getPrice();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;
        }
    }

    public static int[]getPh(Phone[]ph,String o){
        int[]p_id=new int[0];
        for(int i=0;i<ph.length;i++){
            if(ph[i].getOs().equalsIgnoreCase(o)){
                if(ph[i].getPrice()>=50000){
                p_id=Arrays.copyOf(p_id,p_id.length+1);
                p_id[p_id.length-1]=ph[i].getPhoneId();
                }
            }
        }
    
    if(p_id.length>0){
        return p_id;
    }
    else{
        return null;
    }
}
}
