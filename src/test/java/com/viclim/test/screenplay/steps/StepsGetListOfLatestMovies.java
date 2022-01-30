package com.viclim.test.screenplay.steps;

import com.viclim.test.screenplay.tasks.main.BrowseMenuSection;
import com.viclim.test.screenplay.tasks.main.NavigateToWebsite;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepsGetListOfLatestMovies {
    @Before
    public void prepareTest(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{word} goes to {word}")
    public void givenUserGoesToIMDBToCheckWhatIsHappeningInMovieCategory(String userName, String webPageName) {
        theActorCalled(userName).attemptsTo(
                NavigateToWebsite.called(webPageName)
        );
    }

    @When("{word} attempts to view the {}")
    public void whenUserAttemptsToViewTheMovieCategory(String userName, String category){
        theActorInTheSpotlight().attemptsTo(
                BrowseMenuSection.andSelect(category)
        );
    }
}
