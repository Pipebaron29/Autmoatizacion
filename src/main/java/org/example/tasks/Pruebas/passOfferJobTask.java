package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.ui.Pruebas.PruebasUI;

public class passOfferJobTask implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PruebasUI.BUTTON_SAVE_OFER_JOB)
        );
    }
}
