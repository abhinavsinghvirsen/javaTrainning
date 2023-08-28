package abhinav.designPattern.behavioral.strategy;

public class Steam implements CookingStrategy{
    @Override
    public void cook(String dish) {
        System.out.println("cooking by steaming"+dish);
    }
}
