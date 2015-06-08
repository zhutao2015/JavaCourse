import csv
import string
import random
import MySQLdb

conn = MySQLdb.connect(user='root', db='oa', passwd='java')
cursor = conn.cursor()

handler = csv.writer(open("user.csv", 'w'))
handler.writerow(("id", "name", "gender", "age", 'status'))

score = csv.writer(open("score.csv", 'w'))
score.writerow(("id", "userid", "type", "score"))

j = 1
for i in range(1, 51):
    name = "".join(random.sample(string.ascii_lowercase, 6)).capitalize()
    gender = random.choice([0, 1])
    status = random.choice([0, 1])
    age = random.randint(10, 50)
    handler.writerow((i, name, gender, age, status))
    cursor.execute('''insert into user set id={}, name="{}", gender={}, age={}, status={}'''.format(i, name, gender, age, status))
    conn.commit()
    for t in range(0, 4):
        s = random.randint(30, 150)
        score.writerow((j, i, t, s))
        cursor.execute('''insert into score set id={}, userid={}, type={}, score={}'''.format(j, i, t, s))
        conn.commit()
        j += 1

cursor.close()
conn.close()



