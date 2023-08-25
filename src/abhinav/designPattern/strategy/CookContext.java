package abhinav.designPattern.strategy;

public class CookContext {

  private   CookingStrategy cookingStrategy;

    public CookContext (CookingStrategy  cookingStrategy) {

        this.cookingStrategy=cookingStrategy;

    }

    public void setCookingStrategy(CookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public void cooking(String dish){

        cookingStrategy.cook(dish);

    }
}
