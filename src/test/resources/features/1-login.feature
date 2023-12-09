@Suite @signUp
Feature: CP01 - Validar registro de usuario

  Background: Validar el registro de la cuenta de un usuario en el sitio web

    Given El usuario navega al sitio web

  @ValidCredentials
  Scenario: 1 - Registrarse en el sitio web con credenciales correctas
    When El usuario ingresa credenciales válidas
    Then la aplicación debería ocultar el formulario de registro

