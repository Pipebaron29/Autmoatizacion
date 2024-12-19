Feature: pruebaQV


  @IngresoFormularioSolicitudCH
     #EntryFormApplicationCHSteps
  Scenario: validar que se pueda realizar con exito el primer formulario de solicitud de vacante
    Given Ingreso a la pagina deseada
    And ingreso los datos solicitados en el formulario
      | usuario | contraseña |
      | Admin   | admin123   |
    When ingreso en la seccion de Reclutamiento
    And Comienzo con el proceso de agregar el nuevo postulante
      | firstName | middleName | lastName | Vacancy | Email                   | contacNumber | keyWords                 | Notes                                  |
      | Luis      | Felipe     | Baron    | test    | felipebaron92@gmail.com | 3058179762   | Qa,Tester,Automatizacion | Aplicacion de pruebas automatizador QA |
    Then Acepto el uso de los datos y doy tap sobre boton guardar
    And habilito la contratacion y valido el resultado
      | Vacancy | hiring | candidato         | Estado      |
      | test    | Rahul  | Luis Felipe Baron | Shortlisted |

  @validarFormularioHastaContratacionCH
     #validateFormUntilHiringCHSteps
  Scenario: validar formulario hasta contratacion
    Given Ingreso a la pagina deseada
    And ingreso los datos solicitados en el formulario
      | usuario | contraseña |
      | Admin   | admin123   |
    When ingreso en la seccion de Reclutamiento
    And realizo el proceso de filtrado para el candidato
      | busNombre | Nombre            | Vacancy | hiring |
      | Lu        | Luis Felipe Baron | test    | Rahul  |
    Then Realizo las acciones para dar como pasada la entrevista
      | InterviewTittle | Interviewer | optionToSelect |
      | Prueba          | Ra          | Ranga  Akunuri |
    And Realizo las acciones para pasar la oferta de trabajo
    And Realizo las acciones para la contratacion y valido el estado del postulante
      | busNombre | Nombre            | Vacancy | hiring | candidato         | Estado |
      | Lu        | Luis Felipe Baron | test    | Rahul  | Luis Felipe Baron | Hired  |






