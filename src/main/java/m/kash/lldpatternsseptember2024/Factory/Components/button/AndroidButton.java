package m.kash.lldpatternsseptember2024.Factory.Components.button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing Android Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Android Button");
    }
}
