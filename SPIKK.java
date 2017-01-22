my MÄRKMED
CLASS{}
MAIN() { ... } 
{ ... } it includes METHOD having args (argumendid kogum väärtusi)
// PUBLIC - kättesaadav kogu sellesama klassi sees
//PUBLIC STATIC - kättesaadav ka mujalt klassidest; STATIC tähendab, et meetodi välja kutsumiseks ei pea eraldi Objekti looma?
// PRIVATE tähendab, et see meetod on kättesaadav ainult siinses 
// boolean tähendab, et meetod peab lõpuks return'ima booleani tulemuseks
*funny: windows arvutites pole gitti tuleb install; paljud arvavad et macbookis pole bashi
	
UBUNTU https://help.ubuntu.com/community/KeyboardShortcuts
TERMINAL BASH: http://ss64.com/bash/



ALGUS
public class Standard {					 //KLASS kutsume välja klassi meetodiga String tekst
public static void main(String[] args) { 		//meetod
		System.out.println("Hey You there!"); } //meetod oskus-tegevusega looksulud vahel
} 

public class MingiAsi{					//KLASS
public static void peamine(String args[]) {		//meetod nimega "peamine"
for(int nr=0; nr<10; nr++) {				//tsükkel
System.out.println("Vastus: " + nr);}}
}

