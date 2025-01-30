public class Employee {
    private String name;
    private static int idCounter = 1; // Static counter for unique IDs
    private int ID;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.ID = idCounter++;;  // Assign unique ID
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() { return name; }
    public int getID() { return ID; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }
    }


