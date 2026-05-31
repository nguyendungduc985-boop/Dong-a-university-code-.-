import {Student} from "./student";
import {StudentManager} from "./studentmanager";

const manager = new StudentManager();
const student1 = new Student("001","Alice",20);
const student2 = new Student("002","Bob",22);

manager.addStudent(student1);
manager.addStudent(student2);
manager.adđStudent(student3);

manager.ListStudents();