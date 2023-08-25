package abhinav.designPattern.strategy;

public class Stew implements  CookingStrategy{
    @Override
    public void cook(String dish) {
        System.out.println("stewing===>>"+dish);
    }
}
