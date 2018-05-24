public class TestStudent {
  public static void main(String[] args) {
    Student s1 =  new Student();
    System.out.println(s1);

    Student s2 = new Student("jack", 3232323, 50.4);
    System.out.println(s2);

    Student s3 = new Student("omar", 444444, 70.60);
    System.out.println(s3);

    Student s4 = new Student("Sara", 589879, 60.88);
    System.out.println(s3);

    System.out.println("Name before: " + s4.getStudentName());
    s4.setStudentName("noor");
    System.out.println("Name after: " + s4.getStudentName());

    Student test = new Student();
    System.out.println("Max grade is: " + test.findMax(s4.getStudentGrade(), s3.getStudentGrade()));
  }
}
