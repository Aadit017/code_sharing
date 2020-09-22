def lesser_of_the_evens(a,b): 
    if a%2==0 and b%2==0: 
        return min(a,b)
    else: 
        return max(a,b)
print(lesser_of_the_evens(2,4))