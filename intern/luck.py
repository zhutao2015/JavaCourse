# coding: utf-8
import json
from history import history, times
students = ['ÁõÄÏ',
    'ÕÅ³¿',
    'ÍÑßä',
    'ÍõÇà²¨',
    '¶­Ù»',
    'ÁõÀÚ',
    'ÀîÀ×±ë',
    'ºò¶¹',
    'ÖÜÓñ³É',
    'ºØ»¶',
    'ÀîÁá',
    'ĞìÃÉ',
    'Îâ¸»Ç¿',
    'ÕÅ»¶',
    ]


import random

tpl = '''
#coding: utf-8
times = {}
history = {}
'''


def build_candidates():
    candidates = []
    t = times + 1
    for student in students:
        num = t - history.get(student, 0)
        for i in range(num):
            candidates.append(student)
    return candidates


candidates = build_candidates()
random.shuffle(candidates)
student = random.choice(candidates)
print student

history[student] = history.get(student, 0) + 1
times = times + 1

y = '''{
%s
}'''

x = ""
for n, t in history.iteritems():
    x += "    '{}': {},\n".format(n, t)


out = tpl.format(times, y % x)
fh = open("history.py", "w")
fh.write(out)
fh.close()
