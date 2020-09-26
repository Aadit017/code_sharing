import requests
from bs4 import BeautifulSoup

oyo_url = "https://www.tripadvisor.in/Hotels-g297689-Mussoorie_Dehradun_District_Uttarakhand-Hotels.html"

req = requests.get(oyo_url)
content = req.content

soup = BeautifulSoup(content, "html.parser")

all_hotels=soup.find_all("div",{"class":"meta_listing ui_columns large_thumbnail_mobile"})

for hotel in all_hotels:
    hotel_name=hotel.find("a",{"target":"_blank"}).text
    hotel_price=hotel.find("div",{"data-index":"0"}).text
    print(hotel_name, " : ", hotel_price," for a night")
