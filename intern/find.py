import re
matches = []
for line in open("input.txt"):
    matches.extend(re.findall("[^A-Z][A-Z]{3}([a-z])[A-Z]{3}[^A-Z]", line))
print ''.join(matches)
