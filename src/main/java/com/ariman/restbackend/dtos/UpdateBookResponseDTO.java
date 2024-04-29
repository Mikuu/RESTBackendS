package com.ariman.restbackend.dtos;

import com.ariman.restbackend.entities.Book;

public class UpdateBookResponseDTO {

    public int updatedCount;

    public UpdateBookResponseDTO(int updatedCount) {
        this.updatedCount = updatedCount;
    }
}
