package com.viclim.test.screenplay.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ImdbMainPage extends PageObject{
    public static Target MENU_BAR = Target.the("Menu Bar").locatedBy(".//div[text()='Menu']");
}
