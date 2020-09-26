print("Wlecome to the game")
name=input("Enter your name: ")

print(f"Welcome {name} start playing the game")
word="LAPTOP"
print("Rule: Guess a word (letter by letter)")

chance=10
while(chance!=0):
    guess=input("GUESS A LETTER: ")
    guess=guess.upper()
    for a in word:
        if (a==guess):
            print("YOU GUESSED IT CORRECT")
            break
        else:
            chance=chance-1
            print("Ohhhh!!!! Yuo guessed it wrong")
            print(f"Chances left: {chance}")
             
