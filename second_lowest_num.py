def lowest(l):
	low=l[0]
	for n in l:
		if(low>n):
			low=n
	return low

lis=[]
for x in range(0,11):
	lis.append(int(input("Enter a term to the list: ")))

rm=lowest(lis)

lis.remove(rm)
ans=lowest(lis)
print(ans)
 


