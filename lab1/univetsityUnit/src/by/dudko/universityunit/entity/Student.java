package by.dudko.universityunit.entity;

import sun.security.provider.Sun;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cplus on 15.09.2017.
 */
public class Student {
    private String name;
    private String surname;
    private Map<Subject, Integer> subjects;

    public Student(String name, String surname, Map<Subject, Integer> subjects) {
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<Subject, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<Subject, Integer> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        return subjects != null ? subjects.equals(student.subjects) : student.subjects == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (subjects != null ? subjects.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
