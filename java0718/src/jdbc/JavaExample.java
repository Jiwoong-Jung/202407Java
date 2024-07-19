package jdbc;


class Person { 
    private String name;
    private int age;
    private String address; 

    public Person() {
        name = "";
        age = 0;
        address = "";
    }  

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        address = "";
    }     

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    } 

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public void info() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }
}


class Student extends Person {
    private int grade;
    private String studentId;
    private String major;
 
    public Student() {
        super();
        grade = 0;
        studentId = "";
        major = "";
    }

    public Student(String name, int age, int grade, String studentId) {
        super(name, age);
        this.grade = grade;
        this.studentId = studentId;
        this.major = "";
    }

    public Student(String name, int age, String address, int grade, String studentId, String major) {
        super(name, age, address);
        this.grade = grade;
        this.studentId = studentId;
        this.major = major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    } 

    public int getGrade() {
        return grade;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void info(){
        super.info();
        System.out.println("학년 : " + grade);
        System.out.println("학번 : " + studentId);
        System.out.println("전공 : " + major);
    }
}

class Professor extends Person {
    private String employId;
    private String department;
    private String position;
    private int salary;
	
    public Professor() {
        super();
        employId = "";
        department = "";
        position = "";
        salary = 0;
    }

    public Professor(String name, int age, String employId, String department) {
        super(name, age);
        this.employId = employId;
        this.department = department;
        this.position = "";
        this.salary = 0;
    }

    public Professor(String name, int age, String address, String employId, String department) {
        super(name, age, address);
        this.employId = employId;
        this.department = department;
        this.position = "";
        this.salary = 0;
    }

    public Professor(String name, int age, String address, String employId, String department, 
               String position, int salary) {
        super(name, age, address); 
        this.employId = employId;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public void setEmployId(String employId) {
        this.employId = employId;
    }

    public String getEmployId() {
        return employId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void info() {
        super.info();
        System.out.println("임용번호 : " + employId);
        System.out.println("소속 : " + department);
        System.out.println("직위 : " + position);
        System.out.println("급여 : " + salary);
    }
}


public class JavaExample {
    public static void main(String[] args) {
        Person persons[] = new Person[4];
	
        Student student1 = new Student("한아름", 19, 2, "0110122724");
        student1.setMajor("소프트웨어학과");	
        Student student2 = new Student("이순신", 23, "경북", 3, "0100124323", "소프트웨어학과");

        Professor professor1 = new Professor("유관순", 40, "대구", "10990", "소프트웨어학과");
        professor1.setPosition("조교수");
        professor1.setSalary(300);
        Professor professor2 = new Professor("홍길동", 40, "대구", "10990", "소프트웨어학과", 
                                               "부교수", 400);
        persons[0] = student1;
        persons[1] = student2;
        persons[2] = professor1;
        persons[3] = professor2;

        for (int i=0; i<persons.length; i++) {
            System.out.println("[" + (i + 1) + "]" + "-----------------------------");
            persons[i].info();
        }
        System.out.println("================================");
        System.out.println("student1의 이름 = " + student1.getName());
        System.out.println("professor2의 소속 = " + professor2.getDepartment());
    }
}