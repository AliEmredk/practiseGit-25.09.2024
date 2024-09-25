module dk.easvae.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easvae.gitexercise to javafx.fxml;
    exports dk.easvae.gitexercise;
}