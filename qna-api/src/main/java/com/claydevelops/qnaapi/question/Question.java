package com.claydevelops.qnaapi.question;

import com.claydevelops.qnaapi.user.User;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    private String title;
    private String body;

    protected Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private String getAuthorUsername() {
        if (null == author) return null;
        return author.getUsername();
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", author=" + getAuthorUsername() +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
