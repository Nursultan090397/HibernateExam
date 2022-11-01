package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String teachFirstName;

    private String teachLastName;

    private String teachEmail;


    @OneToOne
    private Course course;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "teacher")
    private List<Course> courses;


    public Teacher(String teachFirstName, String teachLastName, String teachEmail, Course course) {
        this.teachFirstName = teachFirstName;
        this.teachLastName = teachLastName;
        this.teachEmail = teachEmail;

    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teachFirstName='" + teachFirstName + '\'' +
                ", teachLastName='" + teachLastName + '\'' +
                ", teachEmail='" + teachEmail + '\'' +
                '}';
    }
}
