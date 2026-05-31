function printStarTriangle(n: number): void {
    for (let i = 1; i <= n; i++) {
        console.log("*".repeat(i));
    }
}
console.log("In tam giác sao:");
printStarTriangle(5);
/*
*
**
***
****
*****
*/