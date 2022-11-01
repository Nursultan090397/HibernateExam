package peaksoft.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    private String duration;

    @OneToOne (mappedBy = "course",cascade = CascadeType.ALL)
    private Teacher teacher;

    /*@ManyToMany (cascade = {DETACH,MERGE,REFRESH,PERSIST},fetch = FetchType.LAZY,mappedBy = "courses")
   private List<Student> students = new ArrayList<>();*/

    @ManyToMany(mappedBy = "course",fetch = FetchType.EAGER)
    private List<Student> students = new ArrayList<>();


    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}



