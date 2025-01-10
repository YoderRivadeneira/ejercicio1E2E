Feature: Flujo de compra en SauceDemo

  Scenario: Completar una compra satisfactoriamente

    Given el usuario inicia sesión con las credenciales del json
    When el usuario agrega dos productos al carrito
    And procede al checkout de los productos agregados al carrito
    And completa el formulario de compra con los datos del archivo json
    Then el mensaje de confirmación debería ser "THANK YOU FOR YOUR ORDER"
