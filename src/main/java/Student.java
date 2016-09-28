// Created by Padraic Neylon on 26/09/2016.


public class Student {

    private String name;
    private int age;
    private String dob;
    private int id;
    private String username;


    public Student(String name, int age, String dob, int id)
    {
       this.name = name;
       this.age = age;
       this.dob = dob;
       this.id = id;
    }

    public String getName(String name)
    {
        return this.name;
    }

    public int getAge(int age)
    {
        return this.age;
    }

    public String getDOB(String dob)
    {
        return this.dob;
    }

    public int getID(int id)
    {
        return this.id;
    }

    public String getUsername()
    {
        username = name + id;
        return username;
    }

}
