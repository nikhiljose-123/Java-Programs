//ENCAPSULATION


// class Human{
//     private String Name="Nikhil";
//     private int age=8;

// public  int getAge(){
//     return age;
// }    
// public  String getName(){
//     return Name;
// }

// }
// public class Day9 {
//     public static void main (String [] args){
//     Human h=new Human();
//     System.out.println(h.getAge());
//     System.out.println(h.getName());
    
//     }
// }
class Human{
    private String Name="";
    private int age;

public  int getAge(){
    return age;
}
public  String getName(){
    return Name;
}
public void setName(String a){
    Name=a;
}                                                                          
public void setAge(int a){
    age=a;
}
}
public class Day9 {
    public static void main (String [] args){
    Human h=new Human();
    h.setName("Nikhil");
    h.setAge(8);
    System.out.println(h.getAge());
    System.out.println(h.getName());
    
    }
}