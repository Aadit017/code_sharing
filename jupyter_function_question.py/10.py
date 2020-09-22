def spy_game(n):
    code=[0,0,7,'x']
    for i in n: 
        if i==code[0]:
            code.pop(0)
    return len(code)==1
print(spy_game([0,7,0,2,2,1]))