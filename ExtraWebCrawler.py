import json
out = open('MyOutput.txt', 'r').read().splitlines() 
output = [ {"logo" : "https://theinternship.io/" + x } for x in out]
show = {}
show["companies"] = output
print(json.dumps(show,indent=3))