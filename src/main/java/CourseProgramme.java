// Created by Padraic Neylon on 26/09/2016.

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;


public class CourseProgramme {

    private String courseName;
    private List<Module> modules;
    private DateTime startDate;
    private DateTime endDate;


    public CourseProgramme(String courseName, List<Module> modules, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<Module>();
    }

    public String getCourseName(String courseName)
    {
        return this.courseName;
    }

    public List<Module> getModules()
    {
        return this.modules;
    }

    public void addModule(Module module)
    {
        this.modules.add(module);
    }

    public DateTime getStartDate(String startDate)
    {
        return this.startDate;
    }

    public DateTime getEndDate(String endDate)
    {
        return this.endDate;
    }
}
