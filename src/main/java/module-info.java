module com.example.fxnew {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires com.jfoenix;


    opens com.example.fxnew to javafx.fxml;
    opens com.university.aastu to javafx.fxml;
    opens com.library to javafx.fxml;

    exports com.example.fxnew;
    exports com.university.aastu;
    exports com.library;

}
