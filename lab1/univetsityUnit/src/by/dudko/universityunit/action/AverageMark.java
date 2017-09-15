package by.dudko.universityunit.action;

import by.dudko.universityunit.entity.*;

/**
 * Created by cplus on 15.09.2017.
 */
public class AverageMark {
    public static double findingByStudent(Student student) {
        double sum = 0;
        for (Integer subject : student.getSubjects().values()) {
            sum += subject;
        }
        return sum / student.getSubjects().size();
    }

    public static double findingByGroup(Group group) {
        double sum = 0;
        int count = 0;
        for (Student student : group.getStudents()) {
            for (Integer mark : student.getSubjects().values()) {
                sum += mark;
                count++;
            }
        }
        return sum / count;
    }

    public static double findingByFaculty(Faculty faculty) {
        double sum = 0;
        int count = 0;
        for (Group group : faculty.getGroups()) {
            for (Student student : group.getStudents()) {
                for (Integer mark : student.getSubjects().values()) {
                    sum += mark;
                    count++;
                }
            }
        }
        return sum / count;
    }

    public static double findingByUniversity(University university) {
        double sum = 0;
        int count = 0;
        for (Faculty faculty : university.getFaculties()) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    for (Integer mark : student.getSubjects().values()) {
                        sum += mark;
                        count++;
                    }
                }
            }
        }
        return sum / count;
    }

    public static double findingByProjectInGroup(Group group, Subject subject) {
        double sum = 0;
        int count = 0;
        for (Student student : group.getStudents()) {
            if (student.getSubjects().containsKey(subject)) {
                sum += student.getSubjects().get(subject);
                count++;
            } else throw new NullPointerException("This group hasn't such subject");
        }
        return sum / count;
    }

    public static double findingByProjectInFaculty(Faculty faculty, Subject subject) {
        double sum = 0;
        int count = 0;
        for (Group group : faculty.getGroups()) {
            for (Student student : group.getStudents()) {
                if (student.getSubjects().containsKey(subject)) {
                    sum += student.getSubjects().get(subject);
                    count++;
                } else throw new NullPointerException("This faculty hasn't such subject");
            }
        }
        return sum / count;
    }

    public static double findingByProjectInUniversity(University university, Subject subject) {
        double sum = 0;
        int count = 0;
        for (Faculty faculty : university.getFaculties()) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    if (student.getSubjects().containsKey(subject)) {
                        sum += student.getSubjects().get(subject);
                        count++;
                    }
                }
            }
        }
        return sum / count;
    }
}
