package stepdefinations.PruebaQV;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.questions.Prueba.ValidateCandidate;
import org.example.tasks.Pruebas.*;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class validateFormUntilHiringCHSteps {

    @And("realizo el proceso de filtrado para el candidato")
    public void FilterCandidate(DataTable dataTable) {

        List<Map<String, String>> accountDataList = dataTable.asMaps();

        for (Map<String, String> accountData : accountDataList) {

            String busNombre = accountData.get("busNombre");
            String Nombre = accountData.get("Nombre");
            String Vacancy = accountData.get("Vacancy");
            String hiring = accountData.get("hiring");

            theActorInTheSpotlight().attemptsTo(
                    FilterCandidateTask.data(busNombre, Nombre,Vacancy, hiring)
            );
        }
    }

    @Then("Realizo las acciones para dar como pasada la entrevista")
    public void SendDataForm(DataTable dataTable) {

        List<Map<String, String>> accountDataList = dataTable.asMaps();

        for (Map<String, String> accountData : accountDataList) {

            String SendInterviewTittle = accountData.get("InterviewTittle");
            String SendInterviewer = accountData.get("Interviewer");
            String optionToSelect = accountData.get("optionToSelect");


            theActorInTheSpotlight().attemptsTo(
                    entryRecluiment1Task.data(SendInterviewTittle, SendInterviewer, optionToSelect)
            );
        }
    }


    @Then("Realizo las acciones para pasar la oferta de trabajo")
    public void passOfferJob() {

        theActorInTheSpotlight().attemptsTo(
                new passOfferJobTask()
        );
    }

    @Then("Realizo las acciones para la contratacion y valido el estado del postulante")
    public void hirePass(DataTable dataTable) {

        List<Map<String, String>> accountDataList = dataTable.asMaps();

        for (Map<String, String> accountData : accountDataList) {

            String busNombre = accountData.get("busNombre");
            String Nombre = accountData.get("Nombre");
            String Vacancy = accountData.get("Vacancy");
            String hiring = accountData.get("hiring");

            String candidato = accountData.get("candidato");
            String estadoEsperado = accountData.get("Estado");


            theActorInTheSpotlight().attemptsTo(
                    hirePassTask.data(Vacancy, hiring),
                    hirePass1Task.data(busNombre, Nombre)
            );

            theActorInTheSpotlight().should(
                    seeThat("Validación del candidato", ValidateCandidate.validatecandidate(), equalTo(candidato)),
                    seeThat("Validación del estado del candidato", ValidateCandidate.validateStatecandidate(), equalTo(estadoEsperado))
            );
        }
    }


}

