package m.kash.lldpatternsseptember2024.Factory;

import m.kash.lldpatternsseptember2024.Factory.Components.button.AndroidButton;
import m.kash.lldpatternsseptember2024.Factory.Components.button.Button;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.AndroidDropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.DropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.AndroidMenu;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
