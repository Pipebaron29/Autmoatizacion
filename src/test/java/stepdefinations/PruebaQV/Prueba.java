package stepdefinations.PruebaQV;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.tasks.Pruebas.*;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.core.webdriver.IsMobile.driver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Prueba {

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
            // Obtener los datos del postulante
            String SendfirstName = accountData.get("firstName");
            String SendmiddleName = accountData.get("middleName");
            String SendlastName = accountData.get("lastName");
            String SendVacancy = accountData.get("Vacancy");
            String SendEmail = accountData.get("Email");
            String SendcontacNumber = accountData.get("contacNumber");
            String SendkeyWords = accountData.get("keyWords");
            String SendNotes = accountData.get("Notes");

            File file = new File("C:HojaDeVida.pdf");

            try {
                theActorInTheSpotlight().attemptsTo(
                        SendFormTask.data(SendfirstName, SendmiddleName, SendlastName, SendVacancy, SendEmail, SendcontacNumber, SendkeyWords, SendNotes),
                        UploadFileTask.withFile(String.valueOf(file))
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @And("Acepto el uso de los datos y doy tap sobre boton guardar")
    public void aceptUsingData() {

        theActorInTheSpotlight().attemptsTo(
                new aceptUsingDataTask()
        );
    }
}





