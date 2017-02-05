ASK HELP SITES:   http://stackoverflow.com
CODES     https://github.com/caveofprogramming/java-beginners.git 
Java operators
https://www.tutorialspoint.com/java/java_basic_operators.htm
https://en.m.wikipedia.org/wiki/List_of_Java_keywords
TheNewBoston BUCKY
https://www.youtube.com/watch?v=5u8rFbpdvds&index=2&list=PL17E300C92CE0261A
Krister Viirsaar
http://i200.itcollege.ee/#
https://www.youtube.com/watch?v=_mFnk9S1pXg&list=PLWkgPad9kpY3IWcuywjrCVQgFiF5MhEMp&index=19
https://www.youtube.com/playlist?list=PLWkgPad9kpY1Ns3Q23g1qAlE9vQbmpSKn
http://kommuun.koodikool.ee/t/projekt-puu-vanuse-arvutamine/204
KEYBOARD OPs
https://wiki.itcollege.ee/index.php/Keyboard_shortcuts
usage IntelliJ
https://www.jetbrains.com/help/idea/2016.2/keyboard-shortcuts-you-cannot-miss.html
OOP teooria eesti keeles
https://et.wikipedia.org/wiki/Objektorienteeritud_programmeerimine
http://enos.itcollege.ee/~jpoial/java/i200loeng3.html
INFO JK
http://minitorn.tlu.ee/~jaagup/kool/java/naited20/io/fail/juht.html
õppimist, boolean:
https://www.dotnetperls.com/boolean-java
õppimist, Arrays:
http://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html
õppimist, event handler:
http://docs.oracle.com/javase/8/javafx/events-tutorial/convenience_methods.htm#BABCCIHI
õppimist, javaFX:
http://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm
õppimist,
http://howtodoinjava.com/for-fun-only/best-way-to-learn-java/
http://java.about.com
JavaFX HOW TO! https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html
http://docs.oracle.com/javafx/2/get_started/hello_world.htm



TERMINAL BASH: http://ss64.com/bash/	
UBUNTU https://help.ubuntu.com/community/KeyboardShortcuts
INTELLIJ for all OPs: https://www.jetbrains.com/help/idea/2016.1/keyboard-shortcuts-you-cannot-miss.html
WINDOWS KEYBOARD: https://support.microsoft.com/en-us/help/12445/windows-keyboard-shortcuts
VIRTUAL KEYBOARD: http://gate2home.com/English-Keyboard

HOW Java? https://www.jetbrains.com/help/idea/2016.2/tutorial-creating-running-and-packaging-your-first-java-application.html
Java FX: https://www.jetbrains.com/help/idea/2016.2/javafx.html
IntelliJ Video Tutorials    https://www.jetbrains.com/idea/documentation/

IntelliJ OS X: cmd + N   
Win/Linux: Alt + Insert = generate constructor, toString, Overright methods; coywright
Ctrl + tühik = toob valikuid

