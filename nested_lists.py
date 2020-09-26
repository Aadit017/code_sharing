def fir(a):
    return a[0]
if __name__ == '__main__':
    l=[]
    scor=[]
    for x in range(int(input())):
        name = input()
        score = float(input())
        l.append([name,score])
        scor.append(score)
    print(l)
    m=min(scor)
    scor.remove(m)
    while m in scor:
        scor.remove(m)
    
    mini=min(scor)
    sorted(l,key=fir)
    print(l)