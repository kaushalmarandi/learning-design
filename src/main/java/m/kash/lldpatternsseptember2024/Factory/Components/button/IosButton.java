package m.kash.lldpatternsseptember2024.Factory.Components.button;

public class IosButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing IOS Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking IOS Button");
    }
}
