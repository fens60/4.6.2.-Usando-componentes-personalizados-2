module ies.losmontecillos.personalizados2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ies.losmontecillos.personalizados2 to javafx.fxml;
    exports ies.losmontecillos.personalizados2;
}