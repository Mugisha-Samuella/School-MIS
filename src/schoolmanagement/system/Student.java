package schoolmanagement.system;

/**
 * Created by Samuella on 8/7/2024
 * This class is responsible for keeping the
 * track of students fees, name, grade and fees
 * paid.
 */

public class Student {

    //fields
   private int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;

    /**
     *To create a new student by initialising
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */

    public void student(int id, String name, int grade){
          this.id = id;
          this.name = name;
          this.grade = grade;
          this.feesPaid = 0;
          this.feesTotal = 0;
    }

    /**
     *Update the student's grade
     * @param grade new grade of the student
     */

    public void setGrade(int grade){
        this.grade = grade;
    }


    /**
     * Add fees to the fees paid
     * @param fees the fees paid by the student
     */
    public void setFeesPaid(int fees){
        feesPaid += fees;
    }
}
