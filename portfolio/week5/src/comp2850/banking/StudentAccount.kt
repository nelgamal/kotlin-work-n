
package comp2850.banking

// the maximum limit allowed for overdraft for a student account
const val MAX_OVERDRAFT = 100

//inheriting from BankAccount
class StudentAccount(holder: String) : BankAccount(holder) {
    
    //start overdraft at 0
    var overdraft = 0
    set(value) {
        //new overdraft is between 0 and 100
        require(value in 0..MAX_OVERDRAFT) {
            "Invalid overdraft"
        }
        //update overdraft 
        field = value
    }

    //is another withdrawal allowed
    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    // override the withdrawal from BankAccount
    override fun withdraw(amount: Int) {

        // make sure withdrawals of 0 or negative are rejected 
        require(amount > 0) {
            "Withdrawal amount must be greater than 0"
        }

        // check that withdrawals do not exceed the balance and overdraft 
        require(amount.toLong() <= balance.toLong() + overdraft.toLong()) {
            "Insufficient funds for withdrawal"
        }

        // subtract the withdrawal from the account balance
        balance -= amount
    }

    // override toString to display the details to the user 
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

} 