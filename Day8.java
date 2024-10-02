import java.util.Scanner;

public class Day8 {
    public static void main (String [] args){
        // String s= "Nikhil";
        // s=s.concat(" Jose");
        // // System.out.println(s);
        // StringBuffer b= new StringBuffer("Nikhil");
        // b.append(" Jose");
        // System.out.println(b);
        // b.delete(1,2);
        // System.out.println(b);

        
       
          
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");
                String input = scanner.nextLine();
                scanner.close();
        
                boolean isDivisible = isSumOfDigitsDivisibleByThree(input);
                System.out.println("Is the sum of digits divisible by 3? " + isDivisible);
            }
        
            private static boolean isSumOfDigitsDivisibleByThree(String number) {
                int sumOfDigits = 0;
        
                for (int i = 0; i < number.length(); i++) {
                    char c = number.charAt(i);
                    if (Character.isDigit(c)) {
                        sumOfDigits += c - '0';
                    }
                }
        
                return sumOfDigits % 3 == 0;
            }
        }


  
