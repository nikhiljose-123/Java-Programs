public class Day12 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try {
            j=18/i;
            if(j==0){
                throw new ArithmeticException("default");  // calling exception
            }

            
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("It is the default output"+e);
        }
        catch( Exception e){
            System.out.println("Something went wrong...");
        }



        // System.out.println("hi");
        // System.out.println("Bye");
    }
   
}
