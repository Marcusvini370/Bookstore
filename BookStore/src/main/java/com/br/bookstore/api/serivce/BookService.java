package com.br.bookstore.api.serivce;

import com.br.bookstore.api.model.BookDTO;
import com.br.bookstore.api.model.BookListDTO;
import com.br.bookstore.api.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public void addBook(BookDTO bookDTO){
        bookRepository.addBook(bookDTO);
    }

    public void addCollections(BookListDTO bookListDTO){
        bookRepository.addColections(bookListDTO);
    }

    public BookDTO getBookBydId(Integer id){
       return  bookRepository.getBookById(id);
    }

    public List<BookDTO> getBooks(){
        return bookRepository.getBooks();
    }

    public boolean updateBook(Integer id, BookDTO bookDTO){
        return bookRepository.updateBook(id, bookDTO);
    }

    public boolean deleteBook(Integer id){
        return bookRepository.deleteBook(id);
    }

}
