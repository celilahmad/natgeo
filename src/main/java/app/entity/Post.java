package app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "posts")
public class Post {

    @Id
    private int id;

    private String title;

    private String content;

    private String author;

    private String date;
}
