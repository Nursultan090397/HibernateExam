package peaksoft.dao.impl;

import org.hibernate.Session;
import peaksoft.config.DataBaseConfig;
import peaksoft.dao.CourseDao;
import peaksoft.entity.Course;

public class CourseDaoImpl implements CourseDao {
    @Override
    public void saveCourse(Course course) {
        Session session= DataBaseConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.persist(course);
        session.getTransaction().commit();
        System.out.println("course save successfully");
        session.close();

    }
}
