let diemVan: number = 5;

let diemToan: number = 6;

function tinhTong(a: number, b: number): number {

return a + b;

}

function hienThiKetQua(tong: number): void {

if (tong > 10) {

console.log(" Chúc mừng, bạn đã vượt qua kỳ thi");

} else {

console.log(" Chưa Đạt, Bạn cần cố gắng lần sau ");

}

}

let tongDiem = tinhTong(diemVan, diemToan);

hienThiKetQua(tongDiem);
