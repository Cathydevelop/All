CMD Python:
# for commentout
“””commentout
“””

LAUNCH OPEN: ipython/		 python3 project1.py
exit() MIS VEEL VÄLJUMISEKS? command cmd+ C vist
pass - lubab meetodist väljuda
pip3 install flask 



CMD GIT IntelliJ Java:
UBUNTU https://help.ubuntu.com/community/KeyboardShortcuts
TERMINAL BASH: http://ss64.com/bash/
cd				juuretasand
cd .. 				step back
cd / 				starting from root-location
cd ~/IdeaProject
cd PROGS		
tühik, kasutatakse \	või “”	
cd 		“NAITED projekti_naiteid_2015”
cd 		ISIK\ no\ Dropbox        //TÜHIKUS \  kasutamine
cd 		"$HOME/IdeaProject/Henri Paves Mr Smith (60)"
ls
 ls *.mp3 > export.txt
ls -la		show.   ls -a 			 NÄITAB ka peidetuid
 -m
 -A
*  ˇ  or file name
— ALL
—help			kaks kriipsu sõna ees - -help
mkdir NEW create new folder: mkdir SPIKK
ctrl O, salvestab,   
ctrl C väljumine  ?cancel
enter
ctrl X välja v Q?
rm faili algusega lehm: rm ./lehm   DELETE rm
mv config .ssh/        move first file to the second folder
-uf 
u-et ei arvestaks lingitud repo/branchidega? (nagu excel disable markos :)
f-kirjutab üle
-r rekurssiivne ehk allfolder kaasaarv

2017-FRIDAY before EKSAM
git checkout . 
punkti asemel kopeerides git log kaudu numbrirea, mis vastab su mingile kommitile, siis ta näitab seda 

2017 DIARY mis juhtus 


UBUNTU
Documents - minu asjad
kodukataloog: /home/krist/IdeaProjects/  - siia ei õnnestunud projektide kloonimine
UBUNTU (Ctrl + Shift + V) kopeerimine
*siin pole C, D kettad, süsteem algab kaldkriipsuga: / kirjutad täispika rea faili leidmiseks koos alamkataloogidega, vastasel juhul otsib ta faili sama kausta indexist
*RESTART et liikuda Ubuntusse (ikoon hammasratas alt)
*Ctrl+Alt+ T = TERMINAL Ubuntu
*"Windows" hoiad all, kuvab shortcutte!!!
*SINU asjad asuvad: Documents > Public_html 
*MENÜÜ valik Ubuntu-IKOON tema enda märk viib kataloogidesse, järgnev valik 
*FAILID avab eraldi aknana, kus menüü alati vasakul ja uus tekib ka alumisele reale kuvatud kastis
*MENÜÜ Ubuntu-ikoon = FIND, sellega kirjuta DISK: see näitab partitsioone
*htop F10 TASK MANAGER
*Ctrl + L = teeb käsurea kirjetest puhtaks

REMOTE - ühel repol võib olla mitu remote, nende all võib olla mitu brachi

2017 
a) Clone failed!!! ALLA: IntelliJ Commit Changes & Update Project ei töötanud
Töö vastu võtmine ja üles laadimine käib gitiga (mitte github vaid git). Kontrolli et saad clone-add-commit-push
https://help.github.com/articles/which-remote-url-should-i-use/
http://kommuun.koodikool.ee/t/kusimus-git-kasutamise-kohta/324/2
https://www.youtube.com/watch?v=07sdJdE-vq8
http://kommuun.koodikool.ee/t/git-torgub/451
SUPPPERR:::: making brach, not MASTER
https://www.youtube.com/watch?v=G7kJRkUaVHQ
SUPPPERR
https://github.com/justmarkham - ÕPETAJA!!! http://www.dataschool.io
https://www.youtube.com/watch?v=h1e8oC7g0Ps it had many advices…
ilma võtmepaarita ei saa kasutada git@SSH allalaadimist, aga sain alla tõmmatud HTTP clone versiooni
a)a) siis YLES: VCS Commit Changes, “Perform code analysis” LINNUKE välja,  siis: COMMIT &PUSH
siis kysis ka mu git paroole: name, email kyllirist@gmail.com
aga loomulikult ei õnnestunud mul Kristeri faili commit push, error 403

