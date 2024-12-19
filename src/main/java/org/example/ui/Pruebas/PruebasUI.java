package org.example.ui.Pruebas;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PruebasUI {

    public static final Target FIELD_ENTRY_DOCUMENT = Target.the("campo de ingreso de CC")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

    public static final Target FIELD_ENTRY_PASSWORD = Target.the("campo de ingreso de contraseña")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

    public static final Target BUTTON_LOGIN = Target.the("button de registro")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

    public static final Target FIELD_RECRUITMENT = Target.the("campo reclutamiento")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));

    public static final Target BUTTON_ADD_LEADER = Target.the("opción agregar empleado")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));

    public static final Target FIELD_FIRST_NAME = Target.the("campo primer nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));

    public static final Target FIELD_MIDDLE_NAME = Target.the("campo segundo nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));

    public static final Target FIELD_LAST_NAME = Target.the("campo apellidos")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));

    public static final Target OPTIONS_VACANCY = Target.the("opción vacante")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]"));

    public static Target SelectOptionvacancy(String optionText) {
        return Target.the("Seleccion Opcion").located(By.xpath("//span[contains(text(), '" + optionText + "')]"));
    }

    public static final Target FIELD_EMAIL = Target.the("campo correo")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));

    public static final Target FIELD_CONTACT_NUMBER = Target.the("numero de contacto")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));

    public static final Target FIELD_KEYWORDS = Target.the("campo palabras clave")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input"));

    public static final Target FIELD_NOTES = Target.the("campo notas")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea"));

    public static final Target ADD_CV = Target.the("agregar hoja de vida")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[2]"));

    public static final Target RADIO_BUTTON = Target.the("radio buton aceptar uso de datos")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i"));

    public static final Target BUTTON_SAVE = Target.the("boton guardar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));

    public static final Target BUTTON_SHORTlIST = Target.the("boton lista corta")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));

    public static final Target BUTTON_SAVE_SHORTlIST = Target.the("boton Guardas lista corta")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target SEARCH_CANDIDATE = Target.the("buscar candidato por nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div"));

    public static final Target SEARCH_STATE_CANDIDATE = Target.the("buscar estado candidato")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div"));

    public static final Target OPTIONS_VACANCY_SEARCH = Target.the("opción vacante")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));

    public static Target SelectOptionvacancySearch(String optionText) {
        return Target.the("Seleccion Opcion").located(By.xpath("//span[contains(text(), '" + optionText + "')]"));
    }

    public static final Target OPTIONS_HIRING_SEARCH = Target.the("opción vacante")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div"));

    public static Target SelectOptionhiringSearch(String optionText) {
        return Target.the("Seleccion Opcion").located(By.xpath("//span[contains(text(), '" + optionText + "')]"));
    }

    public static final Target BUTTON_SEARCH_CANDIDATE = Target.the("boton buscar candidato")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]"));

    public static final Target BUTTON_VIEW = Target.the("boton ver candidatura")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[7]/div/button[1]"));

    public static final Target BUTTON_SHEDULE_INTERVIEW = Target.the("boton programar entrevista")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));

    public static final Target FIELD_TITTLE_INTERVIEW = Target.the("campo entrevista")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));

    public static final Target FIELD_INTERVIEWER = Target.the("campo entrevistador")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input"));

    public static Target selectOptionFromDropdown(String optionText) {
        return Target.the("opción del desplegable").located(By.xpath("//span[contains(text(), '" + optionText + "')]"));
    }

    public static Target selectOptionFromDropdownFilter(String optionText) {
        return Target.the("opción del desplegable").located(By.xpath("//span[contains(text(), '" + optionText + "')]"));
    }

    public static final Target FIELD_DATE = Target.the("campo fecha")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input"));

    public static final Target BUTTON_SAVE_INTERVIEW = Target.the("boton guardar entrevista")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target BUTTON_INTERVIEW_PASED = Target.the("boton guardar entrevista")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));

    public static final Target BUTTON_SAVE_INTERVIEW_PASED = Target.the("boton guardar entrevista pasada")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target BUTTON_OFER_JOB = Target.the("boton oferta de trabajo")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));

    public static final Target BUTTON_SAVE_OFER_JOB = Target.the("boton guardar oferta de trabajo")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target BUTTON_HIRE = Target.the("boton contratar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));

    public static final Target BUTTON_SAVE_HIRE = Target.the("boton contratar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target FIELD_NAME_FILTER = Target.the("campo nombre para filtrar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));

}
