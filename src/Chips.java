public class Chips extends foodMarket{
    String ingredient;
    boolean isSpicy;
    public Chips(String foodName, String expiration, boolean isHealthy,String ingredient, boolean isSpicy){
        super(foodName, expiration, isHealthy);
        this.ingredient= ingredient;
        this. isSpicy= isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public String getIngredient() {
        return ingredient;
    }
    public void countChipBags (){
        int x= (int)(Math.random()*30);
        System.out.println("Right now in the market we have "+ x+ " bags of "+ getFoodName()+ " chips");
    }
   public void status (){
        System.out.println("All chip bags are closed");
   }
}
