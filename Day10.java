// //Abstraction---
// //concrete class abstract class cant create object but it can be reference
// abstract class Car{
//     abstract public void Drive();

    
//     public void musicplay(){
//         System.out.println("Music playing..");
//     }
// }
// class WagonR extends Car{
//     public void Drive(){
//         System.out.println("Driving..");
//     }
// }

// public class Day10 {  // concree class
//     public static void main(String[] args) {
//         Car c=new WagonR();
//         c.musicplay();
//         c.Drive();

//     }
// }


//Interface---
//All methods should abstract, implemnts keyword, 
interface Car{
     public void Drive();
     public void musicplay();
     int age=4;     //Final and static so we can access it using Car.age
        
}
class WagonR implements Car{
    public void Drive(){
        System.out.println("Driving..");
    }
    public void musicplay(){
        System.out.println("Music Playing...");
    }
}

public class Day10 {  // concree class
    public static void main(String[] args) {
        Car c=new WagonR();
        c.musicplay();
        c.Drive();
        System.out.println(Car.age);

    }
}
