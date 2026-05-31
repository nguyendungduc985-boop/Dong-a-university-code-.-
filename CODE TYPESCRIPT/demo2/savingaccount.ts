import {Account, Acount} from "./account.js";
export class SavingAcount extends Account {
    private interestRate: number;
    private readonly MIN_BALANCE: number = 50;

    constructor(accountNumber:string, ownerName: string, initialBalance: number, interestRate: number) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
}
 public withdraw(amount: number):boolean {
    const currentBlance = this.getBalance();
    if (currentBalance - amount < this.MIN_BALANCE){
        this.setBalance(currentBalnce - amount);
        console.log('[${this.accountNumber}] đã rút $${amount}. Số dư hiện tại: $${this.getBalance()}');
        return true;
    }
    console.log('[${this.accountNumber}] không đủ số dư để rút $${amount}. Số dư hiện tại: $${this.getBalance()}');
    return false;
 }
}
