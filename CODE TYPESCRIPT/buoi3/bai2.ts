function sumEvenNumbers(n: number): number {
    let sum: number = 0;
    for (let i = 2; i <= n; i += 2) {
        sum += i;
    }
    return sum;
}
console.log("Tông các số chẵn từ 1 đến n");
console.log("Tổng các số chẵn từ 1 đến 10 là:", sumEvenNumbers(10)); 
