package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.example.ui.Pruebas.PruebasUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FilterCandidateTask implements Task {

    private static String busNombre;
    private static String Nombre;
    private static String Vacancy;
    private static String hiring;

    public FilterCandidateTask(String Vacancy, String hiring, String busNombre, String Nombre) {

        this.Vacancy = Vacancy;
        this.busNombre = busNombre;
        this.Nombre = Nombre;
        this.hiring = hiring;

    }

    public static Performable data(String Vacancy, String hiring, String busNombre, String Nombre) {
        return instrumented(FilterCandidateTask.class, busNombre, Nombre, Vacancy, hiring);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PruebasUI.FIELD_NAME_FILTER),
                SendKeys.of(busNombre).into(PruebasUI.FIELD_NAME_FILTER),

                MoveMouse.to(PruebasUI.selectOptionFromDropdownFilter(Nombre)),
                Click.on(PruebasUI.selectOptionFromDropdownFilter(Nombre))

        );

        actor.attemptsTo(
                Click.on(PruebasUI.OPTIONS_VACANCY_SEARCH),
                Click.on(PruebasUI.SelectOptionvacancySearch(Vacancy)),

                Click.on(PruebasUI.OPTIONS_HIRING_SEARCH),
                Click.on(PruebasUI.SelectOptionhiringSearch(hiring)),

                Click.on(PruebasUI.BUTTON_SEARCH_CANDIDATE),
                Click.on(PruebasUI.BUTTON_SEARCH_CANDIDATE)
        );
    }
}
