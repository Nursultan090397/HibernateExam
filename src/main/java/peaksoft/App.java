package peaksoft;

import peaksoft.dao.impl.CourseDaoImpl;
import peaksoft.dao.impl.StudentDaoImpl;
import peaksoft.dao.impl.TeacherDaoImpl;
import peaksoft.entity.Course;
import peaksoft.entity.Student;
import peaksoft.entity.Teacher;

public class App
{
    public static void main( String[] args ) {

        Course course1 = new Course("JAVA","9 MONTH");
        Course course2 = new Course("JAVASCRIPT","9 MONTH");
        Course course3 = new Course("ENGLISH","3 MONTH");

        Student student1 = new Student("Nursultan", "Osorov",25,"Osorov97@mail.ru");
        Student student2 = new Student("Bekzad", "Sarybaev",25,"Bekzad97@mail.ru");
        Student student3 = new Student("Nurgazy", "Baetov",24,"Baetov96@mail.ru");

        Teacher teacher = new Teacher("Mukhammed","Allanov","Allanov@gmail.com",course1);

        CourseDaoImpl courseDao = new CourseDaoImpl();
        StudentDaoImpl studentDao = new StudentDaoImpl();
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();

        courseDao.saveCourse(course1);

      studentDao.saveStudent(student1);

        teacherDao.saveTeacher(teacher);






    }
}
