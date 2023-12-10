@Suite @signUp
Feature: CP01 - Validar registro de usuario

  Background: Validar el registro de la cuenta de un usuario en el sitio web

    Given El usuario navega al sitio web

  @ValidCredentials
  Scenario: 1 - Registrarse en el sitio web con credenciales correctas
    When El usuario registra credenciales válidas
    Then la pagina web debería ocultar el formulario de registro

  @InvalidCredentials
  Scenario: 2 - Intentar registrarse en el sitio web con credenciales incorrectas
    When El usuario registra credenciales ya existentes
    Then la pagina web no debería ocultar el formulario de registro

