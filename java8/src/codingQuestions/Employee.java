package codingQuestions;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String country;

    public Employee(int id, String name, int salary, String country) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
