package schoolmanagement.system;


/**
 * Created by Samuella on 8/7/2024
 * This class is responsible for keeping the
 * track of Teacher's id, name and salary.
 */


public class Teacher {
    /**
     *The fields
     */
    private int id;
    private String name;
    private int salary;


    /**
     * Create a new Teacher object
     * @param id Teacher's id which is unique
     * @param name Teacher's name
     * @param salary Teacher's salary
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return teacher's id
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return teacher's name
     */
    public String name(){
        return name;
    }

    /**
     *
     * @return teacher's salary
     */
    public int Salary(){
        return salary;
    }

    /**
     *To update the teacher's salary
     * @param salary set the teacher's salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }



}
