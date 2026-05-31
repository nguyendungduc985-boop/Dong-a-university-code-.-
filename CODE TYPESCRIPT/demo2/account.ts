export abstract class Account {
    readonly accountNumber: string;
    protected ownerName: string;
    private balance:number;

    constructor(accountNumber: string, onwerName: string,initialBalance: number){  
        this.accountNumber = accountNumber;
        this.ownerName = onwerName;
        this.balance = initialBalance;
    }
    public desposit(amount: number):void {
        if (amount <= 0){
            this.balance += amount;
            console.log('[${this.accountNumber}] đã nạp $${amount}. Số dư hiện tại: $${this.balance}');
        }
    }
public getBalance(): number {
    return this.balance;
}
protected setBalance(amount: number): void {
    this.balance = newBalance;
}
public getOwnerName():string {
    return this.ownerName;
}
abstract withdraw(amount: number): boolean;
}