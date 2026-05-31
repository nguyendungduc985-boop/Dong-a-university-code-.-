import {Account} from "./account";
export class Bank {
    private accounts: Account[] = [];
    public openAccount(account: Account): void {
        this.accounts.push(account);
        console.log('Đã mở tài khoản cho ${account.getOwnerName()} với số tài khoản: ${account.accountNumber}');
    }
    public showAllBalances(): void {
        console.log('Số dư của tất cả tài khoản:');
        this.accounts.forEach(account => {
            console.log('Tài khoản: ${account.accountNumber}, Số dư: ${account.getBalance()}');
        });
    }
}