'''
from selenium import webdriver as w
from time import sleep 
try : 
    browser=w.Firefox()
    
    browser.get('https://www.quora.com/How-do-I-create-an-Instagram-bot-that-directly-messages-people-with-Python-or-Java')
    print(" browser was started ")
    sleep(10)
    browser.close()
except: 
    print(" sorry we couldnt load it ")
'''        
from time import sleep
from selenium import webdriver

browser = webdriver.Firefox()

browser.get('https://www.instagram.com/')

sleep(5)

browser.close() 
    