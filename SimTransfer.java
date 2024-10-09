
import java.util.Scanner;
import java.util.Arrays;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}


    

public class SimTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sims = new Sim[5];

        // Reading input for 5 Sims
        for (int i = 0; i < 5; i++) {
            int simId = sc.nextInt();
            sc.nextLine();  // Consume newline
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();  // Consume newline
            String circle = sc.nextLine();

            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }

        // Reading circle1 and circle2
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim[]ans=transferCircle(sims,circle1,circle2);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i].getSimId()+" "+ans[i].getCustomerName()+" "+ans[i].getCircle()+" "+ans[i].getRatePerSecond());
        }

    }

    public static Sim[] transferCircle(Sim[]sims,String Circle1,String Circle2){
        int count=0;
        for(int i=0;i<sims.length;i++){
            if(sims[i].getCircle().equalsIgnoreCase(Circle1)){
                count++;
            }
        }
        Sim []transfer=new Sim[count];
        int index=0;

        for(int i=0;i<sims.length;i++){
            if(sims[i].getCircle().equalsIgnoreCase(Circle1)){
                transfer[index]=new Sim(
                    sims[i].getSimId(),
                    sims[i].getCustomerName(),
                    sims[i].getBalance(),
                    sims[i].getRatePerSecond(),
                    Circle2
                );
                index++;
            }
        }
        Arrays.sort(transfer,(a,b)->Double.compare(b.getRatePerSecond(),a.getRatePerSecond()));
        return transfer;
    }
}



