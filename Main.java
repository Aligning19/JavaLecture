// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Person {
    
    private String name, address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String toString() {
        return name + "(" + address + ")";
    }
    
}

class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    
    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[30];
        grades = new int[30];
    }
    
    public String toString() {
        return "Student: " + super.toString();
    }
    
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }
    
}

class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    
    
    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[5];
    }
    
    public boolean addCourse(String course){
        
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
        
    }
        
    }
    
}