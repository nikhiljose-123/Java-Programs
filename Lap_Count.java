// import java.util.*;
// class Laptop{
//     private int laptopId;
//     private String brand;
//     private String osType;
//     private double price;
//     private int rating;

//     public Laptop(int laptopId, String brand, String osType, double price, int rating){
//         this.laptopId=laptopId;
//         this.brand=brand;
//         this.osType=osType;
//         this.price=price;
//         this.rating=rating;
//     }
//     public int getLaptopId(){
//         return laptopId;
//     }
//     public void  setLaptopId(int laptopId){
//         this.laptopId=laptopId;
//     }

//     public String getBrand(){
//         return brand;
//     }
//     public void  setBrand(String brand){
//         this.brand=brand;
//     }

//     public String getOsType(){
//         return osType;
//     }
//     public void  setOsType(String osType){
//         this.osType=osType;
//     }

//     public double getPrice(){
//         return price;
//     }
//     public void  setPrice(double price){
//         this.price=price;
//     }

//     public int getRating(){
//         return rating;
//     }
//     public void  setRating(int rating){
//         this.rating=rating;
//     }
// }
// public class Lap_Count {
//     public static void main(String[]args){
//         Laptop []la=new Laptop[4];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<4;i++){
//             int a=sc.nextInt();sc.nextLine();
//             String b=sc.nextLine();
//             String c=sc.nextLine();
//             double d=sc.nextDouble();
//             int e =sc.nextInt();
//             la[i]=new Laptop(a, b, c,d, e);
//         }
//         String lBrand=sc.nextLine();
//         String lOs=sc.nextLine();

//         int count= countOfLaptopsByBrand(la, lBrand);
//         if (count>0){
//             System.out.println(count);
//         }
//         else{
//             System.out.println("The given brand is not available");
//         }

//         int []dessId=searchLaptopByOs(la, lOs);
//         if(dessId==null){
//             System.out.println("The given os is not available");
//         }
//         else{
//             for(int i=dessId.length-1;i>0;i--){
//                 System.out.println(dessId[i]);
                
//             }
//         }
//     }



//     public static int countOfLaptopsByBrand(Laptop[]la,String b){
//         int[]brands=new int[0];
//         for(int i=0;i<la.length;i++){
//             if(la[i].getBrand().equalsIgnoreCase(b)){
//                 if (la[i].getRating()>3){
//                     brands=Arrays.copyOf(brands,brands.length+1);
//                     brands[brands.length-1]=la[i].getRating();
//                 }
                
//             }
//         }
//         if(brands.length>0){
//             return brands.length;
//         }
//         else{
//             return 0;
//         }
//     }

//     public static int[] searchLaptopByOs(Laptop[]la,String o){
//         int [] ids=new int[0];
//         for(int i=0;i<la.length;i++){
//             if (la[i].getOsType().equalsIgnoreCase(o)){
//                 ids=Arrays.copyOf(ids, ids.length+1);
//                 ids[ids.length-1]=la[i].getLaptopId();
//                 Arrays.sort(ids);
//             }
//         }
//         if(ids.length>0){
//             return ids;
//         }
//         else{
//             return null;
//         }
//     }
// }
import java.util.*;
class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() {
        return laptopId;
    }
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOsType() {
        return osType;
    }
    public void setOsType(String osType) {
        this.osType = osType;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}

public class Lap_Count {
    public static void main(String[] args) {
        Laptop[] la = new Laptop[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            int e = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline after nextInt()
            la[i] = new Laptop(a, b, c, d, e);
        }
        
        String lBrand = sc.nextLine(); // Read the brand
        String lOs = sc.nextLine();    // Read the OS type

        int count = countOfLaptopsByBrand(la, lBrand);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }

        int[][]dessId = searchLaptopByOs(la, lOs);
        if (dessId == null) {
            System.out.println("The given os is not available");
        } else {
            for (int i = dessId.length - 1; i >= 0; i--) { // Changed i > 0 to i >= 0 to include index 0
                System.out.println(dessId[i][0]);
                System.out.println(dessId[i][1]);
            }
        }
    }

    public static int countOfLaptopsByBrand(Laptop[] la, String b) {
        int[] brands = new int[0];
        for (int i = 0; i < la.length; i++) {
            if (la[i].getBrand().equalsIgnoreCase(b)) {
                if (la[i].getRating() > 3) {
                    brands = Arrays.copyOf(brands, brands.length + 1);
                    brands[brands.length - 1] = la[i].getRating();
                }
            }
        }
        if (brands.length > 0) {
            return brands.length;
        } else {
            return 0;
        }
    }

    public static int[][] searchLaptopByOs(Laptop[] la, String o) {
        int[][] idsAndRatings = new int[0][2]; // Store both ID and rating
        for (int i = 0; i < la.length; i++) {
            if (la[i].getOsType().equalsIgnoreCase(o)) {
                idsAndRatings = Arrays.copyOf(idsAndRatings, idsAndRatings.length + 1);
                idsAndRatings[idsAndRatings.length - 1] = new int[2]; // Initialize the inner array
                idsAndRatings[idsAndRatings.length - 1][0] = la[i].getLaptopId(); // Store laptop ID
                idsAndRatings[idsAndRatings.length - 1][1] = la[i].getRating();   // Store rating
            }
        }
        if (idsAndRatings.length > 0) {
            Arrays.sort(idsAndRatings,Comparator.comparing(row->row[0]));
            return idsAndRatings;
        } else {
            return null;
        }
    }
    
}
