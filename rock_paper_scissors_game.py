#from random import choice
import random
comp_wins=0
player_wins=0
print("Welcome to the rock------paper------scissors game")
print("It is a best of 5 series")
print()
print("Enter (r) for ROCK")
print("Enter (p) for PAPER")
print("Enter (s) for SCISSORS")

while True:
    play=input("Enter your choice  : ").lower()
     
    while not(play == 'r' or play =='p' or play=='s'):
        print("YOU ENETRED WRONG INPUT")
        print()
        print("Enter (r) for ROCK")
        print("Enter (p) for PAPER")
        print("Enter (s) for SCISSORS")
        play=input("Enter your choice  : ").lower()
         
        
        

    ai=random.choice(['rock','paper','scissors'])
    #ai=choice(['r','p','s'])
              
    if (ai[0] =='s' and play =='r') or(ai[0]=='p' and play=='s') or (ai[0]=='r' and play=='p'):
        print()
        print()
        print()
        player_wins+=1        
        print(f"computer played {ai}")
        print("YOU WON!!!!!")
    elif ai[0]==play:
        print()
        print()
        print()
        print("YOU and COMPUTER got the same")
        
    else :
        print()
        print()
        print()
        print(f"computer played {ai}")
        print("YOU LOOSE :(")
        comp_wins+=1
    print(f"Player score:{player_wins} \t\t\tComputer score:{comp_wins}")
    if comp_wins==3 or player_wins==3:
        break
print(f"Final Score\nPlayer score:{player_wins}  \t\t\t\tComputer score:{comp_wins}")
if player_wins==3:
    print("\n\t\t\t\t\tCongratulations you win")
else:
    print("\n\t\t\t\t\tOHHH the computer wins")
         
