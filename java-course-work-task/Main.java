class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // set up a variable for the for loop
        int indexOfStudentToDrop = -1;

        // set up a for loop, with two if statements that drop students accordingly
        for (int i = 0; i < numberOfStudents; i++) {
            // if this if statement is true, drop student
            if (students[i].equalsIgnoreCase(student)) {

                indexOfStudentToDrop = i;
            }
            // if this if statement is true, DON'T drop student and increase the array
            if (indexOfStudentToDrop != -1) {
                for (i = indexOfStudentToDrop; i < numberOfStudents; i++)
                    students[i] = students[i + 1];
            } // end if found

            // decrement number of students by 1
            numberOfStudents--;
        } // end if equal


    }

    public void clear() {

        // iterating on the students array, assign all to null
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }

        // assign number of students to zero
        numberOfStudents = 0;

    }

    public void increaseArray(int amount) {

        students = new String[students.length + amount];

    }
}

class Main {
    public static void main(String[] args) {

        // create two courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        // introduce the program
        System.out.println("Creating Two Courses");
        System.out.println("Adding 6 students to course 1");
        System.out.println("Adding 3 students to course 2");

        // add six students to course1
        course1.addStudent("\n1: Tom Servo");
        course1.addStudent("\n2: Joel Robinson");
        course1.addStudent("\n3: Mike Nelson");
        course1.addStudent("\n4: Pearl Forrester");
        course1.addStudent("\n5: TV's Frank");
        course1.addStudent("\n6: Zap Rowsdower");



        // add three students to course2
        course2.addStudent("\n1: Tom Servo");
        course2.addStudent("\n2: Crow T. Robot");
        course2.addStudent("\n3: Zap Rowsdower");

        // print out the number of students in each course
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents() + " Students are: ");
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + " ");

        System.out.println();
        System.out.print("\nNumber of students in course2: " + course2.getNumberOfStudents() + " Students are: ");
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.print(students2[i] + " ");

        // tell user how many students you plan to drop from each course
        System.out.println("\n\ndropping 2 students from course 1");
        System.out.println("\ndropping 1 student from course 2");

        // drop some students.
        course1.dropStudent("Tom Servo");
        course1.dropStudent("Joel Robinson");
        System.out.println("\nNumber of students in Course 1: " + " Students are: " + "\n" + course1);

        course2.dropStudent("Crow T. Robot");
        System.out.println("\nNumber of students in Course 2: " + " Students are: " + "\n" + course2);

        // clear course2, but keep course1 as it currently stands
        System.out.println("\n\nclearing course 2 course 2");
        course2.clear();

        System.out.println("\nNumber of students in Course 1: " + " Students are: " + "\n" + course1);
        System.out.println("\nNumber of students in Course 2: " + " Students are: " + "\n" + course2);
    }

}
