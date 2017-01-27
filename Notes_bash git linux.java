BACH: GIT & GITHUB + UBUNTU
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








