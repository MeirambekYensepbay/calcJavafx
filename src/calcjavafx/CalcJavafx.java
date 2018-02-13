/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class CalcJavafx extends Application {
    public double a, b, c;
    public int status,count=0;
    @Override
    public void start(Stage primaryStage) {
        
        methods mt = new methods();
        
        Button btn = new Button();
        Button clear = new Button();
        
        Label lab = new Label("");
        
        Button one = new Button();
        Button two = new Button();
        Button three = new Button();
        Button four = new Button();
        Button five = new Button();
        Button six = new Button();
        Button seven = new Button();
        Button eight = new Button();
        Button nine = new Button();
        Button zero = new Button();
        Button divide = new Button();
        Button mult = new Button();
        Button minus = new Button();
        Button plus = new Button();
        Button equal = new Button();
        
        clear.setText("C");
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        zero.setText("0");
        
        divide.setText("÷");
        mult.setText("*");
        minus.setText("-");
        plus.setText("+");
        equal.setText("=");
        
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        
        Pane root = new Pane();
        
        lab.setLayoutX(0);
        lab.setLayoutY(0);
        lab.setPrefWidth(285+95);
        lab.setPrefHeight(95);
        
        lab.setDisable(true);
        
        seven.setLayoutX(0);
        seven.setLayoutY(95);
        seven.setPrefWidth(95);
        seven.setPrefHeight(95);
        
        eight.setLayoutX(95);
        eight.setLayoutY(95);
        eight.setPrefWidth(95);
        eight.setPrefHeight(95);
        
        nine.setLayoutX(190);
        nine.setLayoutY(95);
        nine.setPrefWidth(95);
        nine.setPrefHeight(95);
        
        divide.setLayoutX(285);
        divide.setLayoutY(95);
        divide.setPrefWidth(95);
        divide.setPrefHeight(95);
        
        four.setLayoutX(0);
        four.setLayoutY(190);
        four.setPrefWidth(95);
        four.setPrefHeight(95);
        
        five.setLayoutX(95);
        five.setLayoutY(190);
        five.setPrefWidth(95);
        five.setPrefHeight(95);
 
        six.setLayoutX(190);
        six.setLayoutY(190);
        six.setPrefWidth(95);
        six.setPrefHeight(95);
 
        mult.setLayoutX(285);
        mult.setLayoutY(190);
        mult.setPrefWidth(95);
        mult.setPrefHeight(95);
        
        one.setLayoutX(0);
        one.setLayoutY(285);
        one.setPrefWidth(95);
        one.setPrefHeight(95);
        
        two.setLayoutX(95);
        two.setLayoutY(285);
        two.setPrefWidth(95);
        two.setPrefHeight(95);
 
        three.setLayoutX(190);
        three.setLayoutY(285);
        three.setPrefWidth(95);
        three.setPrefHeight(95);
 
        minus.setLayoutX(285);
        minus.setLayoutY(285);
        minus.setPrefWidth(95);
        minus.setPrefHeight(95);
        
        zero.setLayoutX(0); 
        zero.setLayoutY(380);
        zero.setPrefWidth(95);
        zero.setPrefHeight(95);
        
        clear.setLayoutX(95); 
        clear.setLayoutY(380);
        clear.setPrefWidth(95);
        clear.setPrefHeight(95);
        
        equal.setLayoutX(190);
        equal.setLayoutY(380);
        equal.setPrefWidth(95);
        equal.setPrefHeight(95);
        
        plus.setLayoutX(285);
        plus.setLayoutY(380);
        plus.setPrefWidth(95);
        plus.setPrefHeight(95);
        
        lab.setAlignment(Pos.BASELINE_RIGHT);
        
        one.setOnAction((e) -> {
            lab.setText(lab.getText() +"1");
        });
        two.setOnAction((e) -> {
            lab.setText(lab.getText()+"2");
        });
        three.setOnAction((e) -> {
            lab.setText(lab.getText()+"3");
        });
        four.setOnAction((e) -> {
            lab.setText(lab.getText()+"4");
        });
        five.setOnAction((e) -> {
            lab.setText(lab.getText()+"5");
        });
        six.setOnAction((e) -> {
            lab.setText(lab.getText()+"6");
        });
        seven.setOnAction((e) -> {
            lab.setText(lab.getText()+"7");
        });
        eight.setOnAction((e) -> {
            lab.setText(lab.getText()+"8");
        });
        nine.setOnAction((e) -> {
            lab.setText(lab.getText()+"9");
        });
        zero.setOnAction((e) -> {
            lab.setText(lab.getText()+"0");
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                a = Double.parseDouble(lab.getText());
                status =1;
                lab.setText("");
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
             @Override
            public void handle(ActionEvent e) {
                a = Double.parseDouble(lab.getText());
                status =2;
                lab.setText("");
            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
             @Override
            public void handle(ActionEvent e) {
                a = Double.parseDouble(lab.getText());
                status =4;
                lab.setText("");
            }
        });
        mult.setOnAction(new EventHandler<ActionEvent>() {
             @Override
            public void handle(ActionEvent e) {
                a = Double.parseDouble(lab.getText());
                status =3;
                lab.setText("");
            }
        });
        equal.setOnAction((e) -> {
            b=Double.parseDouble(lab.getText());
            if(count==0){
                if(status==1){
                    c = mt.plus(a,b);
                }
                else if(status==2){
                    c = mt.minus(a,b);
                }
                else if(status==3){
                    c = mt.multiply(a,b);
                }
                else if(status==4){
                    c = mt.divide(a,b);
                }
                lab.setText(String.valueOf(c)+"");
            }
        });
       
        clear.setOnAction((e) -> {
            b=0;
            c=0;
            a=0;
            lab.setText("");
        });
        
        root.getChildren().addAll(lab,one,two,three,four,five,six,seven,eight,nine,zero,mult,divide,plus,minus,equal,clear);
        
        Scene scene = new Scene(root, 380, 475);
        scene.getStylesheets().add("styles/style.css");
        primaryStage.setTitle("Calculator!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
