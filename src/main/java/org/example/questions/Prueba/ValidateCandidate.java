package org.example.questions.Prueba;

import net.serenitybdd.screenplay.Question;
import org.example.ui.Pruebas.PruebasUI;

public class ValidateCandidate {

    public static Question <String> validatecandidate() {
        return actor ->  PruebasUI.SEARCH_CANDIDATE.resolveFor(actor).getText();
    }

    public static Question <String> validateStatecandidate() {
        return actor ->  PruebasUI.SEARCH_STATE_CANDIDATE.resolveFor(actor).getText();
    }
}
