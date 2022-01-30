package com.viclim.test.screenplay.tasks.main;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToWebsite implements Task {
    private String webPageName;

    public NavigateToWebsite(String webPageName){
        this.webPageName = webPageName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(String.format("https://www.%s.com",this.webPageName))
        );
    }
    public static NavigateToWebsite called(String webPageName){
        return Tasks.instrumented(NavigateToWebsite.class, webPageName);
    }
}
