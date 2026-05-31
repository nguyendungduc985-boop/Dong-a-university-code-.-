import {Student} from "./student";
import {StudentManager} from "./studentmanager";
const manager = new StudentManager();
const student1 = new Student('sv01', 'Nguyễn Văn A', 20);
const student2 = new Student('sv02', 'Trần Thị B', 21);
const student3 = new Student('sv03', 'Lê Văn C', 22);


manager.addStudent(student1);
manager.addStudent(student2);
manager.addStudent(student3);
manager.listStudents();
