# PROVIDE TODAY' DATE; HOW MANY DAYS FROM THE YEAR START
“””2017-05-24
143 days, 0:00:00
2017-05-25 00:00:00
2017-05-24 21:56:42.123157
2:03:17.876843
“””
import datetime as dt

print(dt.datetime.utcnow().strftime("%Y-%m-%d"))

today = dt.date.today()

first_of_the_year = dt.date(year=2017, month=1, day=1)

print(today - first_of_the_year)

now = dt.datetime.now()
midnight = dt.datetime(year=now.year, month=now.month, day=(now.day +1))
print(midnight)
print(now)

print(midnight - now)