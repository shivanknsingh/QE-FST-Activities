
def play_rps():
    p1 = input("Player 1, enter your move: ").lower()
    p2 = input("Player 2, enter your move: ").lower()

    match (p1,p2):
        case (a, b) if a == b:
            return "Tie!"
        case ("rock", "scissors") | ("paper", "rock") | ("scissors", "paper"):
            return "Player 1 wins!"
        case ("scissors", "rock") | ("rock", "paper") | ("paper", "scissors"):
            return "Player 2 wins!"
        case _:
            return "Invalid input! Please use rock, paper, or scissors."

choice = "yes"
while (choice=="yes"):
    print(play_rps())
    choice=input("want to continue")
