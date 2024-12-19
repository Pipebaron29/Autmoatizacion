package org.example.ui.Pruebas;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


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

    public static final Target FIELD_MIDDLE_NAME= Target.the("campo segundo nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));

    public static final Target FIELD_LAST_NAME= Target.the("campo apellidos")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));

    public static final Target OPTIONS_VACANCY= Target.the("opción vacante")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]"));

    public static Target SelectOptionvacancy(String optionText) {
        return Target.the("Seleccion Opcion").located(By.xpath("//span[contains(text(), '" + optionText + "')]"));
    }

    public static final Target FIELD_EMAIL= Target.the("campo correo")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));

    public static final Target FIELD_CONTACT_NUMBER= Target.the("numero de contacto")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));

    public static final Target FIELD_KEYWORDS= Target.the("campo palabras clave")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input"));

    public static final Target FIELD_NOTES= Target.the("campo notas")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea"));

    public static final Target ADD_CV = Target.the("agregar hoja de vida")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[2]"));

    public static final Target RADIO_BUTTON= Target.the("radio buton aceptar uso de datos")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i"));

    public static final Target BUTTON_SAVE= Target.the("boton guardar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));

}
