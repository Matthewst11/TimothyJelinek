#Set of stocks
stocks = {'MSFT', 'AAPL', 'GOOG', 'INTC', 'AMD', 'EA', 'IBM', 'ATVI'}
portfolio = set()

#Function to display stocks
def displayStocks():
    print("*** Stock Portfolio ***")
    for stock in sorted(portfolio):
        print(stock)

#Function to buy a stock
def buyStock():
    stock = input("Enter the stock to buy: ").upper()
    if stock in stocks:
        portfolio.add(stock)
        print(f"You bought {stock} stock.")
    else: 
        print(f"{stock} is not available in the stock list.")
        
#Function to sell a stock
def sellStock():
    stock = input("Enter the stock to sell: ").upper()
    if stock in stocks:
        portfolio.remove(stock)
        print(f"You sold {stock} stock")
    else:
        print(f"{stock} is not available in your portfolio.")
        
#Function to show stock details
def stockDetails():
    stock = input("Enter the stock to view details.").upper()
    if stock in stocks:
        print(f"Details for {stock}:")
    else: 
        print(f"{stock} is not available in your portfolio.")
        

    
while True:
    print("-----------------------")
    print("*** Stock Portfolio ***")
    print("-----------------------")
    print("1. Display Stocks")
    print("2. Buy a stock")
    print("3. Sell a stock")
    print("4. Stock details")
    print("5. Quit")
    choice = input("Enter the number of what you would like to do: ")
        
    if choice == '1':
            displayStocks()
    elif choice == '2':
            buyStock()
    elif choice == '3':
            sellStock()
    elif choice == '4':
            stockDetails()
    elif choice == '5':
            print("Thank you for using this application for your stocks!")
            break
    else:
            print("Invalid number!  Try again!")
            
