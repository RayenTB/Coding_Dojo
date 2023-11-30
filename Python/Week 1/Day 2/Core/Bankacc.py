class BankAccount:
    num_accounts = 0  

    @classmethod
    def print_all_accounts_info(cls):
        for acc in cls.all_accounts:
            print(f"Account {acc.account_number}: Balance - ${acc.balance}, Interest Rate - {acc.interest_rate}")

    all_accounts = []

    def __init__(self, int_rate=0.01, balance=0):
        self.interest_rate = int_rate
        self.balance = balance
        self.account_number = BankAccount.num_accounts + 1
        BankAccount.num_accounts += 1
        BankAccount.all_accounts.append(self)

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
        return self

    def display_account_info(self):
        print(f"Balance: ${self.balance}")
        return self

    def yield_interest(self):
        if self.balance > 0:
            self.balance += self.balance * self.interest_rate
        return self

account1 = BankAccount(0.02, 1000)
account2 = BankAccount(0.03, 500)
account1.deposit(100).deposit(200).deposit(300).withdraw(150).yield_interest().display_account_info()
account2.deposit(50).deposit(100).withdraw(20).withdraw(30).withdraw(150).withdraw(50).yield_interest().display_account_info()
BankAccount.print_all_accounts_info()

