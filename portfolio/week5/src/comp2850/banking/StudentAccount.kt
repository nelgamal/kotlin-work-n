
package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft = 0
    set(value) {
        require(value in 0..MAX_OVERDRAFT) {
            "Invalid overdraft"
        }
        field = value
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) {
            "Withdrawal amount must be greater than 0"
        }

        require(amount.toLong() <= balance.toLong() + overdraft.toLong()) {
            "Insufficient funds for withdrawal"
        }

        balance -= amount
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

} 