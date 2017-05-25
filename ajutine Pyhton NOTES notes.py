PHYTON
https://wiki.itcollege.ee/index.php/I719_Fundamentals_of_Python
videos https://echo360.e-ope.ee/ess/portal/section/fc0c6bfd-9187-4365-b2c9-0085b3a89906
ipython.org/
EXAM: https://gist.github.com/evrom/d948b56afe9a41aa2c18b8a3094eddad
EXAM: https://wiki.itcollege.ee/index.php/I719_Fundamentals_of_Python#Real_Test_for_23.2F03.2F17

Python Imaging Library  - - http://python-pillow.org/ 
Making HTTP requests  - - http://docs.python-requests.org/ 
Charting data - - http://www.pygal.org/ 
Packaging and distributing Python applications - - https://packaging.python.org/distributing/
*GRAPH: python.org/docs/  ….wikipedia.org Graph_database….  /media/ …PropertyGr

*NB! python+java+C: cmd-running server seadistada koodi sees, (mitte nagu .php mis brauseris jookseb)
*? Traceback (most recent call last) - - mis see on?

PROJECT
unittest, the project shall have unittest
http://pythontesting.net/framework/unittest/unittest-introduction/
https://www.jetbrains.com/help/pycharm/2016.3/run-debug-configuration-python-unit-test.html
*Projekti näide: OpenCV image video - “identify the faces”

*EMACK app, Evam kasutab 	https://github.com/bbatsov/prelude

PyCharm Code SOFT
jungle pyhton + 
Ruby, Ruby on Rails (veebilehtde jaoks)
PyCharm:
Ctrl + B alustas run
INSTALLATIONS: we installed python-REPL which helps with scanner data importing, but it didt actually
. . .

Chris:
Real Python ÕPPIDA
Discover Flask, Part 3 - User Authentication by Michael Herman
https://www.youtube.com/watch?v=bLA6eBGN-_0
http://flask.pocoo.org/docs/0.12/tutorial/
EELINSTALLIMINE PIP FLASK
kullis-MacBook-Pro:~ kullirist$ pip3 install flask #pip aitab teha installe; flask on vajalik install tema soft jaoks
*Chris project: 
http://127.0.0.1:5000/

a lot! http://samples.openweathermap.org/
this runs his query JSON
http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1

!? Projekt ei tohi joosta, tuleb kinni vajutada, muidu teised ei toimi: console left menu has play and stop buttons

***prepara:
pip3 install requests
python3 main.py
but:
  File "main.py", line 2, in <module>
    import requests
ModuleNotFoundError: No module named 'requests'
kullis-MacBook-Pro:I719-Fundamentals-of-Python kullirist$ pip3 install requests

. . .
*The case: ??? Sublimecant accept 
*Task_FizzBuzz.py my code worked well on Terminal but same one did not work in Sublime
*Case - location:
which python3  —näitab asukoha, kuna selgus et mul pole pythin3 siin: /usr/bin, hoopis mujal oli see!
/usr/bin
cd / näitab Home algusest


API CoinDesk of BPI: response = requests.get('http://api.coindesk.com/v1/bpi/currentprice/<CODE>.json')

***kas impordid tehtud?

? class MockResponse:
jinja2

………………….
MEMO APRIL 27
OSI
port 80 is without SSL
website “DNS lookup”, to find some site IP address
SSL is a cover
“the site without SSL” - proovisime netist sellist lehe näidet leida

BASH:
kullis-MBP:~ kullirist$ nc 172.217.12.78 80
GET / HTTP/1.0

FLASK to do websites (I have it pip3 installed)
http://flask.pocoo.org

path
question mark
query string
key
value
instead “KOMA MÄRK” there is: &

KOOD:
from flask import Flask
from flask import request

app = Flask(__name__)
app.config['DEBUG'] = True

@app.route("/")
def hello():
    print(request.args)
    message = request.args.get('message', '')
    return message

if __name__ == "__main__":
    app.run()


…………………………
Ülessanne
https://wiki.itcollege.ee/index.php/I719_Fundamentals_of_Python/testing#Advanced_Testing

REMOVED
def hello():
    print(request.args)
    message = request.args.get('message', '')
    return message

SEE EI TÖÖTANUD
def hello():
    return .format(get_btc_price())


……………..
Praktikum nr 
veebilehed APP?    	jinja2

