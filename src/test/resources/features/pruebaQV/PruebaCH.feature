Feature: pruebaQV


  @ValidarIngresoUsuarioEnElCampolNOT
     #ValidateUserEntryInTheFieldlATSteps
  Scenario: validar que se pueda ingresar el usuario en el campo usuario
    Given Ingreso a la pagina deseada
    And ingreso los datos solicitados en el formulario
      | usuario | contraseña |
      | Admin   | admin123   |
    When ingreso en la seccion de Reclutamiento
    And Comienzo con el proceso de agregar el nuevo postulante
      | firstName | middleName | lastName | Vacancy | Email                   | contacNumber | keyWords                 | Notes                                  |
      | Luis      | Felipe     | Baron    | test    | felipebaron92@gmail.com | 3058179762   | Qa,Tester,Automatizacion | Aplicacion de pruebas automatizador QA |
    Then Acepto el uso de los datos y doy tap sobre boton guardar





