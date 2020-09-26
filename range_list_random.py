import random
list1=[]
def list_comprehension():
    global list1,list2
    list1=[random.randint(1,x)for x in range(10,100)]
    list2=[chr(i)for i in range(ord('a'),ord('z')+1)]
    
print("calling the comprehension function...")
list_comprehension()
print("the formed list is",list1)
print("the formed list is.......",list2)
print()
for a in list2:
    print(a," ",end='')

