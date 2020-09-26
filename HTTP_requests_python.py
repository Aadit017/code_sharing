import requests
url="https://icanhazdadjoke.com/search"
term="cat"
r=requests.get(
    url,
    headers={"Accept":"application/json"},
    params={"term":term})             
               
data=r.json()
for x in data["results"]:
    print(x["joke"])
    print()
     
 
