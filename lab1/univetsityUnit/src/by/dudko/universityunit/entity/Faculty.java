package by.dudko.universityunit.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 15.09.2017.
 */
public class Faculty {
    private String facultyName;
    private List<Group> groups = new ArrayList<>();

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (facultyName != null ? !facultyName.equals(faculty.facultyName) : faculty.facultyName != null) return false;
        return groups != null ? groups.equals(faculty.groups) : faculty.groups == null;
    }

    @Override
    public int hashCode() {
        int result = facultyName != null ? facultyName.hashCode() : 0;
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", groups=" + groups +
                '}';
    }
}
