package m.kash.lldpatternsseptember2024.Factory;

import m.kash.lldpatternsseptember2024.Factory.Components.button.Button;
import m.kash.lldpatternsseptember2024.Factory.Components.dropdown.DropDown;
import m.kash.lldpatternsseptember2024.Factory.Components.menu.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    DropDown createDropDown();


}
