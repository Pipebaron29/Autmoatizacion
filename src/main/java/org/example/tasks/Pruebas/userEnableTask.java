package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.ui.Pruebas.PruebasUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class userEnableTask implements Task {

    private static String Vacancy;
    private static String hiring;

    public userEnableTask(String Vacancy, String hiring) {

        this.Vacancy = Vacancy;
        this.hiring = hiring;

    }

    public static Performable data(String Vacancy, String hiring) {
        return instrumented(userEnableTask.class, Vacancy, hiring);
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PruebasUI.BUTTON_SHORTlIST),
                Click.on(PruebasUI.BUTTON_SAVE_SHORTlIST),
                Click.on(PruebasUI.FIELD_RECRUITMENT)

        );

        actor.attemptsTo(
                Click.on(PruebasUI.OPTIONS_VACANCY_SEARCH),
                Click.on(PruebasUI.SelectOptionvacancySearch(Vacancy)),

                Click.on(PruebasUI.OPTIONS_HIRING_SEARCH),
                Click.on(PruebasUI.SelectOptionhiringSearch(hiring)),

                Click.on(PruebasUI.BUTTON_SEARCH_CANDIDATE)

        );
    }
}