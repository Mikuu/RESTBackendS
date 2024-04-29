package com.ariman.restbackend.dtos;

import com.ariman.restbackend.entities.Book;

public class CreateBookResponseDTO {

    public String bid;

    public CreateBookResponseDTO(Book book) {
        this.bid = book.getBid();
    }
}
