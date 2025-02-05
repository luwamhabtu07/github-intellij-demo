public class Main {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Department science = new Department("Science");
        science.addTeacher(new Teacher("Mr. Smith", "Biology"));
        science.addTeacher(new Teacher("Mrs. Jones", "Chemistry"));
        science.addStudent(new Student("John Doe", 10));
        science.addStudent(new Student("Jane Doe", 12));
        science.addStudent(new Student("Jim Beam", 11));

        Department math = new Department("Mathematics");
        math.addTeacher(new Teacher("Mr. White", "Calculus"));
        math.addTeacher(new Teacher("Ms. Black", "Algebra"));
        math.addStudent(new Student("Tim Cook", 10));
        math.addStudent(new Student("Ann Taylor", 11));
        math.addStudent(new Student("Gary Oak", 12));

        school.addDepartment(science);
        school.addDepartment(math);

        // Print school details
        System.out.println("School: " + school.getName());
        for (Department dept : school.getDepartments()) {
            System.out.println("Department: " + dept.getName());
            System.out.println("- Teachers:");
            for (Teacher t : dept.getTeachers()) {
                System.out.println("  " + t.getName() + " (" + t.getSubject() + ")");
            }
            System.out.println("- Students:");
            for (Student s : dept.getStudents()) {
                System.out.println("  " + s.getName() + " (Grade " + s.getGradeLevel() + ")");
            }
        }

        // Normal cases
        System.out.println("\nNormal Cases");
        System.out.println("Total Departments: " + school.getDepartments().size());
        System.out.println("Total Science Teachers: " + science.getTeachers().size());
        System.out.println("Total Math Students: " + math.getStudents().size());

        // Edge Cases
        System.out.println("\nEdge Cases");
        Department emptyDept = new Department("History");
        school.addDepartment(emptyDept);
        System.out.println("Total Departments after adding empty: " + school.getDepartments().size());
        System.out.println("Total History Teachers: " + emptyDept.getTeachers().size());
        System.out.println("Total History Students: " + emptyDept.getStudents().size());
    }
}