DEBUG Step Over IntelliJ = 2 2 IDE debug 
https://www.youtube.com/watch?v=2Ju3yuBtop4&index=4&list=PLWkgPad9kpY1Ns3Q23g1qAlE9vQbmpSKn
Menüüst: Run > Debug > opens "Debugger", "Console" valikud all, kus näha spets ikoon: STEP OVER F8
(mis aga kipub ära kaduma, kuid kui kasutad Breakpoints punaseid nuppe, siis ilmus...) (neid valikuid saab debug-putuk peale klikkides peita)
 
 
 

 
 
 
***KuulusNumber - eemalda arv 3 ja millist nr rohkem? fori kui EI ole 3, siis add. , for (int i : tulemus), Collections
***MaagilineSeitse - leia 7 ja korruta 2ga, siis keskmine? 
int seitseKordaKaks = naide[i]*2; kahekordsedSeitsmed.add(seitseKordaKaks); ... 
   while (l < NIMI.size()) {
            summa = summa + NIMI.get(l);
            l++;

***PikadSooned - mitu sone pikemad? fori sees: naide[i].length();
***Suusailm - kaks massiivi temp-arvutusega?   
 for (int i = 0; i < NIMI.length; i++) {
            if (NIMI[i]>0){posrohkem1++;}
        }
 
***javaFX
Detektiiv by MM - kolm nähtamatut ringi värviliseks? circle3.setFill(Color.TRANSPARENT);
    setVisible lahend ka olemas 
***Foorid - hunnik punaseid ringe roheliseks?  
     Liis: ArrayList<Circle> uusRing = new ArrayList<>();   2 fori tsüklit tekitavad ringe ja värvivad
     Erik: Group root = new Group(); tsip segane... addEventHandler   1 fori tsükkel; .setTitle("Foorid");//PEALKIRI; 
    
***Joon - küsi xy kordinaadid ja joonista joon?  btn.setOnAction(new EventHandler<ActionEvent>() {
  HEA: küsib kordinaadid, vajuta nuppu NÜÜD ja alles siis teeb!
 code == KeyCode.ENTER) {
                btn.fire();
 
***Koristaja - hunnik ringe, mis puudutades kaovad, all on sõnum?
***Pixel - hunnik ristkülikuid random, klikk 2x väiksemaks, klikk kaotab? Lihtne! 2 lahendust, ühes hunnik kaste!

 ***Ring - küsi xy kordinaadid +raadius ja joonista ring? Näitab reaalajas nagu ristkülik! Teine VARIANT ka, pärats NUPP vajutust joonistab soovitud ringi
 ***Ristkulik - küsi kordinaadid ja tee ristkülik? Näitab reaalajas!!! Lisa: keerlev=slider; Stackpane; RANDOM
    setPromptText; getText;    NIMI.textProperty().addListener((observable, vanaX, uusX) -> {
    SUUREPÄRANE JAOTUS TÄNU: borderPane.setBottom(vBox); ning selle sees saab sättida, kus asub mis (slider, küsimine)
      
***Tagaajamine - ring, hiire puudutus leiab uue askoha? Math.random uus lihtsalt

     
***MATRIX
Kagunurk - maatriks muster numbritega, veeru ja rea indeksi seos leida  , topelt foridega
Kikilips - maatriks muster nullpunktidega? 2 tsükklit i + j,       IF (), millele järgneb {sout 1 else 2}
KikilipsKursusega -  ln tekitab lisarea : System.out.println();
Pyramiid raske - Nüüd paneme loode ja kagu nurga kokku ja loome pealtvaates püramiidi?
Tsirkus - numbrid ühest sajani?
 ***i200: Hashmap Arraylist => Kümme võistlejat, kel random sporditulemused? fori i, fori j, salvestab ja prindib
 
    
***OOP
Gitter > Chat - a) prindib koos ütlejatega sõnumeid, b) kustutab ühe?
Pood > Kassa - eemaldab ja lisab ja prindib nimekirja: 
Kirjanik > Pastakas - a) pastaks kirjutan lause, b) iga täht on ühik?

***Raamatukogu > Sonaraamat - leiab sõna vasted, eemaldab? 
 ArrayList<String> tsekk = new ArrayList();   
 SELLEKS:     for (int i = 0; i < tsekk.size(); i++) {
            if (toode == tsekk.get(i))
                tsekk.remove(i); }
     
***Pidu > Korter - Maja max on 10 inimest, kui inimese arv täis, rohkem juurde ei saa?
Legend > Zelda - Zelda miinus kollielud? 
 

***OOP. Proov(tunnis) > Kasutajaliides OOP, setOnAction event, 
String input = textfield.getText(); //.get Krister ka ei mäleta peast

  
***OOP. Main > Mata 2 klassiga, kus public-static-double koos foriga returnib tulmuse, kõik ühes paragrahvis:
       public static double astendamisTEHE(int arvA, int astendajaB) {
        int kordaja = arvA; //et matemaatika toimiks salvestame esialgse numbri siia ära
        for (int i = 0; i < astendajaB -1; i++) {  //-1 on vaja lisada matemaatika pärast, -1 on sest a*a muutub suuremaks ju.
            arvA = arvA * kordaja;
        }
        return arvA;}
     

***Loomad miski OOP by Jaanus Pöial
 
***i200: Hashmap Arraylist => Kümme võistlejat, kel random sporditulemused - fori i, fori j, salvestab ja prindib
 
 
 
 
 
