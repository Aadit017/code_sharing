def wordSplit(s):
	s=s+' '
	w=''
	l=[]
	for n in s:
	    if n==' ':
	        l.append(w)
	        w=''
	    else:
	        w=w+n
	 
	return l

num_elements_A=int(input())

elements_A=input()
elements_A=set(wordSplit(elements_A))

num_other_sets=int(input())
for x in range(1,num_other_sets+1):
	name_operation=input()
	z=wordSplit(name_operation)
	name_operation=z[0]
	length_set=z[1]

	elements_set=input()
	elements_set=wordSplit(elements_set)
	y=eval(elements_A.name_operation)
	y(elements_set)

print(elements_A)
print(sum(elements_A))
