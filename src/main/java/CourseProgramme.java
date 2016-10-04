// Created by Padraic Neylon on 26/09/2016.

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class CourseProgramme {

    private String courseName;
    private List<Module> modules;
    private LocalDate startDate;
    private LocalDate endDate;


    public CourseProgramme(String courseName, LocalDate startDate, LocalDate endDate)
    {
        this.courseName = courseName;
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

    public LocalDate getStartDate(String startDate)
    {
        return this.startDate;
    }

    public LocalDate getEndDate(String endDate)
    {
        return this.endDate;
    }
}