RO DO
template directory of Flask
Evan seletas, et see on hea teha, leiab default üles, aga miks

“asukohad asjad”
kullis-MBP:~ kullirist$ cd /
ls
seal on tmp folder

http://localhost:5000/
127.0.0.1 		=localhost
127.0.0.1:8000
http://localhost:5000/?key=value
localhost:5000/?message=<script>alert()………..

lahendus oli see, et siia sisse pandi port number, peale mida jooksutades bashis .py faili, sain ma localhost:5000 lehele bitkoini numbri py-koodiga
app.run(port=5000)
PORT 1024 anything less than is not available, kõik reserveeritud, kasutasime Evaniga 5000
80 oli ka millegi tähtsa jaoks reserveeritud


…………………………….
Praktikum nr 5
https://docs.python.org/3/library/datetime.html
minu Macbook vähemalt ma pidin datetime importima:
In [5]: from datetime import datetime
In [6]: import datetime
In [7]: datetime.datetime.utcnow()
Out[7]: datetime.datetime(2017, 5, 4, 5, 49, 51, 429177)

***To know: 1977 year “UNIX time stamp” …this is the start of storing time
****Time river DELTA …. ? what about it

DATA to use time:
http://strftime.org
(this was coming from the language C to other languages)

TASK
http://stackoverflow.com/questions/8258432/days-between-two-dates-in-python
TASK
http://stackoverflow.com/questions/311627/how-to-print-date-in-a-regular-format-in-python

kirjutasime koodi, mis avab cmd-s csv faili:
python3 FORM.py hooksup.csv

 . . . . . . . . . . .
kullis-MacBook-Pro:/ kullirist$ which emacs
/usr/bin/emacs

Running on http://127.0.0.1:5000/

MEMO MAI 11
we were practising:
***enumerate 
***THE TASK: uppercase
***set(my_list)   using SET prints out only unique items
***linting —kontrollima väikseid vigu = PEP3 online sites help to check your code and its style being correct
***DJANGO
***.append - sõnade lisamiseks listi

 . . . . . . . . . . .
TEACH WW
bucky python
https://www.youtube.com/watch?v=xRIzPZlei9I&index=13&list=PL6gx4Cwl9DGAcbMi1sH6oAMk4JHw91mC_

 . . . . . . . . . . .
TEACH YT game?
https://www.youtube.com/watch?v=P56iynrTNKc
Calculator https://www.youtube.com/watch?v=J-mvqlkHOHY
Asks input returns the sentence https://www.youtube.com/watch?v=q5ob36VlBBQ
Snake game https://www.youtube.com/watch?v=AaGK-fj-BAM
Inventory https://www.youtube.com/watch?v=NQn0nAbzdUk

…………
MEMO 18. mai
small python games
“the key” /   in windows \\ 
to remove the key dependency
import tkinter as tk
hiljem kasutuses tK.kkkk



…..
DEV PROJECT of May 22:
https://pypi.python.org/pypi/pyechonest
* 		Author: David DesRoches
* 		The <th> elements below are a terrible terrible hack for setuptools
* 		Home Page: <th>Home Page https://github.com/echonest/pyechonest
* 		Download URL: <th>Download URL https://github.com/echonest/pyechonest
* 		TODO: add link to products in follow dependencies...
* 		Requires urllib, urllib2, json
* 		Package Index Owner: bwhitman
* 		DOAP record: pyechonest-9.0.0.xml
* 
SEC pip https://wiki.python.org/moin/CheeseShopTutorial
1.Installation: pyechonest-9.0.0	download it from https://pypi.python.org/pypi/pyechonest
“Tap into The Echo Nest’s Musical Brain for the best music search, information, recommendations and remix tools on the web. Pyechonest is an open source Python library for the Echo Nest API. With Pyechonest you have Python access to the entire set of API methods. See: http://developer.echonest.com”
2.API key from http://developer.echonest.com

•	My own Echoprint server and codegen and compute my own codes 
•	Ingest the resulting fingerprints (JSON files) using the fastingest.py scri
API that I used to have api_key=0KCEOYDKQFOD3PCP5
API key simply isnt opening old source: http://developer.echonest.com

EchoNest overview http://docs.echonest.com.s3-website-us-east-1.amazonaws.com/#keys

DEV PROJECT of May 24:
import audioread https://pypi.python.org/pypi/audioread/2.1.4




















..











.