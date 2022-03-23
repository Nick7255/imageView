package com.example.imageview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


//imageview is a node used for painting images loaded with images
//image = photograph
//imageview = pictureframe

public class Controller {
    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    //here we create a variable that will hold the image we want to display
    //once the button is clicked
    //REMEBER IMAGES ALWAYS GO IN THE COM.EXAMPLE UMDER RESOURCES FILE TO BE USED
    //EVERYWERE ESLSE GIVES ERROR

    Image myImage = new Image(getClass().getResourceAsStream("image2.jpg"));


    //method of our button once clicked to switch to yhe image
    public void displayImage(ActionEvent event) {
        myImageView.setImage(myImage);
    }

}