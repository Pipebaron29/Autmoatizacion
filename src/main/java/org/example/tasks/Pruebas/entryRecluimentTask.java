package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.example.ui.Pruebas.PruebasUI;

public class entryRecluimentTask implements Task {

    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Scroll.to(PruebasUI.FIELD_RECRUITMENT),
                Click.on(PruebasUI.FIELD_RECRUITMENT)
        );
    }
}
