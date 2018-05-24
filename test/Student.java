public class Student {
  private String studentName;
  private int studentNum;
  private double studentGrade;

  public Student(String studentName, int studentNum, double studentGrade) {
    this.studentName = studentName;
    this.studentNum = studentNum;
    this.studentGrade = studentGrade;
  }

  public Student() {
    this.studentName = "";
    this.studentNum = 0;
    this.studentGrade = 0;
  }

  public String getStudentName() {
    return this.studentName;
  }

  public int getStudentNum() {
    return this.studentNum;
  }

  public double getStudentGrade() {
    return this.studentGrade;
  }

  public void setStudentName(String name) {
    this.studentName = name;
  }

  public void setStudentNum(int num) {
    this.studentNum = num;
  }

  public void setStudentGrade(double grade) {
    this.studentGrade = grade;
  }

  public String toString() {
    return "Student Name: " + studentName + "\nStudent Num: " + studentNum + "\nStudent Grade: " + studentGrade;
  }

  public String compareNames(String name1, String name2) {
    if (name1.compareTo(name2) > 0) {
      return name1 + " is greater than " + name2;
    } else if (name1.compareTo(name2) == 0) {
      return name1 + " is equal to " + name2;
    } else {
      return name2 + " is less than " + name1;
    }
  }

  public double findMax(double grade1, double grade2) {
    if (grade1 < grade2) {
      return grade2;
    } else {
      return grade1;
    }
  }
}
