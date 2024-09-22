package m.kash.lldpatternsseptember2024.Factory;

import m.kash.lldpatternsseptember2024.Factory.Components.button.Button;
import m.kash.lldpatternsseptember2024.Factory.Components.button.WindowsButton;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.DropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.WindowsDropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.Menu;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