b) Clone BASH:
1. FROM SETTINGS OF GITHUB:
Restrict editing to collaborators only. Public wikis will still be readable by everyone

setting multiple github account on one pc  “mherman.org managing multiple github”
 2 accounts: FIRST IS MAIN ONE
  we created a sep file to Home catalogue, was instructed via:
Host github.com
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa
Host refocusdevelop
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa2

BASH MASTER
cd going-to-new-location-folder
rm -rf .git  to-remove-all-git-repo-previous-info
git init
kullis-MacBook-Pro:ZADANIE kullirist$ git add .
kullis-MacBook-Pro:ZADANIE kullirist$ git commit -m "FIRST commit" git remote -v    kontroll kas on remote olemas if there is remote then I have to remove it….
git remote add origin git@refocusdevelop:refocusdevelop/ZADANIE.git
git push -u origin master


kullis-MacBook-Pro:ZADANIE kullirist$ git remote remove origin    DELETING THE ORIGIN 
git remote add origin git@refocusdevelop:refocusdevelop/ZADANIE.git
kullis-MacBook-Pro:ZADANIE kullirist$ git fetch
kullis-MacBook-Pro:ZADANIE kullirist$ git log
git push -u origin master

kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -uf origin master
ERROR: Permission to Ankors/Tasks.git denied to kristdevelop.
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote -v
git remote remove origin   DELETING THE ORIGIN 
git remote add origin git@refocusdevelop:Ankors/Tasks.git
git push -uf origin master
“Branch master set up to track remote branch master from origin”



………………………..
koos JK:
kompileerimine  javac *.java
cd src
kullis-MacBook-Pro:src kullirist$  javac *.java
kullis-MacBook-Pro:src kullirist$ ls
Main.class	Main.java					//näe, class on juurde tekkinud, seega funkas!

kullis-MacBook-Pro:src kullirist$ java Main	//avab!??

((mul oligi küsimus, et kuidas bach ???COMPILE in terminal HOW, go to the folder, then:
siin on veel selline lahendus välja pakutud:
./configure
make
make install??))

…………………………..

…………………………..
git config --list
selle väljundi ehk outputis viimased read näitavad infot, mida git su kohta teab ja kasutab:
user.name ...
user.email ...
remote.(github repod nt)

Ask directly:
git config user.name
git config user.email

To change:
git config --global user.name "Minu Nimi”    
git config --global user.email "your_email@example.com"
Lisaks, kui keegi tahab ajaloos nime muuta: https://help.github.com/articles/changing-author-info/1
git config —global —edit
git commit —amend —reset-author
git config --global core.editor nano     muudab ära et läheb wisse
…………………………..
config näitas ka arvuti MAC aadressi ära

…………………………
VIGA: polnud netiühendust # ping github.com    siis sai kätte koduka!
………………………...

MINE enossee, siis /home/krist/public_html
krist@enos:~/public_html$ git init  TULEMUS: Initialized empty Git repository in /home/krist/public_html/.git/
tulemus: Reinitialized existing Git repository in /Users/kylli/Desktop/.git/
………………………….

