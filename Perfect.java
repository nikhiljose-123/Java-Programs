public class Perfect {

        public static String checkPerfectNumber(int num) {
            int sum=0;
            for (int i=1;i<=num;i++){
                if (num % i==0){
                    sum+=i;
                }
            }
            if (sum==num){
                return "It's a perfect number";
            }
            else{
                return "It's not a perfect number";
            }
        }
       
        
    }
