p1 = input("Player 1, enter your move: ").lower()
p2 = input("Player 2, enter your move: ").lower()

def play_rps(x, y):
    match (x, y):
        case (a, b) if a == b:
            return "Tie!"
        case ("rock", "scissors") | ("paper", "rock") | ("scissors", "paper"):
            return "Player 1 wins!"
        case ("scissors", "rock") | ("rock", "paper") | ("paper", "scissors"):
            return "Player 2 wins!"
        case _:
            return "Invalid input! Please use rock, paper, or scissors."

print(play_rps(p1, p2))
