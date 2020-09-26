st="ddd"
def is_Palindrome(s):
 	if(s[::]==s[::-1]):
 		#print(f"{s} is a Palindrome")
 		return True
 	else:
 		#print("Not a Palindrome")
 		return False

ls=[]
for x in range(0,len(st)+1):
	for y in range(x+1,len(st)+1):
		q=st[x:y]
		if is_Palindrome(q):
			ls.append(q)

print(max(*ls,key=len)) 