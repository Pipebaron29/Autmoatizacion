package stepdefinations.PruebaQV;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.questions.Prueba.ValidateCandidate;
import org.example.tasks.Pruebas.*;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class EntryFormApplicationCHSteps {

    @Given("Ingreso a la pagina deseada")
    public void onTheBelGoHome() {
        OnStage.theActorCalled("").attemptsTo(Open.browserOn().thePageNamed("pages.Choucair"));
    }

    @And("ingreso los datos solicitados en el formulario")
    public void SendDataForm(DataTable dataTable) {
        List<Map<String, String>> AccountDataList = dataTable.asMaps();

        for (Map<String, String> accountData : AccountDataList) {
            String usuario = accountData.get("usuario");
            String contraseña = accountData.get("contraseña");


            theActorInTheSpotlight().attemptsTo(
                    SendDataFormTask.data(usuario, contraseña)
            );
        }
    }

    @And("ingreso en la seccion de Reclutamiento")
    public void SendDataForm() {


        theActorInTheSpotlight().attemptsTo(
                new entryRecluimentTask()
        );
    }

    @And("Comienzo con el proceso de agregar el nuevo postulante")
    public void SendForm(DataTable dataTable) {
        List<Map<String, String>> AccountDataList = dataTable.asMaps();

        for (Map<String, String> accountData : AccountDataList) {

            String SendfirstName = accountData.get("firstName");
            String SendmiddleName = accountData.get("middleName");
            String SendlastName = accountData.get("lastName");
            String SendVacancy = accountData.get("Vacancy");
            String SendEmail = accountData.get("Email");
            String SendcontacNumber = accountData.get("contacNumber");
            String SendkeyWords = accountData.get("keyWords");
            String SendNotes = accountData.get("Notes");

            theActorInTheSpotlight().attemptsTo(
                    SendFormTask.data(SendfirstName, SendmiddleName, SendlastName, SendVacancy, SendEmail, SendcontacNumber, SendkeyWords, SendNotes)
            );
        }
    }

    @And("Acepto el uso de los datos y doy tap sobre boton guardar")
    public void aceptUsingData() {

        theActorInTheSpotlight().attemptsTo(
                new aceptUsingDataTask()
        );
    }

    @And("habilito la contratacion y valido el resultado")
    public void userEnable(DataTable dataTable) {

        List<Map<String, String>> accountDataList = dataTable.asMaps();

        for (Map<String, String> accountData : accountDataList) {
            String Vacancy = accountData.get("Vacancy");
            String hiring = accountData.get("hiring");

            String candidato = accountData.get("candidato");
            String estadoEsperado = accountData.get("Estado");

            theActorInTheSpotlight().attemptsTo(
                    userEnableTask.data(Vacancy,hiring)
            );

            theActorInTheSpotlight().should(
                    seeThat("Validación del candidato", ValidateCandidate.validatecandidate(), equalTo(candidato)),
                    seeThat("Validación del estado del candidato", ValidateCandidate.validateStatecandidate(), equalTo(estadoEsperado))
            );
        }
    }
}







