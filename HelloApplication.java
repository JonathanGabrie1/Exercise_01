package com.example.ejercicio_01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {

    public static void main(String[] args) {

        for (int i=1 ; i<=101 ; i++){
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if (i%3==0){
                System.out.println("fizz");
            }else if (i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
