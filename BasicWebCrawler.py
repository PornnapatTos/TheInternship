from bs4 import BeautifulSoup
import requests
import collections
import json
page = requests.get("https://theinternship.io/")
soup = BeautifulSoup(page.text, "html.parser")
images = soup.findAll('img', {"class":"center-logos"})
divs = soup.findAll('span' , {"class":"list-company"})
out = {}
for image,div in zip(images,divs) :
    out[image['src']] = div.text
out = sorted(out , key=lambda k:len(out[k]))
file = open(r'MyOutput.txt','w') 
for key in out :
    print(key)
    file.write(key+ '\n')