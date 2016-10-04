// Created by Padraic Neylon on 26/09/2016.

import java.util.ArrayList;
import java.util.List;


public class Module {

    private String moduleName;
    private String moduleID;
    private List<Student> studentList;


    public Module(String moduleName, String moduleID)
    {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        studentList = new ArrayList<Student>();
    }

    public String getModuleName()
    {
        return this.moduleName;
    }

    public String getModuleID()
    {
        return this.moduleID;
    }

    public List<Student> getStudentList()
    {
        return this.studentList;
    }

}
