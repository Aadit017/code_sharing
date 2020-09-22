def paper_doll(n): 
    list=' '
    for ch in n :
        list+= ch*3+","
    return list 
print(paper_doll("hello"))