def interleave(s1,s2):
    z=list(zip(s1,s2))
    l=[]
    for i in z:
        for j in i:
            l.append(j)
    return ''.join(l)

print(interleave('lzr','iad'))
