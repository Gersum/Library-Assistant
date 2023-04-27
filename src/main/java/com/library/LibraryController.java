package com.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LibraryController {

    @FXML
    private TextField authorTf;

    @FXML
    private TextField publisherTf;

    @FXML
    private TextField titleTf;
    @FXML
    private TextField IDtf;
    @FXML
    private Button saveBtn;
    @FXML
    private Button closeBtn;
    @FXML
    private AnchorPane rootPane;


    @FXML
    void close(ActionEvent event) {

        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void save(ActionEvent event) {
        System.out.println("Author name is : "+authorTf.getText());
        System.out.println("Book ID is : "+IDtf.getText());
        System.out.println("Book Title is : "+titleTf.getText());
        System.out.println("Publisher name is : "+publisherTf.getText());





    }

}
