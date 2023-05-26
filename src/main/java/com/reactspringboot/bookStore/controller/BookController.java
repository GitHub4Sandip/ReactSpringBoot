package com.reactspringboot.bookStore.controller;

import com.reactspringboot.bookStore.dto.BookDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BookController {

  @GetMapping("books")
  public ResponseEntity<List<BookDto>> getBooks() {
    BookDto book = BookDto.builder()
        .title("My first book title")
        .build();
    BookDto bookSecond = BookDto.builder()
        .title("My second book title")
        .build();
    List<BookDto> books = new ArrayList<>();
    books.add(book);
    books.add(bookSecond);
    return ResponseEntity.ok(books);
  }

}
