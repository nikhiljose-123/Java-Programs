
// class ABC{
//     public void musicplay(){
//         System.out.println("Music Playing");
//     }
//     public String price(int cost){
//         if (cost>=10){
//             return "Pen";
//         }
//         else{
//             return "Nothing";
//         }
//     }
// }


// public class Day6 {
//     public static void main(String[] args) {
//         ABC a=new ABC();
//         a.musicplay();
//         String str=a.price(12);
//         System.out.println(str);

//     }
// }




//Method overloading
class calculator{
    public int add(int r1,int r2){
        return r1+r2;
    }
    public int add(int r1,int r2,int r3){
       return r1+r2+r3;
    }
}


public class Day6 {
    public static void main(String[] args) {
        calculator calc =new calculator();
        int result = calc.add(4,5);
        System.out.println(result);

    }
}
