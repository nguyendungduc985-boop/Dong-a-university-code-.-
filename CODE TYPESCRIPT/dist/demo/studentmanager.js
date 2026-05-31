"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StudentManager = void 0;
class StudentManager {
    constructor() {
        this.students = [];
    }
    addStudent(student) {
        this.students.push(student);
        console.log("Đã thêm sinh viên: " + student.name);
    }
    listStudents() {
        if (this.students.length === 0) {
            console.log("Danh sách trống");
            return;
        }
        this.students.forEach((student, index) => {
            console.log(`${index + 1}. ID: ${student.id}, Name: ${student.name}, Age: ${student.age}`);
        });
        console.log("Tổng số sinh viên: " + this.students.length);
    }
}
exports.StudentManager = StudentManager;
