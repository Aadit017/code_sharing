# if there is an elevan and the sum is >21 return BUST after decreasing 10 from it and even after dec . the sum is >21 then pritn bust  
# if the sum is less than 21 return sum 
# if the sum is more than 21 wihtout 11 ..return BUST 
def blackjack(a,b,c):
        sum=a+b+c
        if sum>21:    
            if a==11 or b==11 or c==11: 
                sum=sum-10
                if sum>21:
                    return 'Bust'
                else: 
                    return sum 
            else : 
                return 'BUST'
        else:
            return sum          

a=" "
b=" "
c=" "
while a not in ('1','2','3','4','5','6','7','8','9','10','11'): 
                
    a=input(" value of a ") 

while b not in ('1','2','3','4','5','6','7','8','9','10','11'): 
    b=input(" value of b ")

while c not in ('1','2','3','4','5','6','7','8','9','10','11'): 
    c=input(" value of c ")
a=int(a)
b=int(b)
c=int(c)
print(blackjack(a,b,c))