………………………….
KRISTER kommuunikoodikoolis:
tee repo
git init
git add —all    (git add --all)
git commit -m "teade"
git remote add origin su-giti-repo-link
git push
http://kommuun.koodikool.ee/t/git-torgub/451/5
………………………….
KRISTER: VIDEOD 9tk:
https://www.youtube.com/watch?v=P1s2_MQqskQ&index=3&list=PLWkgPad9kpY3IWcuywjrCVQgFiF5MhEMp
***git log näitab muudatusi, üleval on koodiriba, mille kopperi, kui tahan näha, mis tegi: 
git show 94803456903459603596
git pull - laeb alla, kui githubi veenis tehtud muudatusi...
git fetsh
git log - näitab oleme midagi kommittinud
………………………….
ALLA LAADIMINE
use it with HTTP!
git clone https://github.com/kristdevelop/HelloWorld.git 
ls     mille peale nägin et tali mu helloworld alla laadinud, mis ta varem ei olnud teinud
cd HelloWorld    /Users/kylli/Desktop   (siis muuda midagi, mida tahad üleslaadida)
git status      näitab mida ta üles laeb
…………………………..
UUESTI & SUCCESSFUL 
with my own laptop additing exisiting data (java file):
create new repo on Github.com without any aditiional file like readme, license, etc
cd HelloWorldrepo
git init
git add .            git add pomm.java       git add -A
git commit -m "First commit”
git remote add origin https://github.com/kristdevelop/HelloWorldrepo.git
git remote -v
git push -u origin master    see lükkabki muutused serverisse
Username for 'https://github.com': kristdevelop
Password for 'https://kristdevelop@github.com': 
+nüüd võid luua READme githubis kirjeldusega 


IN GITHUB.create new repo on Github.com (AINE)  
2. IN TERMINAL
cd HelloWorldrepo
git init
git add .                  
git commit -m "First commit”
git remote add origin https://github.com/kristdevelop/HelloWorldrepo.git
git remote -v
git push -u origin master    
Username for 'https://github.com': kristdevelop
Password for 'https://kristdevelop@github.com': 



+nüüd luua READme githubis kirjeldusega
 
