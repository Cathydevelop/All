# pomm
arendus laevadepommitamine


# NÖTES
class ja põhimeetod!

 int [] faketulemused = [23, 45, 67, 78, 99];   aga kasutatakse {...} vahel
 
  for (int i = 0; i < tulemused.size(); i++) {
  aga piisab
  for (int i = 0; i < 10; i++) {
  
  ArrayList<String>ajutine = new ArrayList<>(tulemused);     <> vahele String
  
 public void lisamine(String s, Integer z){      //NB! Pärast sulgudesse sisu lisamist muutus kohe viga ok
 
 
 
 
 package Template_Tudeng;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox aken = new VBox();    //miks siin 10, mis teeb
        aken.setSpacing(7);
        aken.setAlignment(Pos.CENTER);
        Scene stseen = new Scene(aken, 500, 400);
        //arendamisel: SEE ON AKEN, mis kuvab statistika lehekülge    Pane vaade2 = new Pane();    Scene statistika = new Scene(vaade2, 200, 100);
        primaryStage.setScene(stseen);
        primaryStage.show();

        Label teema = new Label("Sisesta tekst:");
        TextField annanimi = new TextField();
        annanimi.setPromptText("vihje, siia kirjuta tekst");

        Label arv = new Label("Sisesta arv:");
        TextField annanumber = new TextField();
        annanumber.setPromptText("vihje, siia kirjuta arv");

        Button reageerimine = new Button("Kliki, et lisada");
        reageerimine.setOnAction((event) -> {
            LisamineKlass t = new LisamineKlass("tr");
            t.lisaTeema(annanimi.getText(), annanumber.getText(), aken);

            //väljakutsumine ehk käivitamine button sees  - - miskitegevusmeetod();
        });


        Funktsioonid func = new Funktsioonid();   //kutsume teise klassi välja //Ja miks siin () kohus pole märksõna??+

        Button nupp1 = new Button("Tsekka tulemust!");   //see on arendamisel, et see midagi tagastaks. Ning et kuvaks tulemust samas javaFX aknas??!
        nupp1.setOnAction(event -> {
            //Funktsioonid func = new Funktsioonid("midagi");   kas see ei peaks mitte asuma siin
            func.lisamine(annanimi.getText(), Integer.parseInt(annanumber.getText())); annanimi.clear(); annanumber.clear();
        });

        Button best = new Button("Mis on parim tulemus?");
        best.setOnAction(event -> {func.suurimNumber(); annanimi.clear(); annanumber.clear();});



        aken.getChildren().addAll(teema, annanimi, arv, annanumber, reageerimine, nupp1, best);
        //pane.getChildren().add(vbox);         //whats that for, what if I delete it????
    }
}






package Template_Tudeng;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LisamineKlass extends Main{

    String teema;
    public LisamineKlass(String teema) {
        this.teema = teema;
    }


    public void lisaTeema (String teema, String arv, VBox asukoht) {

        Label lisaTeema = new Label();
        lisaTeema.setText(teema + "=> " + arv +  ", aga kulus hoopis tunde: :) " );

        asukoht.getChildren().add(lisaTeema);
    }





    /*
    public void tseki (int nr) {
    }
    */


}









package Template_Tudeng;
import java.util.ArrayList;
public class Funktsioonid{    
    // Nii. Siia funktsioonid. Arraylistid
    ArrayList<String> annanimiKOIK = new ArrayList<>();
    ArrayList<Integer> annanumberKOIK = new ArrayList<>();

    public void lisamine(String str, Integer zip){      //NB! Pärast sulgudesse sisu lisamist muutus kohe viga ok
        annanimiKOIK.add(str);
        annanumberKOIK.add(zip);

                //äddisin nad siia kõhtu
    }

    //siia fori mõlemale

    public void suurimNumber(){

        int score = 0;
        String name = "";
        for (int i = 0; i < annanumberKOIK.size(); i++) {
            if (annanumberKOIK.get(i) > score) {
                mis = annanumberKOIK.get(i);
                kes = annanimiKOIK.get(i);
            }
        }
        System.out.println("Parim tulemus " + mis + "punkti sai: " + kes);
    }

}



   
