def has_33(n): 

     
    for i in range(0 , len(n)-1): 
        
        if n[i]==3 and n[i+1]==3:
            return True 
    else: 
            return False 
print(has_33([3,31,3]))
               