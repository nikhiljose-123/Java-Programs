enum laptop{
    hp(1000),lenovo(2000),acer(3000),asus(4000);

    private int price;
    private laptop(int price){
    this.price=price;
}
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}



public class Day11 {
    public static void main(String[] args) {
        for(laptop lap:laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }
    }
}
