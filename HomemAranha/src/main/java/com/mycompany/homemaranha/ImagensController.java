package com.mycompany.homemaranha;

import java.io.IOException;
import javafx.fxml.FXML;

public class ImagensController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}