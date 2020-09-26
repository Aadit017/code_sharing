i=3
while(i>0):
    print("Enter 1 for Addition")
    print("Enter 2 for Subtracton")
    print("Enter 3 for Multiplication")
    print("Enter 4 for division")
    print("Enter 5 for Power")

    a=int(input("YOUR CHOICE="))
    while(a>5):
        print()
        print("YOUR ENTERED VALUE IS WRONG")
        print("Enter a valid input")
        print()    
        a=int(input("YOUR CHOICE="))
        
    b=int(input("Enter first value="))
    c=int(input("Enter second value="))

    if(a==1):
        d=b+c
        print(f"Sum : {d}")
    if(a==2):
        d=b-c
        print(f"Difference : {d}")
    if(a==3):
        d=b*c
        print(f"Product : {d}")
    if(a==4):
        d=b/c
        print(f"Quotient : {d}")
    if(a==5):
        d=b**c
        print(f"POWER : {d}")

