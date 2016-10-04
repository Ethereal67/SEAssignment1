// Created by Padraic Neylon on 26/09/2016.


import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String dob;
    private int id;
    private String username;

    private ArrayList<Module> studentModules;
    private CourseProgramme course;


    public Student(String name, int age, String dob, int id, CourseProgramme course) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.course = course;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getDOB()
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

    public CourseProgramme getCourse(){

        return this.course;
    }

    public ArrayList<Module> getStudentModules(){

        return this.studentModules;
    }

    public void addStudentModules(Module studentModule) {
        studentModules.add(studentModule);
    }

}
