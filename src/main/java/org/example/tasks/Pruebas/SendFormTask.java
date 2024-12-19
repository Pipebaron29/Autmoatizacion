package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.example.ui.Pruebas.PruebasUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendFormTask implements Task {

    private static String SendfirstName;
    private static String middleName;
    private static String SendlastName;
    private static String SendVacancy;
    private static String SendEmail;
    private static String SendcontacNumber;
    private static String SendkeyWords;
    private static String SendNotes;

    public SendFormTask(String SendfirstName, String middleName, String SendlastName, String SendVacancy, String SendEmail, String SendcontacNumber, String SendkeyWords, String SendNotes) {

        this.SendfirstName = SendfirstName;
        this.middleName = middleName;
        this.SendlastName = SendlastName;
        this.SendVacancy = SendVacancy;
        this.SendEmail = SendEmail;
        this.SendcontacNumber = SendcontacNumber;
        this.SendkeyWords = SendkeyWords;
        this.SendNotes = SendNotes;
    }

    public static Performable data(String SendfirstName, String middleName, String SendlastName, String SendVacancy, String SendEmail, String SendcontacNumber, String SendkeyWords, String SendNotes) {
        return instrumented(SendFormTask.class, SendfirstName, middleName, SendlastName, SendVacancy, SendEmail, SendcontacNumber, SendkeyWords, SendNotes);
    }

    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Click.on(PruebasUI.BUTTON_ADD_LEADER),

                Click.on(PruebasUI.FIELD_FIRST_NAME),
                Clear.field(PruebasUI.FIELD_FIRST_NAME),
                SendKeys.of(SendfirstName).into(PruebasUI.FIELD_FIRST_NAME),

                Click.on(PruebasUI.FIELD_MIDDLE_NAME),
                Clear.field(PruebasUI.FIELD_MIDDLE_NAME),
                SendKeys.of(middleName).into(PruebasUI.FIELD_MIDDLE_NAME),

                Click.on(PruebasUI.FIELD_LAST_NAME),
                Clear.field(PruebasUI.FIELD_LAST_NAME),
                SendKeys.of(SendlastName).into(PruebasUI.FIELD_LAST_NAME),

                Click.on(PruebasUI.OPTIONS_VACANCY),
                Click.on(PruebasUI.SelectOptionvacancy(SendVacancy)),

                Click.on(PruebasUI.FIELD_EMAIL),
                Clear.field(PruebasUI.FIELD_EMAIL),
                Click.on(PruebasUI.FIELD_EMAIL),
                SendKeys.of(SendEmail).into(PruebasUI.FIELD_EMAIL),

                Click.on(PruebasUI.FIELD_CONTACT_NUMBER),
                Clear.field(PruebasUI.FIELD_CONTACT_NUMBER),
                Click.on(PruebasUI.FIELD_CONTACT_NUMBER),
                SendKeys.of(SendcontacNumber).into(PruebasUI.FIELD_CONTACT_NUMBER),

                Click.on(PruebasUI.FIELD_KEYWORDS),
                Clear.field(PruebasUI.FIELD_KEYWORDS),
                Click.on(PruebasUI.FIELD_KEYWORDS),
                SendKeys.of(SendkeyWords).into(PruebasUI.FIELD_KEYWORDS),

                Click.on(PruebasUI.FIELD_NOTES),
                Clear.field(PruebasUI.FIELD_NOTES),
                Click.on(PruebasUI.FIELD_NOTES),
                SendKeys.of(SendNotes).into(PruebasUI.FIELD_NOTES)
        );
    }
}
