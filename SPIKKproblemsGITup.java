problems and GIT up
2017-01
GIT PUSH: wiki.itcollege.ee/index.php/I253_Informatika_eelkursus#Neljas_teema:_Git_ja_SSH_v.C3.B5tmed
  
kullis-MacBook-Pro:~ kullirist$ ls -a   //et näha selle user .ssh kausta, kus on peidus võtmed
  cat .ssh/               //et näha sisse: id_rsa       id_rsa.pub   known_hosts 
  ls .ssh/*.pub          //et näha sisse faili, mille nimi sisaldab "pub"
  cat .ssh/id_rsa.pub   //et näha koodi,provaidib selle
  ssh   //to see which kind commands it possibly includes!!!
  ssh-keygen  //to gebereate new, shows and asks where in which name to genereate it, no need for code in my PC
  mv id_rsa2* .ssh/    KUI JUHTUB VALESSE KOHTA, siis me MOVE TO better LOCATION
  ls .ssh/*.pub        To see its full PATH
  cat .ssh/id_rsa2.pub TO COPY ITS CODE
  
  
Problem: THAT MUST BE OFF FROM SETTINGS OF GITHUB:
Restrict editing to collaborators only
Public wikis will still be readable by everyone

setting multiple github account on one pc 
http://mherman.org/blog/2013/09/16/managing-multiple-github-accounts/#.WIS417Fh2Rt
  we created a sep file to Home catalogue, was instructed via:
Host github.com
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa
Host refocusdevelop
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa2
2 accounts: FIRST IS MAIN, the second needs specification who is pushing??? git remote add origin git@refocusdevelop:refocusdevelop/ZADANIE.git

	
	
BASH MASTER
cd .....
rm -rf .git  to-remove-all-git-repo-previous-info
git init
kullis-MacBook-Pro:ZADANIE kullirist$ git add .
kullis-MacBook-Pro:ZADANIE kullirist$ git commit -m "FIRST commit"
git remote -v    kontroll kas on remote olemas if there is remote then I have to remove it….
git remote add origin git@refocusdevelop:refocusdevelop/ZADANIE.git
git push -u origin master

kullis-MacBook-Pro:ZADANIE kullirist$ git remote remove origin    DELETING THE ORIGIN 
git remote add origin git@refocusdevelop:refocusdevelop/ZADANIE.git
kullis-MacBook-Pro:ZADANIE kullirist$ git fetch
kullis-MacBook-Pro:ZADANIE kullirist$ git log
git push -u origin master

kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -uf origin master
ERROR: Permission to Ankors/Tasks.git denied to kristdevelop.

Saturday test push to someone' repo called Tasks
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote -v
git remote remove origin      //DELETING THE ORIGIN  
git remote add origin git@refocusdevelop:Ankors/Tasks.git
git push -uf origin master
“Branch master set up to track remote branch master from origin”


Sunday 22.01 WELLDONE
omaarvutist vaid ZADANIE täiendamine ainult:
git add .
git commit -m "Sunday13oo"
git push

Sunday 22.01 WELLDONE
pushing with IntelliJ said it is sussesscul but actually didnt upload all even src/ javafiles, but bash did it well!
cd .....
git init
git add .
git commit -m "Up arendusfailid"
git push

nüüd saan sellest aru:
Jüri Ahhundov Kas keegi teab kuidas ma saan enda githubi lükata koodi üles, mille ma olen kristeri repost klooninud?
Erik Ehrbach 
Kui klooninud oled, siis .git kaust vaja ära kustutada ja uus git repo initsialiseerida. 
Seejärel defineerid juba remote repo ära, mille githubis teinud ole ja teedki pushi sinna


LONG MEMO = DIARY Saturday 21.01
Last login: Sat Jan 21 12:25:57 on ttys000
kullis-MacBook-Pro:~ kullirist$ cd /Users/kullirist/IdeaProject/EKSAM
kullis-MacBook-Pro:EKSAM kullirist$ pwd
/Users/kullirist/IdeaProject/EKSAM
kullis-MacBook-Pro:EKSAM kullirist$ ls
javaEksam
kullis-MacBook-Pro:EKSAM kullirist$ git init
Initialized empty Git repository in /Users/kullirist/IdeaProject/EKSAM/.git/
kullis-MacBook-Pro:EKSAM kullirist$ git clone https://github.com/refocusdevelop/ZADANIE.git
Cloning into 'ZADANIE'...
warning: You appear to have cloned an empty repository.
kullis-MacBook-Pro:EKSAM kullirist$ ls
ZADANIE		javaEksam
kullis-MacBook-Pro:EKSAM kullirist$ cp -r javaEksam/* ZADANIE/
kullis-MacBook-Pro:EKSAM kullirist$ cd ZADANIE/
kullis-MacBook-Pro:ZADANIE kullirist$ ls
javaEksam.iml	out		src
kullis-MacBook-Pro:ZADANIE kullirist$ git add .
kullis-MacBook-Pro:ZADANIE kullirist$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   .DS_Store
…….
	new file:   src/OOP/Zelda.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   .DS_Store
	modified:   src/.DS_Store

kullis-MacBook-Pro:ZADANIE kullirist$ git commit -m "lühikirjeldus tehtud muudatustest"
[master (root-commit) e12be2d] lühikirjeldus tehtud muudatustest
 49 files changed, 1356 insertions(+)
 create mode 100644 .DS_Store
 create mode 100644 javaEksam.iml
 create mode 100644 out/.DS_Store
 create mode 100644 out/production/javaEksam/.DS_Store
….
 create mode 100644 src/OOP/Zelda.java
kullis-MacBook-Pro:ZADANIE kullirist$ git push
remote: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: unable to access 'https://github.com/refocusdevelop/ZADANIE.git/': The requested URL returned error: 403
kullis-MacBook-Pro:ZADANIE kullirist$ git remote
origin
kullis-MacBook-Pro:ZADANIE kullirist$ git remote -a
error: unknown switch `a'
usage: git remote [-v | --verbose]
   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
   or: git remote rename <old> <new>
   or: git remote remove <name>
   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
   or: git remote [-v | --verbose] show [-n] <name>
   or: git remote prune [-n | --dry-run] <name>
   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
   or: git remote set-branches [--add] <name> <branch>...
   or: git remote get-url [--push] [--all] <name>
   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    -v, --verbose         be verbose; must be placed before a subcommand

kullis-MacBook-Pro:ZADANIE kullirist$ git remote remove origin
kullis-MacBook-Pro:ZADANIE kullirist$ git remote add origin git@github.com:refocusdevelop/ZADANIE.git
kullis-MacBook-Pro:ZADANIE kullirist$ git push
fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master

kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin master
ERROR: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE kullirist$ ls
javaEksam.iml	out		src
kullis-MacBook-Pro:ZADANIE kullirist$ ls -a
.		..		.DS_Store	.git		javaEksam.iml	out		src
kullis-MacBook-Pro:ZADANIE kullirist$ rm -r .git
override r--r--r--  kullirist/staff for .git/objects/03/e3838897e1aefd77b3ae7181cb7ac84748a459? Y
override r--r--r--  kullirist/staff for .git/objects/0c/eba2341517ec715b2a7ee37d4dcc3a9c43d169? ^C
kullis-MacBook-Pro:ZADANIE kullirist$ rm -rf .git
kullis-MacBook-Pro:ZADANIE kullirist$ git init
Initialized empty Git repository in /Users/kullirist/IdeaProject/EKSAM/ZADANIE/.git/
kullis-MacBook-Pro:ZADANIE kullirist$ git status
On branch master

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.DS_Store
	javaEksam.iml
	out/
	src/

nothing added to commit but untracked files present (use "git add" to track)
kullis-MacBook-Pro:ZADANIE kullirist$ git add .
kullis-MacBook-Pro:ZADANIE kullirist$ git commit -m "First"
[master (root-commit) 51ed244] First
 49 files changed, 1356 insertions(+)
 create mode 100644 .DS_Store
 create mode 100644 javaEksam.iml
 create mode 100644 out/.DS_Store
 create mode 100644 out/production/javaEksam/.DS_Store
...
 create mode 100644 src/OOP/Zelda.java
kullis-MacBook-Pro:ZADANIE kullirist$ git remote add origin git@github.com:refocusdevelop/ZADANIE.git
kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin master
ERROR: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin master
ERROR: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE kullirist$ git fetch
kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin master
ERROR: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE kullirist$ git checkout -b test
M	.DS_Store
Switched to a new branch 'test'
kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin test
ERROR: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE kullirist$ git global
git: 'global' is not a git command. See 'git --help'.
kullis-MacBook-Pro:ZADANIE kullirist$ 
kullis-MacBook-Pro:ZADANIE kullirist$ git --help
usage: git [--version] [--help] [-C <path>] [-c name=value]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Reapply commits on top of another base tip
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch
   push       Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
kullis-MacBook-Pro:ZADANIE kullirist$ cd ..
kullis-MacBook-Pro:EKSAM kullirist$ cd ZADANIE2
kullis-MacBook-Pro:ZADANIE2 kullirist$ git init
Reinitialized existing Git repository in /Users/kullirist/IdeaProject/EKSAM/ZADANIE2/.git/
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote add origin git@github.com:Ankors/Tasks.git
fatal: remote origin already exists.
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote remove origin
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote add origin git@github.com:Ankors/Tasks.git
kullis-MacBook-Pro:ZADANIE2 kullirist$ git fetch
warning: no common commits
remote: Counting objects: 3, done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From github.com:Ankors/Tasks
 * [new branch]      master     -> origin/master
kullis-MacBook-Pro:ZADANIE2 kullirist$ git pull
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> master

kullis-MacBook-Pro:ZADANIE2 kullirist$ git branch --set-upstream-to=origin/master master
Branch master set up to track remote branch master from origin.
kullis-MacBook-Pro:ZADANIE2 kullirist$ git pull
fatal: refusing to merge unrelated histories
kullis-MacBook-Pro:ZADANIE2 kullirist$ git log
commit b1f98fdcd4a3f94902852007f461230002a8a5d5
Author: Krister Viirsaar <krister.viirsaar@gmail.com>
Date:   Fri Feb 5 14:55:53 2016 +0200


commit ec19986caaf2472dfc15811f1b88ce4061aed1de
Author: Krister Viirsaar <krister.viirsaar@gmail.com>
Date:   Sat Jan 30 21:35:51 2016 +0200

    prepare for exam session 2

commit 60913f4c1b64dcd2286c14adddb0a71c1e6452a5
Author: Krister Viirsaar <krister.viirsaar@gmail.com>
kullis-MacBook-Pro:ZADANIE2 kullirist$ ls
javaEksam.iml	out		src
kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -f

ERROR: Permission to Ankors/Tasks.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -f
ERROR: Permission to Ankors/Tasks.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE2 kullirist$ cd ..
kullis-MacBook-Pro:EKSAM kullirist$ cd ..
kullis-MacBook-Pro:IdeaProject kullirist$ cd EKSAM
kullis-MacBook-Pro:EKSAM kullirist$ cd IdeaProject
-bash: cd: IdeaProject: No such file or directory
kullis-MacBook-Pro:EKSAM kullirist$ cd ZADANIE2
kullis-MacBook-Pro:ZADANIE2 kullirist$ ls
javaEksam.iml	out		src
kullis-MacBook-Pro:ZADANIE2 kullirist$ cd ..
kullis-MacBook-Pro:EKSAM kullirist$ cd ..
kullis-MacBook-Pro:IdeaProject kullirist$ cd ..
kullis-MacBook-Pro:~ kullirist$ cd Kristdevelop
-bash: cd: Kristdevelop: No such file or directory
kullis-MacBook-Pro:~ kullirist$ cd IdeaProject
kullis-MacBook-Pro:IdeaProject kullirist$ cd kristdevelop
kullis-MacBook-Pro:kristdevelop kullirist$ MMArendusMuusikaSQL
-bash: MMArendusMuusikaSQL: command not found
kullis-MacBook-Pro:kristdevelop kullirist$ cd MMArendusMuusikaSQL
kullis-MacBook-Pro:MMArendusMuusikaSQL kullirist$ git init
Reinitialized existing Git repository in /Users/kullirist/IdeaProject/kristdevelop/MMArendusMuusikaSQL/.git/
kullis-MacBook-Pro:MMArendusMuusikaSQL kullirist$ cd ..
kullis-MacBook-Pro:kristdevelop kullirist$ cd 
.DS_Store                                 MMArendusMuusikaSQL/                      untitled9/
ABC-backup about works here/              untitled2 GOAL plus LISAmaterjalid/       
MINU VARIA harjutamine/                   untitled8 TwoScene switch with functions/ 
kullis-MacBook-Pro:kristdevelop kullirist$ ls
ABC-backup about works here			MMArendusMuusikaSQL				untitled8 TwoScene switch with functions
MINU VARIA harjutamine				untitled2 GOAL plus LISAmaterjalid		untitled9
kullis-MacBook-Pro:kristdevelop kullirist$ cd ..
kullis-MacBook-Pro:IdeaProject kullirist$ cd Eksam
kullis-MacBook-Pro:Eksam kullirist$ ls
ZADANIE		ZADANIE2	javaEksam
kullis-MacBook-Pro:Eksam kullirist$ cd ZADANIE2
kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -uf origin master
ERROR: Permission to Ankors/Tasks.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE2 kullirist$ cd ..
kullis-MacBook-Pro:Eksam kullirist$ cd ZADANIE
kullis-MacBook-Pro:ZADANIE kullirist$ git remote list
error: Unknown subcommand: list
usage: git remote [-v | --verbose]
   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
   or: git remote rename <old> <new>
   or: git remote remove <name>
   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
   or: git remote [-v | --verbose] show [-n] <name>
   or: git remote prune [-n | --dry-run] <name>
   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
   or: git remote set-branches [--add] <name> <branch>...
   or: git remote get-url [--push] [--all] <name>
   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    -v, --verbose         be verbose; must be placed before a subcommand

kullis-MacBook-Pro:ZADANIE kullirist$ git remote -v
origin	git@github.com:refocusdevelop/ZADANIE.git (fetch)
origin	git@github.com:refocusdevelop/ZADANIE.git (push)
kullis-MacBook-Pro:ZADANIE kullirist$ git push
fatal: The current branch test has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin test

kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin master
ERROR: Permission to refocusdevelop/ZADANIE.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE kullirist$ git remote remove origin
kullis-MacBook-Pro:ZADANIE kullirist$ git remote add origin git@refocusdevelop:refocusdevelop/ZADANIE.git
kullis-MacBook-Pro:ZADANIE kullirist$ git fetch
kullis-MacBook-Pro:ZADANIE kullirist$ git log
commit 51ed244b4b6b6605bda7c476c07e781294df9856
Author: kristdevelop <kyllirist@gmail.com>
Date:   Sat Jan 21 13:07:49 2017 +0200

    First
kullis-MacBook-Pro:ZADANIE kullirist$ git push -u origin master
Counting objects: 62, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (61/61), done.
Writing objects: 100% (62/62), 25.90 KiB | 0 bytes/s, done.
Total 62 (delta 11), reused 0 (delta 0)
remote: Resolving deltas: 100% (11/11), done.
To refocusdevelop:refocusdevelop/ZADANIE.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
kullis-MacBook-Pro:ZADANIE kullirist$ 
Display all 1456 possibilities? (y or n)
kullis-MacBook-Pro:ZADANIE kullirist$ cd ..
kullis-MacBook-Pro:Eksam kullirist$ cd ZADANIE2
kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -uf origin master
ERROR: Permission to Ankors/Tasks.git denied to kristdevelop.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote -v
origin	git@github.com:Ankors/Tasks.git (fetch)
origin	git@github.com:Ankors/Tasks.git (push)
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote remove origin   DELETING THE ORIGIN
kullis-MacBook-Pro:ZADANIE2 kullirist$ git remote add origin git@refocusdevelop:Ankors/Tasks.git SETTING THE ORIGIN AGAIN
kullis-MacBook-Pro:ZADANIE2 kullirist$ git push -uf origin master
Counting objects: 151, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (89/89), done.
Writing objects: 100% (151/151), 30.26 KiB | 0 bytes/s, done.
Total 151 (delta 54), reused 151 (delta 54)
remote: Resolving deltas: 100% (54/54), done.
To refocusdevelop:Ankors/Tasks.git
 + 8760826...b1f98fd master -> master (forced update)
Branch master set up to track remote branch master from origin.
kullis-MacBook-Pro:ZADANIE2 kullirist$ 




kullis-MacBook-Pro:~ kullirist$ mv config .ssh/
kullis-MacBook-Pro:~ kullirist$ ssh-a
ssh-add    ssh-agent  
kullis-MacBook-Pro:~ kullirist$ ssh-a
ssh-add    ssh-agent  
kullis-MacBook-Pro:~ kullirist$ ssh-add -l
The agent has no identities.
kullis-MacBook-Pro:~ kullirist$ ssh-add .s
.sqlite_history  .ssh/            .subversion/     
kullis-MacBook-Pro:~ kullirist$ ssh-add .ssh/id_rsa
Identity added: .ssh/id_rsa (.ssh/id_rsa)
kullis-MacBook-Pro:~ kullirist$ ssh-add .ssh/id_rsa2
Identity added: .ssh/id_rsa2 (.ssh/id_rsa2)
kullis-MacBook-Pro:~ kullirist$ ssh-add -l
2048 SHA256:DvQXxvEkr0yKuhxyZ2/YshGOQPrlCYqxOh0CVD0t+lg .ssh/id_rsa (RSA)
2048 SHA256:NyMGemam6oZOx0qvC53dAnmQvqcUZ8MQMc9/TqJrr4Y .ssh/id_rsa2 (RSA)
kullis-MacBook-Pro:~ kullirist$ ssh -T kristdevelop
Hi kristdevelop! You've successfully authenticated, but GitHub does not provide shell access.
kullis-MacBook-Pro:~ kullirist$ ssh -T refocusdevelop
Hi refocusdevelop! You've successfully authenticated, but GitHub does not provide shell access.
kullis-MacBook-Pro:~ kullirist$  


