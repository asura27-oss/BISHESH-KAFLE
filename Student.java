
/**
 * Create a Student class with:
• Attributes: name, studentId, age, course
• Create 3 Student objects with different data
• Display information of all students
 *
 * @author (Bishesh kafle)
 * @version (18/12/2025)
 */
public class Student
{
    //attribute
   private String name;
   protected String studentID;
   public int age;
   String course;
   //constrctor
   Student(String name,String studentID,int age,String course){
       this.name=name;
       this.studentID=studentID;
       this.age=age;
       this.course=course;
   }
   public void odd(){
       System.out.println("Name:"+name);
       System.out.println("Student ID:"+studentID);
       System.out.println("AGE:"+age);
       System.out.println("Course:"+course);
       System.out.println();
   }
   public static void main(String[] args){
       Student obj1=new Student("Megha","np05cp424535",180,"BIT");
       Student obj2=new Student("Indra","np05cp424890",190,"BBA");
       obj1.odd();
       obj2.odd();
       
   }
}
