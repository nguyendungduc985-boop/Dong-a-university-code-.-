import{Bank} from "./bank";
import{Account} from "./account";
import{checkingAccount} from "./checkingaccount";

const bank = new Bank();

const saving = new SavingAccount("SA001", "Nguyen Van A", 1000, 0.05);
const checking = new CheckingAccount("CA001", "Le Thi B", 500, 200);

myBank.openAccount(saving);
myBank.openAccount(checking);

console.log(" THỰC HIỆN GIAO DỊCH:");

saving.withdraw(60);
saving.withdraw(40);

checking.withdraw(150);
checking.withdraw(600);

myBank.showAllBalances();  