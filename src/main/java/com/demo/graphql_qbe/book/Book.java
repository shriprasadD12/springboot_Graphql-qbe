package com.demo.graphql_qbe.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private Integer publishedYear;

    public Book(String title, String author, int publishedYear) {
    }
}
