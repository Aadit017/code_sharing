from random import randint 
    

playAgain=True
print("Welcome to the guessing game")
while playAgain==True:
    play=0
    num=randint(1,10)

    while play!=num:
        play=int(input("Enter your guess: "))
        
        if play==num:
            print("You got the number")
        elif play>num:
            print("too high guess lower")
        elif play<num:
            print("too low guess higher")
    again=input("Do you want to play again(y/n)")
    if again[0]!='n' or again[0]!='y':
        print("You entered a wrong input")
        while not(again[0]=='n' or again[0]=='y'):
            print("You entered a wrong input")
            again=input("Please enter (y/n): ")
            
    elif again[0]=='n':
        playAgain=False
        print("Thank you for playing")
    elif again[0]=='y' :
        playAgain=True
     
        
            
        
