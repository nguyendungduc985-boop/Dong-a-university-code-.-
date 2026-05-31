import {Student} from "./student";
export class StudentManager {
    private students: Student[] = [];
   addStudent(student:Student): void  {
        this.students.push(student);
        console.log('hệ thống đã thêm sinh viên '${student.name} ');
    }
   listStudents():void {
        console.log('danh sách sinh viên:');
        if (this.students.length ===0) {
            console.log("danh sách hiện đang trống");
            return;
        }
        this.students.forEach((student,index) => {
            console.log(`${index + 1}. ID: ${student.id}, Name: ${student.name}, Age: ${student.age}`);
        });
   }
}