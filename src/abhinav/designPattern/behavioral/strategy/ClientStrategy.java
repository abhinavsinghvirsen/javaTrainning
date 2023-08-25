package abhinav.designPattern.behavioral.strategy;

public class ClientStrategy {

    public static void main(String[] args) {

        CookContext ck = new CookContext(new Solar());
        ck.cooking("rice");

        ck.setCookingStrategy(new Steam());

        ck.cooking("rice");
    }
}
