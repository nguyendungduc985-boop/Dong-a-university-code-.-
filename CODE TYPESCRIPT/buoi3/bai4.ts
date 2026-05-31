function reverseString(str: string): string {
    let reversed: string = "";
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }
    return reversed;
}
console.log("Đảo ngược chuỗi");
console.log("Đảo ngược 'hello':", reverseString("hello")); 
