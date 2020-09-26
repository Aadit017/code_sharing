while True:
    f= float(input("Enter first side: "))
    s= float(input("Enter second side: "))
    t= float(input("Enter third side: "))

    if(f==s and f==t):
        print("THE TRIANGLE IS AN EQUILATERAL TRIANGLE")
        
    elif(f==s or f==t or s==t):
        print("THE TRIANGLE IS AN ISOSCELES TRIANGLE")

    else :
        print("THE TRIANGLE IS AN SCALENE TRIANGLE")

    print()

