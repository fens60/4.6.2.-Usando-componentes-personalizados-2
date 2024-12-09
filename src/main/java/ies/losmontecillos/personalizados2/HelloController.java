package ies.losmontecillos.personalizados2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private CampoTextoBoton campoTextoBotonNombre;

    @FXML
    private CampoTextoBoton campoTextoBotonApellido;

    @FXML
    private Label labelResultado;

    @FXML
    private void initialize() {
        //configurar acción para el CampoTextoBoton de Nombre
        campoTextoBotonNombre.setOnButtonAction(() -> {
            String textoNombre = campoTextoBotonNombre.getText();
            labelResultado.setText("Nombre guardado: " + textoNombre);
        });

        //configurar acción para el CampoTextoBoton de Apellido
        campoTextoBotonApellido.setOnButtonAction(() -> {
            String textoApellido = campoTextoBotonApellido.getText();
            labelResultado.setText("Apellido guardado: " + textoApellido);
        });
    }
}

