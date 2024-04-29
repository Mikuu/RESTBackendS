package com.ariman.restbackend.dtos;

public class DeleteBookResponseDTO {

    public int deletedCount;

    public DeleteBookResponseDTO(int deletedCount) {
        this.deletedCount = deletedCount;
    }
}