//JavaFX STANDARD
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception { //mis see teeb, throws Exception
//JavaFX
public class Rahakott extends Application		
public class Rahakott {
    public static void main(String[] args) {
        int rahahunnik = 10;
        int toit = 2;
        rahahunnik = rahahunnik - toit;
        String rahahunnikALLES = rahahunnik + " eurot";
        System.out.println(rahahunnikALLES); }
}

	    //i200: JavaFX
public class MinuKlass extends Application {
    @Override
    public void start(Stage primaryStage)  {         //JavaFX algab start(), mitte main()   !!!!!
        primaryStage.setTitle("MinuÄpp");
        primaryStage.show();}
}

	    
	    //OBJEKTIDE DEFINEERIMISEGA: LOOMINE AVAMINE 
	    //Trump-pomm + näide objektide defineerimine
public class Main extends Application {
Menu menu = new Menu();} 
seadistanMiskiAsja();				//mention it, loomine - võib olla ka ühesõnaga
int laevaPikkusPx = 50;
Stage SeeOnMangulaud;			//määrab piraadilaeva; Stage on programmiaken
Image avapilt = new Image("piraadilaev.png"); //Loo pilt. Sulgudes nimi. Ka viide?
ImagePattern laevaMuster = new ImagePattern(avapilt);
Lauahaldus HaldurMina; //viide teisele klassile nimega "Lauahaldur" selleks et teda siin klassis väljakutsuda  
HaldurMina.loonLaevad(); // tühjad sulud, et läheks käima!!! Lauahaldus HaldurMina; on enne defineeritud. Lauahaldus on klass.
public Stage menuWindow = new Stage();		//miks siin peab public ees olema??
public static Neo neo; // there is a Neo 
public static int fieldHeight = 300;
public static boolean faceLeft;
Smith[] smithArray = new Smith[10]; // there can be up to 10 smiths
public ScoreReader scoreReader = new ScoreReader(); //public ees, et oleks KOGU selles klassis kättesaadav
public Brawl(){ // this method launches the game. AVAB MEETODI
addSmith(0); // adds the very first smith.  SULGUDES
smithCounter = 0; // zero smiths killed in the beginning of the game; miks siin int ees pole?
readKeys(neo, strikeZone); // 2 asja
faceLeft = true;

	
		   
	    //meetodid:
1) public main() { try....// siis siit hakkab tegevus
   public Main() { try....// ilmselt ei ole vahet kas suur või väike algustäht
2) public void start(Stage primaryStage) throws Exception { //JavaFX Stage loob aknakasti väljaku
        seadistanMiskiAsja();				//mention it, loomine
3) public static void main(String[] args)    { ... } 
4) public static int suvaT2ring() {			//?mis? public static int meetod arvu-genereerimiseks?
        return (int) (Math.random() * 6 + 1);}		//tagastamisel genereerib arvutuse

     

ALGUS Mr.Smith=MENU
public class Menu {
    public Stage menuWindow = new Stage(); // makes main menu window
    public Menu(){	//STANDARD
        makeMenu();}
    public void makeMenu(){     // method that adds all the main menu items together
        Pane menuContent = new Pane(); // container for the menu content
        Scene menuContentFrame = new Scene(menuContent, Brawl.fieldLength, Brawl.fieldHeight); // window resizer, holds content
        menuWindow.setScene(menuContentFrame); // sets window resizer into the main menu window
        menuWindow.show(); // displays the window
...			   

		   
		   
	    


ARGS LIST: 
int	float double long		Math.abs() 
		String nimetus = "miskikirjutis";
		String taring[][] = {			//näitest: vurflite_liitmine
		int nimetus = 150;	
		int [] nimetus = {1, 222, 3, 77};  	//massiiv, NB arrays-klass importida 
		int[][] lauaAlgseis = new int[9][9];
		int m2ngijat2ring2 = 1 + (int) (Math.random() * 6);
		lauaAlgseis[i][j] = (int) (Math.random() * 1.05); 	//???mis int peab siin olema (sulgudes int)
		sisend = TextIO.getlnDouble();		//???mis see teeb
	
// suhtlemine
	System.out.println("Sisesta: ");
	System.out.printf("Nimi on: %s, tema vanus: %d ja palgaks saab %f%n", saadudNimi, saadudVanus, saadudPalk);  //%n kirjutab selle uuele reale
	Scanner	klaviatuurilt = new Scanner(System.in);	//scanner enne import
	//klaviatuur.next();				//tahetakse miskit sõne vastuseks, aga see ei salvetsu
	String nimi = klaviatuurilt.next();		//nüüd aga salvestub, salvestab küsitu sisuliselt muutuja defineerimise kaudu. 
	int arvnimi = klaviatuurilt.nextInt();		//Tegu enne oli sõne muutujaga, nüüd arvudega

//tsükkel, tingimused:
	if (antudArv > 90) { siis vasta sout println(); }
	else if () { }
	else { sout }
//equals
	if (sõne.equals("Tartu")) { .... }
	if (a == b) { sout } 				//== nii ei soovita ei sõne ega arrays puhul

	if (Arrays.equals() )

	// = omistame miski väärtuse
	// == see on nagu küsimärk, kas a on võrdne b? Ei: == "Tartu", vaid sõne.equals
 	if (a == 5 && b == 6) // mõlemad tõesed
 	if (a == 5 || b == 6) // üks neist tõene

// Nullist üheksani:
for (int i = 0; i < 9; i++) { 
 j++	//lisab ühevõrra

//while tsükkel
 	while() { sout } 			//niikaua kui tingimus täidetud. Töötab nii kaua kuni näeb break; käsku.
 	// Mängi enda tsükkel. 
	while (true) {




//NÄITEID:
//Kuva 10 korda Tere!
  int algus = 0;
        while (algus < 10) {
            System.out.println("Tere!");
            algus = algus + 1;


String[] xy = input.split("-"); // poolita x-y string kaheks

int x = Integer.parseInt(xy[0]) - 1; // muuda string int'iks

else if (tabamus == 0) {

boolean labi = kasOnMangLabi(lauaAlgseis); // Käivita meetod, mis vaatab laua üle 
	if (labi == true) { // Kui laevasid ei ole, siis
		break; // läheb tsükkel katki ja...


MUU
//import java.awt.*; viska välja see, see on vaba algne grafaikapakett ja läheb uutega tylli!!!
               
//seadistamsest         
        manguvaljak = new GridPane();
        HaldurMina = new Lauahaldus(manguvaljak, lauaPikkusLaevades, lauaLaiuslaevades, laevaPikkusPx);    //see annabki lauale halduse õigused. Tekkis aga ei tee midagi
        Scene scene = new Scene(manguvaljak, lauaPikkusLaevades * laevaPikkusPx, lauaLaiuslaevades * laevaPikkusPx);
        mainGameSquare = new Stage();
        scene.setFill(Color.DEEPSKYBLUE);
        mainGameSquare.setScene(scene);
        mainGameSquare.show();
		
		
TEXT in BOLD
	title.setFont(Font.font("Arial", FontWeight.BOLD, 14));   //title on defineeritud
   
		
		
		if (Brawl.finalSmithCount > 0 && Brawl.finalSmithCount < 2) {
            highScoreFailure.setText("You killed " + (Brawl.finalSmithCount) + " Smith"); // if just one smith killed
        } else if (Brawl.finalSmithCount > 1) {
            highScoreFailure.setText("You killed " + (Brawl.finalSmithCount) + " Smiths"); // it multiple smiths killed
        } else {
            highScoreFailure.setText("Use arrows to move, Spacebar to strike and Down to dodge bullets"); // if no smiths killed KORDAB JUHISEID UUESTI KUI POLE SAAVUTANUD
        }
		
		
EXTENDS
public class Neo extends Fighter {
public Neo () { // this is neo, ta erineb teistest, siia kirjutatakse tema erioamdused. 
	//Tal on KÕIK mis on olemas "Fighter" klassis
    }
}
