export class Student {
    id: string;
    name: string;
    age: number;
    
    constructor(id: string,name: string, age: number) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    getinfo(): string {
        return 'ID:'+this.id+'Name:'+this.name+'Age:'+this.age.toString()}
    















}