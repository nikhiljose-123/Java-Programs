 import java.util.*;

// class Hotel {

//     private int hotelId;
//     private String hotelName;
//     private String dateOfBooking;
//     private int noOfRoomsBooked;
//     private String wifiFacility;
//     private double totalBill;

//     // Constructor
//     public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
//         this.hotelId = hotelId;
//         this.hotelName = hotelName;
//         this.dateOfBooking = dateOfBooking;
//         this.noOfRoomsBooked = noOfRoomsBooked;
//         this.wifiFacility = wifiFacility;
//         this.totalBill = totalBill;
//     }

//     // Getters and Setters
//     public int getHotelId() {
//         return hotelId;
//     }

//     public void setHotelId(int hotelId) {
//         this.hotelId = hotelId;
//     }

//     public String getHotelName() {
//         return hotelName;
//     }

//     public void setHotelName(String hotelName) {
//         this.hotelName = hotelName;
//     }

//     public String getDateOfBooking() {
//         return dateOfBooking;
//     }

//     public void setDateOfBooking(String dateOfBooking) {
//         this.dateOfBooking = dateOfBooking;
//     }

//     public int getNoOfRoomsBooked() {
//         return noOfRoomsBooked;
//     }

//     public void setNoOfRoomsBooked(int noOfRoomsBooked) {
//         this.noOfRoomsBooked = noOfRoomsBooked;
//     }

//     public String getWifiFacility() {
//         return wifiFacility;
//     }

//     public void setWifiFacility(String wifiFacility) {
//         this.wifiFacility = wifiFacility;
//     }

//     public double getTotalBill() {
//         return totalBill;
//     }

//     public void setTotalBill(double totalBill) {
//         this.totalBill = totalBill;
//     }
// }

// class MyClass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Hotel[] ho = new Hotel[4];

//         // Taking input for 4 hotels
//         for (int i = 0; i < 4; i++) {
//             int a = sc.nextInt(); sc.nextLine();  // hotelId
//             String b = sc.nextLine();             // hotelName
//             String c = sc.nextLine();             // dateOfBooking
//             int d = sc.nextInt(); sc.nextLine();  // noOfRoomsBooked
//             String e = sc.nextLine();             // wifiFacility
//             double f = sc.nextDouble();           // totalBill
//             sc.nextLine();  // move to next line

//             ho[i] = new Hotel(a, b, c, d, e, f);  // Proper constructor call
//         }

//         // User input for month and wifi availability
//         String month = sc.nextLine();
//         String wifi = sc.nextLine();

//         int rooms = booked(ho, month);

//         // Checking if rooms booked in a specific month
//         if (rooms > 0) {
//             System.out.println(rooms);
//         } else {
//             System.out.println("No rooms booked in the given month");
//         }

//         // Search based on wifi facility
//         int[][] second = search(ho, wifi);
//         if (second == null) {
//             System.out.println("No such option available");
//         } else {
//             System.out.println(second[second.length - 2][0]);
//         }
//     }

//     // Method to check booked rooms in a given month using dynamic array resizing
//     public static int booked(Hotel[] ho, String month) {
//         int[] rooms = new int[0];  // Initialize an empty array to store rooms booked

//         // Loop through the hotels and check for the matching month
//         for (int i = 0; i < ho.length; i++) {
//             if (ho[i].getDateOfBooking().contains(month)) {
//                 // Dynamically resize the array and add the rooms booked
//                 rooms = Arrays.copyOf(rooms, rooms.length + 1);
//                 rooms[rooms.length - 1] = ho[i].getNoOfRoomsBooked();  // Store rooms booked
//             }
//         }

//         // Calculate the sum of the rooms booked
//         int sum = 0;
//         for (int i = 0; i < rooms.length; i++) {
//             sum += rooms[i];  // Add up the values from the dynamically created array
//         }

//         return sum;  // Return the sum
//     }

//     // Method to search for hotels based on wifi availability using dynamic array resizing
//     public static int[][] search(Hotel[] ho, String wifi) {
//         int[][] idAndPrice = new int[0][2];  // Initialize an empty 2D array

//         for (int i = 0; i < ho.length; i++) {
//             if (ho[i].getWifiFacility().equalsIgnoreCase(wifi)) {
//                 idAndPrice = Arrays.copyOf(idAndPrice, idAndPrice.length + 1);  // Resize array
//                 idAndPrice[idAndPrice.length - 1] = new int[2];  // Initialize inner array
//                 idAndPrice[idAndPrice.length - 1][0] = ho[i].getHotelId();  // Store hotel ID
//                 idAndPrice[idAndPrice.length - 1][1] = (int) ho[i].getTotalBill();  // Store total bill as int
//             }
//         }

//         if (idAndPrice.length > 0) {
//             Arrays.sort(idAndPrice, Comparator.comparingInt(row -> row[0]));  // Sort by hotelId
//             return idAndPrice;
//         } else {
//             return null;  // Return null if no matches found
//         }
//     }
// }
import java.util.*;
public class MyClass
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Hotel[] h = new Hotel[4];
        for (int i = 0; i < h.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            h[i]=new Hotel(a,b,c,d,e,f);
        }
        String month = sc.nextLine();
        String wf = sc.nextLine();
        int ans1 = noOfRoomsBookedInGivenMonth(h, month);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("No rooms booked in the given month");
        }
        int ans2 = searchHotelByWifiOption(h, wf);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else{
            System.out.println("No such option available");
        }
    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] h, String m)
    {
        int count = 0;
        for (int i = 0; i < h.length; i++) 
        {
            if(h[i].getDate().contains(m))
            {
                count = count + h[i].getRoom();
                return count;
            }
        }
        return 0;
    }

    public static int searchHotelByWifiOption(Hotel[] h, String w)
    {
        int[] id = new int[0];
        for (int i = 0; i < h.length; i++) {
            if(h[i].getWifi().equalsIgnoreCase(w))
            {
                id = Arrays.copyOf(id, id.length+1);
                id[id.length-1]=h[i].getId();
                Arrays.sort(id);
            }
        }
        if(id.length>0)
        {
            return id[id.length-2];
        }
        else
        {
            return 0;
        }
    }
}  
class Hotel{
    private int id;
    private String name;
    private String date;
    private int room;
    private String wifi;
    private double bill;

    public Hotel(int id, String name, String date, int room, String wifi, double bill)
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
        this.wifi = wifi;
        this.bill = bill;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public int getRoom()
    {
        return room;
    }
    public void setRoom(int room)
    {
        this.room = room;
    }
    public String getWifi()
    {
        return wifi;
    }
    public void setWifi(String wifi)
    {
        this.wifi = wifi;
    }
    public double getBill()
    {
        return bill;
    }
    public void setBill(double bill)
    {
        this.bill = bill;
    }
}
