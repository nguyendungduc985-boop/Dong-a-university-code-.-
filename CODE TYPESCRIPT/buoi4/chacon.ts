class con {
    name: string;
    age: number;
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
    getInfo(): string {
        return `Tên: ${this.name}, Tuổi: ${this.age}`;
    }
}