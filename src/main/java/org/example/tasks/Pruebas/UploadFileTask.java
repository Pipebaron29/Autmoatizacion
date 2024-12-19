package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.example.ui.Pruebas.PruebasUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UploadFileTask implements Task {

    private static String file;


    public UploadFileTask(String file) {

        this.file = file;

    }

    public static Performable withFile(String file) {
        return instrumented(UploadFileTask.class, file);
    }

    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Scroll.to(PruebasUI.ADD_CV),
                Click.on(PruebasUI.ADD_CV)

        );
    }
}
