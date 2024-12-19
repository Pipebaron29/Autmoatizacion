package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.example.ui.Pruebas.PruebasUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendDataFormTask implements Task {

    private static String usuario;
    private static String contraseña;

    public SendDataFormTask (String usuario, String contraseña){

        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public static Performable data(String usuario, String contraseña) {
        return instrumented(SendDataFormTask.class, usuario, contraseña);
    }

    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Scroll.to(PruebasUI.FIELD_ENTRY_DOCUMENT),
                Click.on(PruebasUI.FIELD_ENTRY_DOCUMENT),
                SendKeys.of(usuario).into(PruebasUI.FIELD_ENTRY_DOCUMENT),

                Scroll.to(PruebasUI.FIELD_ENTRY_PASSWORD),
                Click.on(PruebasUI.FIELD_ENTRY_PASSWORD),
                SendKeys.of(contraseña).into(PruebasUI.FIELD_ENTRY_PASSWORD),

                Scroll.to(PruebasUI.BUTTON_LOGIN),
                Click.on(PruebasUI.BUTTON_LOGIN)

        );
    }
}
