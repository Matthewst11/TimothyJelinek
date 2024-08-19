def is_valid(board, row, col, num):
    """
    Determine if it's valid to place 'num' at position (row, col) on the Sudoku board.
    Implement the necessary checks.
    """
    #Check row and column
    for i in range(9):
        if board[row][i] == num or board[i][col] == num:
            return False
        
    # Check 3x3 subgrid
    start_row, start_col = 3 * (row // 3), 3 * (col // 3)
    for i in range(start_row, start_col + 3):
        for j in range(start_col, start_col + 3):
            if board[i][j] == num:
                return False
            

    return True
    pass

def solve_sudoku(board):
    """
    Solve the provided Sudoku board using backtracking.
    Fill in the solution directly into the board.
    Return True if a solution exists, otherwise return False.
    """
    def is_valid(row, col, num):
        #Check row, column, and 3x3 subgrid
        for i in range(9):
            if board[row][i] == num or board[i][col] == num:
                return False
        start_row, start_col = 3 * (row // 3), 3 * (col // 3)
        for i in range(start_row, start_row + 3):
            for j in range(start_col, start_col + 3):
                if board[i][j] == num:
                    return False
        return True
    
    def backtrack():
        for row in range(9):
            for col in range(9):
                if board[row][col] == 0:
                    for num in range(1, 10):
                        if is_valid(row, col, num):
                            board[row][col] = num
                            if backtrack():
                                return True
                            board[row][col] = 0 # Backtrack
                    return False
        return True
    
    if backtrack():
        return True
    else:
        return False
    pass

if __name__ == "__main__":
    import sys

    # Check if the correct number of command-line arguments is provided
    if len(sys.argv) != 2:
        print("Usage: python sudoku_solver.py <input_file>")
        sys.exit(1)

    # Read Sudoku board from the input file
    input_file = sys.argv[1]
    with open(input_file, "r") as file:
        sudoku_board = [[int(num) for num in line.split()] for line in file.readlines()]

    print("Input Sudoku Board:")
    for row in sudoku_board:
        print(" ".join(map(str, row)))

    # Solve the Sudoku board
    if solve_sudoku(sudoku_board):
        print("\nSolved Sudoku Board:")
        for row in sudoku_board:
            print(" ".join(map(str, row)))
    else:
        print("\nNo solution exists.")
