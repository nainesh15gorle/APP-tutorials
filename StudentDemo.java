class Student {
    private String name;
    private int[] marks;

    public Student(String name, int subjectCount) {
        this.name = name;
        this.marks = new int[subjectCount];
    }

    // Teacher access
    public void updateMarks(int subjectIndex, int marks, Teacher teacher) {
        if (teacher != null && subjectIndex >= 0 && subjectIndex < this.marks.length) {
            this.marks[subjectIndex] = marks;
        }
    }

    // Student view access
    public int[] getMarks() { return marks.clone(); }
    public int getMark(int subjectIndex) { 
        if (subjectIndex >= 0 && subjectIndex < marks.length) {
            return marks[subjectIndex];
        }
        throw new IndexOutOfBoundsException("Invalid subject index");
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    private String name;
    public Teacher(String name) { this.name = name; }
    public String getName() { return name; }
}

// Demo class with main method
public class StudentDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mrs. Smith");
        Student s = new Student("Alice", 3);

        s.updateMarks(0, 85, t);
        s.updateMarks(1, 90, t);
        s.updateMarks(2, 78, t);

        System.out.println("Marks for " + s.getName() + ":");
        int[] marks = s.getMarks();
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i+1) + ": " + marks[i]);
        }
    }
}