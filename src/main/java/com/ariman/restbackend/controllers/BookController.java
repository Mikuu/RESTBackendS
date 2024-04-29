package com.ariman.restbackend.controllers;

import com.ariman.restbackend.dtos.CreateBookResponseDTO;
import com.ariman.restbackend.dtos.DeleteBookResponseDTO;
import com.ariman.restbackend.dtos.UpdateBookResponseDTO;
import com.ariman.restbackend.entities.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final Book book = new Book("BID-TEST-MODE-SPRINGBOOT", "TITLE-TEST-MODE-SPRINGBOOT", "AUTHOR-TEST-MODE-SPRINGBOOT", 9090950, "Published-At-SPRINGBOOT");

    @PostMapping("/book")
    public CreateBookResponseDTO createBook(@RequestBody Book payload) {
        return new CreateBookResponseDTO(this.book);
    }

    @GetMapping("/book")
    public Book getBook(@RequestParam(value = "bid", required = true) String bid) {
        return this.book;
    }

    @PutMapping("/book/{bid}")
    public UpdateBookResponseDTO updateBook(@PathVariable String bid, @RequestBody Book payload) {
        return new UpdateBookResponseDTO(0);
    }

    @DeleteMapping("/book/{bid}")
    public DeleteBookResponseDTO deleteBook(@PathVariable String bid) {
        return new DeleteBookResponseDTO(0);
    }
}
