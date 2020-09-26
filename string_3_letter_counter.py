s=str(input("enter a sentence:"))
s=s+' '
w=''
l=[]
for n in s:
    if n==' ':
        l.append(w)
        w=''
    else:
        w=w+n
        
for x in l:
    if(len(x)==3):
        print(x)
