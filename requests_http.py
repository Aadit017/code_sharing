import requests
url="https://icanhazdadjoke.com/"
r=requests.get(url,headers={"Accept":"application/json"})
data=r.json()
print(r.text)
print(data)
print(data["joke"])