…………………………..
gitignore 
on tekstifail folderis, kus asjad asuvad, mis sisaldab sõna näiteks SODI, siis ta ei luba sellisedi leiduvaid faile üles laadida   *SODI*  
…………………………..
.gitignore 
tekstifail mis sisaldab sõna näiteks SODI, siis ta ei luba sellisedi leiduvaid faile üles laadida   *SODI* 
sodi
*sodi*
*doc
kala/*  - jätab lisamata need, mis on kala sees

…………………………..

krist@enos:~$ cd .ssh
krist@enos:~/.ssh$ nano authorized_keys
…
git KEY VÕTI ENOS serverisse võtmete kopeerimine:	
git remote -v    näitab kaht httml aadressi, on vaja väljavahetada SSH aadressideks

2017
…………………………..
VÕTMED
asukoht path: (/Users/kullirist/.ssh/id_rsa): /Users/kullirist/.ssh/id_rsa.pub.
kullis-MacBook-Pro:~ kullirist$ cd .ssh/
ls
ssh-keygen -t rsa
The key fingerprint is:
SHA256:DvQXxvEkr0yKuhxyZ2/YshGOQPrlCYqxOh0CVD0t+lg kullirist@kullis-MacBook-Pro.local
kullis-MacBook-Pro:.ssh kullirist$ cat id_rsa.pub 
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDThMx+oiIxSk7st6FT+xE7YyYn8vt6lfhvVga1ksYXIbl8L0MwvWfHk1gnQzFIKQ2NsrOJ6P+3Phdu4s2xfGLaJ5HZVsjTFmEY/GUwXTC7CMBXA2KeGsy/fx0IlVkc9TKQwArlTodW1z3svgmLJCmxsGb9L/wae5mgvYSq6emL5smy1A6Y6D1g6X4ZlQggfpIc2nNj8vN+W4HdHtuTWSRpjlP3yQZoBfTGaxOCNJRzZvcDX4E/4/x+ftwFmfUYz/NJ4Olu8ne/kEZ8DJh9d5lKHcsL/Hc7PMEGgDFDBpEbjmtnfnuPhb3UL/ttryFfWUnV8Y0VzT22J2JqKcl3Brcv kullirist@kullis-MacBook-Pro.local
kullis-MacBook-Pro:.ssh kullirist$ ssh -T git@github.com



veel huvitavat
http://stackoverflow.com/questions/5617211/what-is-git-remote-add-and-git-push-origin-master





AINE = IT EELKURSUS... SOFTs (main) + ⌘ MAC
"Arvestus"
HINDED: http://enos.itcollege.ee/~lvosandi/check.html > I253 grading bot

MAIN: https://wiki.itcollege.ee/index.php/I253_Informatika_eelkursus

BY: 
Lauri Võsandi, Arti Zirk, Marvin Martinson, Kristjan Peterson, Taavi Teearu, Mohanad Aly 
by Arti Zirk https://git.wut.ee/arti/i237   arti.zirk@gmail   git.wut.ee/arti/koduleht/
https://wiki.itcollege.ee/index.php/I253_Informatika_eelkursus
https://wiki.itcollege.ee/index.php/I253_Presessional_Informatics (DETAILSEM)
https://echo360.e-ope.ee/ess/portal/section/fbde1292-f109-46fe-88de-33d0257c0e19 https://echo360.e-ope.ee/ess/portal/section/6435daaf-a9c9-4edf-b257-6dfe17590a0d

MINU KOOLIKODUKAS: http://enos.itcollege.ee/~krist/  (SFTP 22)
enos.itcollege.ee/~krist/PROOV/
MINU KOOLIARVUTIS:
/home/krist/public_html - siin ongi minu kodukas vist ikkagi Documents all
http://enos.itcollege.ee/~krist/index.html
/shared - siin on programme

Sisselogimine kooli Linux Ubuntusse: 
student/ studnet, kui ei taha enda parooli kasutada

HEA ABIKS https://www.mediawiki.org/wiki/Help:Formatting
WIKI: https://wiki.itcollege.ee/index.php/User:Krist
………………………………
HOW TO: without mouse:
Selekteerida
Aknaraami lohistamine



………………………………..
SOFTs COLLECTIONS:
;;;OS, Windows, Linux Ubuntu
;;;Terminal, PuTTY, Zoc6
;;;bitbucket = github git.wut.ee  , git.wut.ee/arti/koduleht/
;;;Eclipse vs Intelli J, Sublime text, XCode = Notepad++
;;;FileZilla vs Cyberduck
;;;www: W3schools
;;;Cinema 4D, 3DMAX,
;;;Sequel pro for sql = Heidi sql?
MATA : apps MALMATH, PHOTOMATH, WOLFRAM ALFA
NetBeans
;;;GIT versioonihaldustarkvara
;;;Win10, One Drive, Office 365 - mulle tasuta, terra ruumi; Word, Excel of 2016, OneNote, Outlook, PPT
…………………………………………………………………..
WIndows10 ja Ubuntu allalaadimiseks SOFT siit: http://upload.itcollege.ee/iso/   saad kolmeks kuuks - ÄRA VÕTA WIN sealt, mujalt saad eluks ajaks
siit saad windows10 aga tasuta: https://e5.onthehub.com/WebStore/ProductsByMajorVersionList.aspx?cmi_cs=1&cmi_mnuMain=bdba23cf-e05e-e011-971f-0030487d8897&ws=6ece1175-619b-e011-969d-0030487d8897&vsro=8   võta see versioon : Windows 10 Multiple Editions 32/64-bit (English) - Microsoft Imagine. Pane oma kooli EMAILI AADRESS Microsoft Web ostupoes. Saadeti kontrollemail. Lõpeta konto loomine, mis oli suht tülikas protsess.
order number:   100502814429; Product Key: K2944-NXXWQ-9CBH2-J88V4-9W3GT; Microsoft Imagine EULA    Agreement Number: 1203994822
DUAL BOOT - arvuti sisselogimisel otsustad kuhu operatsioonisüsteemi
 …………………………………………………………………..
INTERNET
KIIRE WIFI: http://wut.ee/wifi Robootikaklubi wifi parol u4HNj3sgYK
Koolivõrk on katkendlik, Mac on probleeme! Mis see on?? “HP võrgutüüp; access points on samad", aga proovi ka EDU ja ROBOOTIKA võrke
…………………………………………………

KEYBOARD @ ˇ~ˇ  
*~Tilde asub tavaliselt üleval-vasakul on keyboard ~
*FN all näitab miskeelne on klaviatuur
WINDOWS downloadisime vajaliku, nagu:
*NOTEPAD++ software
Võta alla kogu zip package DESKTOP peale, ava, kasuta selle .exe
*PuTTY krist@enos.itcollege.ee
*Ctrl + L = teeb käsurea kirjetest puhtaks

ASJAD LINUX
/home/krist/
/shared - siin on programme


MAC MacBook PRO kasutamine
*NB! MU KASUTAJA USER on: /Users/kylli/….
***kopeerida kogu folderi  locationPATH, mine õun+i infoga näed seda
*lähed faili ja vaatad, mis seal on kirjas sees: "Hello World!" sain ette: Terminalis käsuga (cd ~/Desktop/Java/Hello/) kausta sisse
*Kuidagi annab terminali avamisel default kausta määrata, aga ma ei saanud seda esmapilgul tööle, jätsin katki.

IDE teeb kogu selle tüütu töö ära:
*kui algselt Tab Completion ei tööta, siis annab selle peale panna paari lihtsa käsuga: http://www.macdaddynews.com/2014/07/12/enable-tab-completion-mac-os-x-terminal/  
*Vaikimisi on Mac'is kasutusel Bash shell. Kodukaustas on võimalik luua .bashrc, kuhu sisse saad kirjutada oma aliased mingitele käskudele, a'la:
alias minu_programm='java /home/Kasutaja/Java/MinuProgramm'
*see käsk uuendab ta operatsioonisüsteemi, nii nagu Windowsis on Update
Neid aliaseid võid luua palju tahad. Mõistlik on neid luua tegevustele, mille kirjutamine võtab palju aega, kuid mida käivitad tihti. A'la Linuxis on mul tüüpiline alias "uptodate", mille sisuks on "sudo apt-get update && sudo apt-get upgrade && sudo apt-get dist-upgrade && sudo apt-get autoremove" - saan kõik need käsud käivitada ühe aliasega, ilma et peaks iga kord pikka lauset kirjutama
*IntelliJ ja kiirklahvid Mac'il: https://resources.jetbrains.com/assets/products/intellij-idea/IntelliJIDEA_ReferenceCard_mac.pdf2


UBUNTU
*siin pole C, D kettad, süsteem algab kaldkriipsuga: / kirjutad täispika rea faili leidmiseks koos alamkataloogidega, vastasel juhul otsib ta faili sama kausta indexist
*RESTART et liikuda Ubuntusse (ikoon hammasratas alt)
*Ctrl+Alt+ T = TERMINAL Ubuntu
*"Windows" hoiad all, kuvab shortcutte!!!
*SINU asjad asuvad: Documents > Public_html 
*MENÜÜ valik Ubuntu-IKOON tema enda märk viib kataloogidesse, järgnev valik *FAILID avab eraldi aknana, kus menüü alati vasakul ja uus tekib ka alumisele reale kuvatud kastis
*MENÜÜ Ubuntu-ikoon = FIND, sellega kirjuta DISK: see näitab partitsioone
*htop F10 TASK MANAGER
*Ctrl + L = teeb käsurea kirjetest puhtaks

TERMINAL-FTP ENOS SERVER (õnnetus)
*Failid alumine-vasakul käsk: CONNECT TO SERVER, kirjuta sinna:
sftp://krist@enos.itcollege.ee
Seda saad teha ka mõne muu terminaliga või kodus oma arvutis: 
ssh krist@enos.itcollege.ee  küsib parooli

*FILE ZILLA software lae alla FTP win 64 (koolis oli olemas)

*INTELLIJ
https://www.jetbrains.com/idea/documentation/


VÕTMED = käsud

TERMINAL ssh krist@enos.itcollege.ee
***kasuta TAB
*ls    *dir
*mv move
*nano 
*cat failinimi  
*cp kopeeri
*rm kustuta
*cd ainult selle kasutamine viib sind alati otse algusesse home, avab-otsib katalooge
*ls     =  cat  = nano   =  more (info jagatud lehtede kaupa)
*ls public_html/
*cat näitab mis on sees
*cat quota-kasutus.txt näitab palju sinu ENOS serveris on sul ruumi
*cat kui sisestad ilma järgneva sisendi andmisetta, jääb ootama konkreetset mida näidata
*Ctrl+ C läheb EXIT käsust!!!
*ctrl+L teeb käsuread puhtaks
* -- help kaks kriipsu kirjutatakse sõna ette 
*nano avab-otsib faile
*nano "uus fail" kirjtas failinime ringi???
*nano test.txt
*ctrl +X = välja
*ctrl +O = salvesta
*ctrl +C = CANCEL välja 
*TÜHIKUTE PUHUL FAILI NIMES pead kasutama tagurpidi kaldkriipsu  \\\
cat uus/ fail 
*gedit Documents/public_html/ avab selle graafiliselt
*ifconfig -a kuvab asbul kõik koos peidetud süsteemiga
*ls -a näitab ka peidetut, pikki faile, mis algavad punktiga 
*ls -l näitab rohkem kaustu
*ls -la näitab kaustu, faile, koos peidetuga
*lsusb -D millised device kaasatud
*lsusb --help näitab abi mis asi on
*lsblh arvuti partitsioone
*lsb_release -a ??? kas õigesti kirjutatud?  arvuti andmed
*kernel lts = long time spport lts, kernel uuendamine võib juhtuda
*Kasutaja õiguste rea lugemine kolmes osas: esimene näitab KASUTAJA, teine GRUPI, kolmas KÕIGI ÕIGUSEID (drwxr -xr -x+. 2 krist......)
r lugeda aint tohib
x jooksutada tohib
w
*dir
*man mkdir avab manuaali, ning 
suure hulga teksti sees saad kasutada otsingut Shift+ /    toksi otsitav!!!
*rm -rf / ära tee, kustutab kõik f tähendab force, r tähendab rekursiivselt ehk alamkataloogilt alt kõik ka
*man rm MANUAAL
*arch mis protsessor on 32 bit 4 GIGA mälu
*lcpc -h h on help
*vi test.txt vi on miski hull keskkond hoopis teiste käskudega INSERT, noolenupud ei tööta ei reageeri. Välja saad ainult: ESC   :    q!
*HOOKS ASJADE PRINT, mis on folderis: Kullis-MacBook-Pro:HOOKS kylli$ ls *  > export.txt
*kasutades cd lähed alati algalgusesse, sattusin home ja ei osanud sealt oma arvutisse tagasi ronida. See aitas:
Kullis-MacBook-Pro:home kylli$ cd /Users/kylli/Desktop
*mkdir .ssh  - lood kataloogi  mkdir code
*rmdir .ssh/authorized_keys KUSTUTAB
*clear või ctrl L teeb terminali akna puhtaks
*kopeeri cp  ~/Desktop/POMM/pomm.java .

minu MAC taga Git BASH sama asi sisselogimine
ssh-keygen -t ecdsa -P “"
…………….
Zoc asemel PuTTY = Putty GEN
kuna seal peab alati parooli trükkima, siis on olemas salvestamiseks Putty GEN ehk putty key, mis 2048 bit RSS (mis on mobiiliIDs ka muideks)
Kuidas see toimib, ta teeb avaliku võtme ja teeb teise privaatse võtme authorized keys

versioonihaldus GIT samuti teeb sama….

remote host (sihtaadress) - ssh
local host - ssh klient
…………………………………………………………………..
VIRTUALBOX  - ei soovitata; kasutades WIN10 nõuab mahtu ketast 50 GB ja Ubuntu mate 15 (Ubuntu mate on teisest Ubuntust parem, opereerib paremini). 32 bit versioon võib osutada aeglaseks. Virtualiseemine tugi. BIOS-sees. Näiteks, MAC tihti on virtualiseerimine väljalülitatud. WIFI nett: seadistasime sama, et oleks minu põhiarvutiga ühenduses = BRIDGE nett. Kuidas ta seda tegI??? 2 VARIANTI: DOUALBOOT laadides arvutisse või VirtualBox




..................................

AINE = IT EELKURSUS
avalik või privaatsed võtmed sisselogimiseks
Milleks see? =saab arvutist sisse logida enosesse või githubi ilma et küsiks parooli

kus need mu MacBook arvutis asuvad: Last login: Sun Oct  9 17:54:34 on ttys001
Kullis-MacBook-Pro:.ssh kylli$ ls
github_rsa github_rsa.pub id_ecdsa id_ecdsa.pub id_rsa id_rsa.pub known_hosts
Kullis-MacBook-Pro:.ssh kylli$ cat id_rsa.pub
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDPCuafUXCCm2BRzZCU4Cka+T3P1st7CtW9s2gmqRoanKRJHFhc2/WllOx9uJ0R9VreInjMzEw9dQrlWDQ5QtCc980kM8NvULZo/qHopO1G3NoFfYegfB1753y5c8fyEaHYum670PmxKCnDfd7O3kG8ts9mSGFycihIdad+sUYm5shP0EQOS/TZu82xU7PPMoroThDXTFf1QGqnaUGYNgJzKo9IoORSL/o5X8NXnS0WFLCoPUMxiSCbF0v6FFrzU66+i2ppTA/lNX7iPGHnKxutMhgnJBMUIlOTBDqwOQqk72rizdqRbqyioBXDoFTYhagGoiO0Wk7s4+h1HkC05eD7 kylli@Kullis-MacBook-Pro.local
……………………………………………...

a) sshfs on MAC et TO DOWNLOAD This is a filesystem client based on the SSH File Transfer Protocol. GitHub - libfuse/sshfs: A network filesystem client to connect to SSH 

PRIVATE KEY CREATING ON local machine mac:
Kullis-MacBook-Pro:Desktop kylli$ ssh-copy-id
-bash: ssh-copy-id: command not found
Kullis-MacBook-Pro:Desktop kylli$ cat .ssh/
Kullis-MacBook-Pro:Desktop kylli$ cd
Kullis-MacBook-Pro:~ kylli$ cat .ssh/
github_rsa      github_rsa.pub  id_ecdsa        id_ecdsa.pub    known_hosts     
Kullis-MacBook-Pro:~ kylli$ cat .ssh/id_ecdsa
id_ecdsa      id_ecdsa.pub  
Kullis-MacBook-Pro:~ kylli$ cat .ssh/id_ecdsa.pub 
ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBEPw406sLIU+cR04tO/Nj9nEkDRgqYuYVj+MpJ/y0uTBfo2wvKHeaEziwi1/hIvrDugB1jXvOpuehqNjBY0I9DI= kylli@Kullis-MacBook-Pro.local
b) siis tuleb see kopeerida oma enos serveris, teed seal lahti faili nimega authorized_keys ja kopeerid õlevaloleva lingi sinna. Ctrl X hakkab faili kinni pannes küsima, kas salvestada
nano 2.2.6                    File: .ssh/authorized_keys
 
krist@enos.itcollege.ee
ssh-keygen   =>    loob sellise folderi, milles tekib kaks võtit:   ~/.ssh 
id_rsa on salajane võtmepaari pool
id_rsa.pub on avalik võtmepaari pool
 
SAMMUD
ssh-keygen			(teeb: generating public+private rsa key par (/home/krist/.ssh/id.rsa)        It created directory ‘/home/krist/.ssh'
enter 			ei pea midagi panema
enter 			ei pea midagi panema
cd .ssh
ls
cat id_rsa.pub		see näitab ära genereeritud võtme avalikus võtmepaari pooles!!
siis kopeeidki õigesse sihtarvutisse: ssh-copy-id krist@enos.itcollege.ee
TULEMUS: proovi ssh minna sisse enosesse, kui ta ei küsi paroole ja läheb sisse, siis ju toimibki
…..
LINUZ ja MAC ssh on sisseehitatud. Windowsis peab panema sisse aga putty ja puttygen ning selle alla laadima





INTELLIJ
INTELLIJ



INTELLIJ
class, method or variable PACKAGE > PUBLIC CLASS > public static void main

?? how to up it to my github = VCS > Checkout…. NB! git SSH lingi jaoks peab olema tehtud võtmepaar

Miks?  
*SDK not defined
*Lombok requires annotation process. Settings > build >Compiler ENABLE

Asukoht MacBook: seal on pluginad vist JAR nimelised
~IdeaProjects/
Library > Jav	a > JavaVirtualMachines> jdk1.8.0_111.jdk > Contents> New Project> Home

topelt klikk C - viib settingutesse LIB moodulid
parem klikk C - new java class

SHORTCUTS
double Shift - search
⌘ +E recent files
⌥ F7  = FIND
⌃J = View read about it 
⌘F12 = Navigate, ENTER
⇧F6 = Rename
RUN: option + shift + fn + f10	
ctrl + f10 otseteest (Kui oled juba ühe korra käivitanud oma programmi by Krister)
sout      Type s, press ⌘J and select sout - Prints a string to System.out
psvm	public status void main
fori
automaatne kuvamine = class name and click ⌃Space 

Multiple projects in window opened
Multiple modules: https://www.youtube.com/watch?v=EEp5hOfD9hc

problems MIGHT:
Kui täpitähed ei ilmu JavaFXis või konsoolis: File -> Settings -> Editor -> File Encodings -> IDE ja Project Encoding: UTF-8

***Debugimine: STEP OVER (F8) kasutamine reahaaval näitab tulemust
a) windows: Ctrl + shift + fn + F8 avab akna “breakpoints”, vali + plussiga “Breakpoints”, pane klassi ja meetodi nimi
b) mac: ⌘ + Shift + F8-ga
c) aga SAMA ASI on ka Run > View breakpoints
https://www.youtube.com/watch?v=2Ju3yuBtop4&index=4&list=PLWkgPad9kpY1Ns3Q23g1qAlE9vQbmpSKn
*sain selle tööle ainult siis, kui RERUN, siis DEBUG sealtsamast alt kastikesest Consolest vasakul. Tulemus Console parel käsud aktiveerusid, sain klikkida reahaaval
VIDEO, 2-2 IDE DEBUG

***C-kettake (sinine)(SRC/COM alll) klikk avab valiku, kus saab ka RUN valida
https://www.jetbrains.com/help/idea/2016.2/tutorial-creating-running-and-packaging-your-first-java-application.html
Go to: src   
***START: File | New | Project, select: java, next, next, name & finish
***SRC: “src” doubleclick, File | New | Java Class, give a name as? com.example.test2.test2 - this is for naming PACKAGE > to start with main code CLASS (sinine C kettaga src all)
NB! .java faili nimi peab olemas sama mis on public class nimi... 
public class PEAB ALGAMA SUURE TÄHEGA ning olema sama fails nimega
***EDITOR: start with psvm
***RUN 
***JAR? 
***if all ok. Packaging: File | Project Structure > Artifacts & Build | Build Artifacts. 
hulk seadinguid:
OUT folder out/artifacts & JAR run configuration: Run | 
Edit Configurations. + choose JARtake


UBUNTU-WIN

UBUNTU
Shift - toob kätte ülemised käsud
AltGr - toob kätte ülemised paremad

https://www.jetbrains.com/help/idea/2016.3/keyboard-shortcuts-you-cannot-miss.html

Find action by name	Ctrl+Shift+A
Show the list of available intention actions .	Alt+Enter
Switch between views (Project,Structure, etc.).	Alt+F1
Switch between the tool windows and files opened in the editor. 	Ctrl+Tab
Show the Navigation bar.	Alt+Home
Insert a live template.	Ctrl+J
Surround with a live template.	Ctrl+Alt+J
Edit an item from the Project or another tree view.	F4
Comment or uncomment a line or fragment of code with the line or block comment.	Ctrl+Slash
Ctrl+Shift+Slash
Find class or file by name.	Ctrl+N
Ctrl+Shift+N
Duplicate the current line or selection.	Ctrl+D
Incremental expression selection.	Ctrl+W and Ctrl+Shift+W
Find/replace text string in the current file.	Ctrl+F
Ctrl+R
Find/replace text in the project or in the specified directory	Ctrl+Shift+F
Ctrl+Shift+R







.

.

.





