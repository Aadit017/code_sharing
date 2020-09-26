list=[]
n=int(input("Enter the length of the list: "))
for x in range(0,n):
    a=input("Enter a word for the list: ")
    list.append(a)
    
print(list)
l=0
for y in list:
    
    if(len(y)>l):
        l=len(y)
        name=y
print(f"LONGEST LENGTH OF {name} is {l}")
        


