# Tic Tac Toe Game

## Overview
This project is a simple implementation of the classic Tic Tac Toe game, also known as Jogo da Velha. It allows two players to take turns marking spaces on a 3x3 grid, with the goal of placing three of their marks in a horizontal, vertical, or diagonal row.

## Files
- **src/JogaJogoDaVelha.java**: This file contains the main class for the Tic Tac Toe game. It handles user input, manages the game loop, and displays the game board and results. It instantiates the game, processes player moves, and checks for a winner or a draw.
  
- **src/JogoDaVelha.java**: This file defines the game logic for Tic Tac Toe. It includes methods for initializing the game board, checking for a winner, and managing player turns. It also contains methods for filling the board and determining the game's outcome.

## How to Run the Game
1. Ensure you have Java installed on your machine.
2. Clone or download the project files to your local machine.
3. Navigate to the `src` directory in your terminal.
4. Compile the Java files using the command:
   ```
   javac JogaJogoDaVelha.java JogoDaVelha.java
   ```
5. Run the game with the command:
   ```
   java JogaJogoDaVelha
   ```

## Rules of Tic Tac Toe
1. The game is played on a 3x3 grid.
2. One player uses "X" and the other uses "O".
3. Players take turns placing their marks in empty squares.
4. The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins the game.
5. If all squares are filled and no player has three in a row, the game ends in a draw.

## Additional Notes
- This implementation includes basic functionality for the game. You can enhance it by adding features such as:
  - A graphical user interface (GUI).
  - AI for single-player mode.
  - Score tracking for multiple rounds.
  
Feel free to modify and expand upon the code to improve the game experience!