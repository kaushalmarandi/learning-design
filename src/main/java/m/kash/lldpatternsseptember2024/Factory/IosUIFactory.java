package m.kash.lldpatternsseptember2024.Factory;

import m.kash.lldpatternsseptember2024.Factory.Components.button.Button;
import m.kash.lldpatternsseptember2024.Factory.Components.button.IosButton;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.DropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.IosDropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.IosMenu;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
