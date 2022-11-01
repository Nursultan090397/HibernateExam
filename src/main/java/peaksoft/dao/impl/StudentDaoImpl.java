package peaksoft.dao.impl;

import org.hibernate.Session;
import peaksoft.config.DataBaseConfig;
import peaksoft.dao.StudentDao;
import peaksoft.entity.Student;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void saveStudent(Student student) {
        Session session= DataBaseConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
        System.out.println("student save successfully");
        session.close();
    }
}
