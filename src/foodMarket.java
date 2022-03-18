public class foodMarket {
    private String foodName;
    private String expiration;
    private boolean isHealthy;
    public foodMarket(String foodName, String expiration, boolean isHealthy){
        this.foodName= foodName;
        this.expiration=expiration;
        this.isHealthy= isHealthy;
    }
    public void stockFood(){
        System.out.println("The food is stocked in the store. ");
    }

    public String getExpiration() {
        return expiration;
    }

    public String getFoodName() {
        return foodName;
    }

    public boolean isHealthy() {
        return isHealthy;
    }
}
