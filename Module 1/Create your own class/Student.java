public class Student {
    private String studentId;
    private String name;
    private double grade;
    private boolean isActive;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String displayStudentDetails() {
        return "ID: " + studentId +
                "\nName: " + name +
                " Grade: " + grade +
                "\nStatus: " + (isActive ? "Active" : "Inactive");
    }

    public String getLetterGrade() {
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }

    public boolean isPassing() {
        return grade >= 60;
    }
}
