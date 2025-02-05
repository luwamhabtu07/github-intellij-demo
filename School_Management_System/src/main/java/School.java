import java.util.*;

class School {
    private String name;
    private List<Department> departments;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }
}
