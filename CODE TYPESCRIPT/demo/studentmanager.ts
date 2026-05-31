import { Student } from "./student";

export class StudentManager {
    students: Student[] = [];

    addStudent(student: Student): void {
        this.students.push(student);
        console.log("Đã thêm sinh viên: " + student.name);
    }

    listStudents(): void {

        if (this.students.length === 0) {
            console.log("Danh sách trống");
            return;
        }

        this.students.forEach((student: Student, index: number) => {
            console.log(
                `${index + 1}. ID: ${student.id}, Name: ${student.name}, Age: ${student.age}`
            );
        });

        console.log("Tổng số sinh viên: " + this.students.length);
    }
}