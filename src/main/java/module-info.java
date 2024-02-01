module com.example.welcomeapp {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.welcomeapp to javafx.fxml;
    exports com.example.welcomeapp;
}