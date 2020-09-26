list=[]

n=int(input("ENTER THE LENGTH OF THE LIST: "))

for x in range(0,n):
    a=float(input("Enter elements for the list: "))
    list.append(a)

print("YOUR ENTERED LIST IS: ",list)
pro=1
for y in list:
    pro=pro*y

print("THE PRODUCT IS: ",pro)
    
