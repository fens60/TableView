module es.ieslosmontecillos.tableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableview to javafx.fxml;
    exports es.ieslosmontecillos.tableview;
}