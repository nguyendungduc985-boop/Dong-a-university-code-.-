"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
class Student {
    constructor(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    getinfo() {
        return 'ID:' + this.id + 'Name:' + this.name + 'Age:' + this.age.toString();
    }
}
exports.Student = Student;
