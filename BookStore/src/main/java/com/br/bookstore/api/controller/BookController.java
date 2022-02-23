package com.br.bookstore.api.controller;

import com.br.bookstore.api.model.BookDTO;
import com.br.bookstore.api.model.BookListDTO;
import com.br.bookstore.api.serivce.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path ="/bookstore")
public class BookController {

    private final BookService bookService;

@GetMapping
private ResponseEntity<List<BookDTO>> getBooks(){
    return  ResponseEntity.ok(bookService.getBooks());
}

@GetMapping("/{id}")
private ResponseEntity<BookDTO> getBookBydId(@PathVariable("id") Integer id){
    BookDTO response = bookService.getBookBydId(id);
    if(response == null){
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    return  new ResponseEntity<>(response, HttpStatus.OK);
}

    @PostMapping
    private ResponseEntity<BookDTO> addBook(@RequestBody BookDTO bookDTO){
        bookService.addBook(bookDTO);
        return new ResponseEntity<>(bookDTO, HttpStatus.OK);
    }

    @PostMapping("/all")
    public ResponseEntity<BookListDTO> addCollections(@RequestBody BookListDTO bookListDTO) {
        bookService.addCollections(bookListDTO);
        return  ResponseEntity.ok(bookListDTO);
    }

    @PutMapping("{id}")
    private ResponseEntity<BookDTO> updateBook(@PathVariable("id") Integer id, @RequestBody BookDTO bookDTO){
        bookService.updateBook(id, bookDTO);
        return new ResponseEntity<>(bookDTO, HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    private ResponseEntity<BookDTO> deleteBookBydId(@PathVariable("id") Integer id){
        this.bookService.deleteBook(id);
        return  ResponseEntity.noContent().build();
    }

}
