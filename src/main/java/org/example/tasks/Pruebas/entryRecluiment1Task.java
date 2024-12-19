package org.example.tasks.Pruebas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.example.ui.Pruebas.PruebasUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class entryRecluiment1Task implements Task {

    private final String sendInterviewTittle;
    private final String sendInterviewer;
    private final String optionToSelect;
    private final String formattedDate;


    public entryRecluiment1Task(String sendInterviewTittle, String sendInterviewer, String optionToSelect) {
        this.sendInterviewTittle = sendInterviewTittle;
        this.sendInterviewer = sendInterviewer;
        this.optionToSelect = optionToSelect;
        this.formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-dd-MM")); // Generar fecha
    }

    public static Performable data(String sendInterviewTittle, String sendInterviewer, String optionToSelect) {
        return instrumented(entryRecluiment1Task.class, sendInterviewTittle, sendInterviewer, optionToSelect);
    }

    public <T extends Actor> void performAs(T actor) {

        // Proceso de agendamiento de entrevista
        actor.attemptsTo(
                Click.on(PruebasUI.BUTTON_VIEW),
                Click.on(PruebasUI.BUTTON_SHEDULE_INTERVIEW),

                // Ingresar el título de la entrevista
                Click.on(PruebasUI.FIELD_TITTLE_INTERVIEW),
                SendKeys.of(sendInterviewTittle).into(PruebasUI.FIELD_TITTLE_INTERVIEW),

                // Ingresar texto para seleccionar entrevistador
                Click.on(PruebasUI.FIELD_INTERVIEWER),
                SendKeys.of(sendInterviewer).into(PruebasUI.FIELD_INTERVIEWER)
        );

        // Selección de la opción del dropdown
        actor.attemptsTo(
                MoveMouse.to(PruebasUI.selectOptionFromDropdown(optionToSelect)),
                Click.on(PruebasUI.selectOptionFromDropdown(optionToSelect))
        );

        // Ingreso de fecha
        actor.attemptsTo(
                Click.on(PruebasUI.FIELD_DATE),
                SendKeys.of(formattedDate).into(PruebasUI.FIELD_DATE),
                Click.on(PruebasUI.BUTTON_SAVE_INTERVIEW),
                Click.on(PruebasUI.BUTTON_INTERVIEW_PASED),
                Click.on(PruebasUI.BUTTON_SAVE_INTERVIEW_PASED),
                Click.on(PruebasUI.BUTTON_OFER_JOB)
        );
    }
}
