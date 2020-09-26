s = input()
l=list(s)
ans=False     
upper=False
lower=False
alpha=False
digit=False
    
for x in l:
    if x.isalpha():
        alpha=True
        if x.isupper():
            upper=True
        elif x.islower():
            lower=True
    elif x.isdigit():
            digit=True

    if x.isalnum():
        ans=True
print(ans)
print(alpha)
print(digit)
print(lower)
print(upper)
