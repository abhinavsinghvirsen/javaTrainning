package abhinav.designPattern.behavioral.strategy;

public class Solar implements CookingStrategy{
    @Override
    public void cook(String dish) {
        System.out.println(dish+" by solar");
    }
}
