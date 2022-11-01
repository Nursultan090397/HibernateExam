package peaksoft.dao.impl;

import org.hibernate.Session;
import peaksoft.config.DataBaseConfig;
import peaksoft.dao.TeacherDao;
import peaksoft.entity.Teacher;

public class TeacherDaoImpl implements TeacherDao {

    @Override
    public void saveTeacher(Teacher teacher) {
        Session session=DataBaseConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.persist(teacher);
        session.getTransaction().commit();
        System.out.println("teacher save successfully");
        session.close();

    }
}
