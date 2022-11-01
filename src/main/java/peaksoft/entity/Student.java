package peaksoft.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;


@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String stFirstName;

    private String stLastName;

    private int age;

    private String stEmail;

    /*@ManyToMany(cascade = {DETACH,MERGE,REFRESH,PERSIST},fetch = FetchType.LAZY)
    @JoinTable(name = "_student course",
            joinColumns = @JoinColumn(name = "student_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses = new ArrayList<>();*/

    @ManyToMany(cascade = {DETACH,MERGE,REFRESH,PERSIST},fetch = FetchType.EAGER)
    @JoinTable(name = "students_course",
            joinColumns = @JoinColumn(name = "course_id"),inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Course> course = new ArrayList<>();

    public Student(String stFirstName, String stLastName, int age, String stEmail) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.age = age;
        this.stEmail = stEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stFirstName='" + stFirstName + '\'' +
                ", stLastName='" + stLastName + '\'' +
                ", age=" + age +
                ", stEmail='" + stEmail + '\'' +
                '}';
    }
}
