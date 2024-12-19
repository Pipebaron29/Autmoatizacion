package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.example.ui.Pruebas.PruebasUI;

public class aceptUsingDataTask implements Task {

    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(PruebasUI.RADIO_BUTTON),
                Scroll.to(PruebasUI.BUTTON_SAVE),
                Click.on(PruebasUI.BUTTON_SAVE)
        );
    }
}
