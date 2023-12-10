@Suite @login
Feature: CP02 - Validar login de usuario

  Background: Validar el inicio de sesion de un usuario en el sitio web

    Given El usuario ingresa al sitio web

  @ValidCredentials
  Scenario: 1 - Iniciar sesion en el sitio web con credenciales correctas
    When El usuario ingresa credenciales válidas
    Then Deberia de aparecer el nombre del usuario en la barra de navegacino de la pagina

  @InvalidCredentials
  Scenario: 2 - Iniciar sesion en el sitio web con credenciales incorrectas
    When El usuario ingresa credenciales incorrectas
    Then La pagina web no debería ocultar el formulario de registro


