package az.edu.itbrains.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="articles")
public class Article {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String title;

    @Column(length = 10000)
    private String description;
    private String seoUrl;
    private String photoUrl;
    private int viewCount;
    private Date createdDate;

@ManyToOne
    private Category category;
}
