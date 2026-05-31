function isPrime(n: number): boolean {
    if (n < 2) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}
console.log("Kiểm tra số nguyên tố");
console.log("7 có phải số nguyên tố không?", isPrime(7));
console.log("10 có phải số nguyên tố không?", isPrime(10)); 