def func(n): 
    t=True
    cond=True
    if n%2==0 or n<=2:
        t=False
        cond=t 
    else:
         for i in range(3,n):
            if n%i==0: 
                t=False
                cond=t
                
                break 
    if cond==False: 
        return False 
    else: 
        return True 

def series_prime(n):
        count=1
        for i in range(3,n+1): 
            if func(i)==True:
                count+=1
            else:
                continue
        return count 

print(series_prime(100))
#print(func(81))
                