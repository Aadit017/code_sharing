def pal(st):
    l=[]
    a=[]
    for n in st:
        l.append(n)
    print(l)
    for n in l[::-1]:
        a.append(n)
    print(a)
    if a==l:
        return True
    else:
        return False

print(pal('haah'))
