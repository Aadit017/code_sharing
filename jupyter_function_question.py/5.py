def almost_there(n): 
    list=[x for x in range(90,111)]
    list_1=[i for i in range(190,211)]
    if n in list or n in list_1: 
            
              return True 
    else: 
        return False 
    
print(almost_there(1))