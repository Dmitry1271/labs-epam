package by.dudko.universityunit.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 15.09.2017.
 */
public class University {
    private List<Faculty> faculties = new ArrayList<>();

    public University(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;

        return faculties != null ? faculties.equals(that.faculties) : that.faculties == null;
    }

    @Override
    public int hashCode() {
        return faculties != null ? faculties.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "University{" +
                "faculties=" + faculties +
                '}';
    }
}
