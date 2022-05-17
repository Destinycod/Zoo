public class Cocodrile extends Animals{

    private int numberOfTeeth;
    private String favoriteFood;

    public Cocodrile(String name, String species, int numberOfLegs, String gender, int numberOfTeeth, String favoriteFood){
        super(name, species, numberOfLegs, gender);
        this.numberOfTeeth = numberOfTeeth;
        this.favoriteFood = favoriteFood;
    }

    public Cocodrile(int numberOfTeeth){
        this.numberOfTeeth = numberOfTeeth;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String favoriteFood(){
        return getFavoriteFood();
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }
}

/*
Crocodile
-When a Crocodile is created, define the number of teeth it has
-Has a method that logs out its favorite food
 */