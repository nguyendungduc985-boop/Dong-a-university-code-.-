import {Account} from "./account";
export class CheckingAccount extends Account {
    private overdraftLimit: number;
    constructor(accountNumber: string, ownerName: string, initialBalance: number, overdraftLimit: number) {
        super(accountNumber, ownerName, initialBalance );
        this.overdraftlimit = pverdraftLimit;
    }
    puclic withdraw(amount: number):boolean{
        const currentBalance = this.getBalance();
        if(currentBlance - amount >= -this.overdraftLimit){
            this.setBalance(currentBalnce - amount);
            console.log('[${this.accountNumber}] đã rút $${amount}. Số dư hiện tại: $${this.getBalance()}');
            return true;
        }
        console.log('[${this.accountNumber}] không đủ số dư để rút $${amount}. Số dư hiện tại: $${this.getBalance()}');
        return false;
    }
}