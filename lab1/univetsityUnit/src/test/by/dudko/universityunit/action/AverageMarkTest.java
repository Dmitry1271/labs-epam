package test.by.dudko.universityunit.action;

import by.dudko.universityunit.action.AverageMark;
import by.dudko.universityunit.entity.*;
import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cplus on 15.09.2017.
 */
public class AverageMarkTest {
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    Student student6;
    Group group1;
    Group group2;
    Group group3;
    Faculty faculty1;
    Faculty faculty2;
    University university;

    @Before
    public void init() {
        Map subjects1 = new HashMap<Subject, Integer>();
        subjects1.put(Subject.PROGRAMMING, 9);
        subjects1.put(Subject.ENGLISH, 9);
        subjects1.put(Subject.PE, 9);
        subjects1.put(Subject.ALGEBRA, 9);
        student1 = new Student("Артем", "Станкевич", subjects1);

        Map subjects2 = new HashMap<Subject, Integer>();
        subjects2.put(Subject.PROGRAMMING, 10);
        subjects2.put(Subject.ENGLISH, 5);
        subjects2.put(Subject.PE, 7);
        subjects2.put(Subject.ALGEBRA, 8);
        student2 = new Student("Антон", "Бразовский", subjects2);

        Map subjects3 = new HashMap<Subject, Integer>();
        subjects3.put(Subject.PROGRAMMING, 6);
        subjects3.put(Subject.ENGLISH, 9);
        subjects3.put(Subject.PE, 8);
        subjects3.put(Subject.ALGEBRA, 10);
        student3 = new Student("Алеся", "Абибок", subjects3);

        Map subjects4 = new HashMap<Subject, Integer>();
        subjects4.put(Subject.FAN, 10);
        subjects4.put(Subject.UMF, 9);
        subjects4.put(Subject.SOCIOLOGY, 8);
        student4 = new Student("Даниил", "Бойко", subjects4);

        Map subjects5 = new HashMap<Subject, Integer>();
        subjects5.put(Subject.FAN, 5);
        subjects5.put(Subject.UMF, 4);
        subjects5.put(Subject.SOCIOLOGY, 9);
        student5 = new Student("Константин", "Кот", subjects5);

        Map subjects6 = new HashMap<String, Subject>();
        subjects6.put(Subject.FAN, 5);
        subjects6.put(Subject.UMF, 6);
        subjects6.put(Subject.SOCIOLOGY, 9);
        student6 = new Student("Anna", "Zhukovec", subjects6);

        List<Student> studentsGroup1 = new ArrayList<>();
        studentsGroup1.add(student1);
        studentsGroup1.add(student2);
        group1 = new Group(1, studentsGroup1);

        List<Student> studentsGroup2 = new ArrayList<>();
        studentsGroup2.add(student3);
        group2 = new Group(2, studentsGroup2);

        List<Student> studentsGroup3 = new ArrayList<>();
        studentsGroup3.add(student4);
        studentsGroup3.add(student5);
        studentsGroup3.add(student6);
        group3 = new Group(1, studentsGroup3);

        List<Group> groupsFaculty1 = new ArrayList<>();
        groupsFaculty1.add(group1);
        groupsFaculty1.add(group2);
        faculty1 = new Faculty("ММФ", groupsFaculty1);

        List<Group> groupsFaculty2 = new ArrayList<>();
        groupsFaculty2.add(group3);
        faculty2 = new Faculty("ФПМИ", groupsFaculty2);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);

        university = new University(faculties);
    }

    @Test
    public void findingByUniversityTest() {
        Assert.assertEquals(AverageMark.findingByUniversity(university), 7.81, 0.01);
    }

    @Test
    public void findingByFacultyTest() {
        Assert.assertEquals(AverageMark.findingByFaculty(faculty1), 8.25, 0.01);
    }

    @Test
    public void findingByGroupTest() {
        Assert.assertEquals(AverageMark.findingByGroup(group1), 8.25, 0.01);
        Assert.assertEquals(AverageMark.findingByGroup(group2), 8.25, 0.01);
        Assert.assertEquals(AverageMark.findingByGroup(group3), 7.22, 0.01);
    }

    @Test
    public void findingByStudentTest() {
        Assert.assertEquals(AverageMark.findingByStudent(student4), 9, 1);
        Assert.assertEquals(AverageMark.findingByStudent(student6), 6.67, 1);
        Assert.assertEquals(AverageMark.findingByStudent(student1), 9, 1);
    }

    @Test
    public void findingByProjectInUniversityTest() {
        Assert.assertEquals(AverageMark.findingByProjectInUniversity(university, Subject.PE), 8, 0.01);
        Assert.assertEquals(AverageMark.findingByProjectInUniversity(university, Subject.SOCIOLOGY), 8.66, 0.01);
    }

    @Test
    public void findingByProjectInGroupTest() {
        Assert.assertEquals(AverageMark.findingByProjectInFaculty(faculty1, Subject.ENGLISH), 7.66, 0.01);
    }

    @Test
    public void findingByProjectInFacultyTest() {
        Assert.assertEquals(AverageMark.findingByProjectInGroup(group3, Subject.SOCIOLOGY), 8.66, 0.01);
    }


}
