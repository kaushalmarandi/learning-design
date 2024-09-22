package m.kash.lldpatternsseptember2024.Factory;

import m.kash.lldpatternsseptember2024.Factory.Components.button.Button;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.DropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.Menu;

public class Client{
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory uiFactory= flutter.getUIFactory(Supportedplatforms.IOS);

        Button button= uiFactory.createButton();
        button.clickButton();

        DropDown dropDown= uiFactory.createDropDown();
        dropDown.showDropDown();

        Menu menu= uiFactory.createMenu();
        menu.showMenu();

    }
}
