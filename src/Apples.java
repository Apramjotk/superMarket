public class Apples extends foodMarket{
    private String color;
    private boolean isNotRotten;

    public Apples(String foodName, String expiration, boolean isHealthy,String color, boolean isNotRotten){
        super(foodName, expiration, isHealthy);
        this. color= color;
        this. isNotRotten= isNotRotten;
    }

    public void sweet(){
        System.out.println("The apple is sweet and not too hard to eat. People have bought red applies the most with 100 sales this week");
    }

    public boolean isNotRotten() {
        return isNotRotten;
    }

    public String getColor() {
        return color;
    }
}
