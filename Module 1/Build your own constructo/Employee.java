public class Employee implements Cloneable {
    private String name;
    private int age;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.age = 18;
        this.salary = 0.0;
    }

    public Employee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

    public void displayDetails() {
        System.out.println(name + " | " + age + " | $" + String.format("%.2f", salary));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
