i200 KV summary: Muutujad:
int a = 5;     double a = 8.76;         //Loo uus
(int) Math.pow(a, b);                   // a astmes b
a / b;                                  //jagamine
a == b;    a != b;    a <= b;            //võrdlemine
if (!laevadTabamata()) {    //gameover, kui pole laevu, hüüumärk muudab väite vastupidiseks
int c = (int) 6;    //muuda tüüpi? int c = Integer.parseInt(a);
char a = 'k';       //üksik täht

h.add((int) ...);
h.clear();                         // tühjenda eelnevad katsed

mmmm.put(muutujanimiTulemused);       a.put("Peeter", 35); // SALVESTA tulemus. Vaata veel: kogum väärtus

int uusmuutuja = (int) ((ArrayList) tulemused.get("Kaido")).get(7);  //get annab seitsmenda väärtuse
.show
muutujaNimi = muutujaNimi.replace('r', 'l');    //asendab esimese

massiiv:
a.contains("õue");                      //sisaldab
a.equals(Loom)                           //võrdlemine
a.replace("õue", "arvutisse"); // "Lähme arvutisse mängima." esimene sõna asendatakse teise sõnaga
a.isEmpty();            //kas on tühi

Objekt (ehk klassid) 
1.1. public class MinuProgramm {public static void main(String[] args) {
        Hobune uusMuutuja = new Hobune();    // defineerin uue hobuse objekti, Hobune on teise alamklassi nimi
        System.out.println(uusMuutuja.kaal); // küsin välja hobuse kaalu teisest klassist
    }}
1.2.public class Hobune {int kaal = 100000000;}



Kogum VÄÄRTUSI
***massiiv[] = Hoiab mitmeid väärtusi korraga, aga ainult 1 andmetüüpi ja kogust muuta ei saa
int[] a = new int[6];                   //6 kohta, (loendamine algab nullist)
a[5] = 999;
String[] a = {"mina", "olen", "sõnede", "massiiv"};
KLASS => Arrays klass on massiividega manipuleerimiseks:                   
Arrays.sort(a);                          //sordi
Arrays.toString(a) = System.out.println(Arrays.toString(a));  //prindi

***ArrayList= Hoiab ERI andmetüüpi väärtusi ja nimekirja pikkus muutub vastavalt sisule
ArrayList a = new ArrayList();
a.add("Sõne");
a.add(54);
a.add(87.90);
System.out.println("a = " + a);
        
        
//Loo uus
ArrayList a = new ArrayList();
ArrayList<String> a = new ArrayList();
ArrayList<Integer> a = new ArrayList();
//Kasutamine
a.get(i)     //mis seal on
a.set(i, b)  //asenda
        
        
***HashMap = Hoiab <võti, väärtus> andmeid; Siin ei ole indekseid ehk ei ole ka võtmete järjekorda võimalik määrata
...Nagu massiividel on Arrays abiks, on ArrayListil, HashMapil ja muudel Collectionitel ka oma abistav klass




Õpetus_boolean
true == true;
true != false;
true == true && false == false;  //mõlemad tingimused peavad olema tõesed
true == false || false == false; // üks tingimustest peab olema tõene

"Kui" tüüpi valikud on if, switch ja try-catch
"Kuni" tüüpi tsüklid on while, for, for each ja do-while
***IF Teha programmis lihtsaid valikuid (==, !=, <=, >=, string.equals())
if (tingimus) {tegevus} else {alternatiivne tegevus}



Java API 
System.in                       System.out.print("Minu nimi on " + nimi);
%s              //STRING                automaatika sõna "asendamisel" teksti sees
%d  %f          //TÄISARV     //REAALARV          
%n              //uus rida, näiteks: System.out.printf("Tere%nuus%nmaailm!");
Math= Math.pow(5, 7);
Integer
Double
File= File klass on selleks, et fail programmi tuua, FileReader on selleks, et faili sisu lugeda, FileWriter on selleks, et faili sisu muuta
public class importJSON {


Scanner
Scanner minuLoodudSkannimine = new Scanner(System.in);
System.out.println("Mis on sinu nimi?");
String nimi = minuLoodudSkannimine.nextLine();                  //Loeb kasutaja sisestust kuni rea lõpuni
System.out.println("Mis on sinu vanus?");
int vanus = minuLoodudSkannimine.nextInt();                    //Võtab kasutajalt täisarvu
System.out.printf("Sinu nimi on %s ja vanus %d", nimi, vanus);  //nende kohta üleval!


Thread => Thread.sleep(3000);   //Paneb programmi ajutiselt pausile. N: et aega simuleerida //see on 3 sek

Timer  => 
Timer timer = new Timer();
timer.schedule(new TimerTask() {public void run() {sinu toimingud} }, 5000, 1000);  //kogu koodijupp

         ...throws Exception - vea kontroll funk
 
 EXTENDS class Neo saab fighther omadused, overwright
         
     

OOP doing:
1. Generate Matrix - start - tüüpiline et genereeri midagi
2. Output this Matrix - end - siis väljasta

 FINAL DAY
         //import java.awt.*;   EI TOHI
         
ARRAYLIST
        Pusis seal ise ka kuidas ArrayListist Srting Arrayd teha
        
        
        
        
     

