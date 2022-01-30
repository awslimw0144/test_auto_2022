package com.viclim.test.screenplay.tasks.main;

import com.viclim.test.screenplay.pages.ImdbMainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BrowseMenuSection implements Task {
    private String category;

    public BrowseMenuSection(String category){
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ImdbMainPage.MENU_BAR)
        );
    }

    public static BrowseMenuSection andSelect(String category){
        return Tasks.instrumented(BrowseMenuSection.class, category);
    }
}
