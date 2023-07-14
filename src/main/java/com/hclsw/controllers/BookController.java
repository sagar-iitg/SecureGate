package com.hclsw.controllers;

import com.hclsw.entities.Book;
import com.hclsw.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    BookRepository bookRepository;


    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks()
    {

        try{

            List<Book> bookList=new ArrayList<>();
            bookRepository.findAll().forEach(bookList::add);

            if(bookList.isEmpty())
            {
                return new ResponseEntity<>(bookList,HttpStatus.NO_CONTENT);
            }

            return  new ResponseEntity<>(bookList,HttpStatus.OK);


        }
        catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }
    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){


        Optional<Book> book =bookRepository.findById(id);
        if(book.isPresent())
        {
            return  new ResponseEntity<>(book.get(),HttpStatus.OK);

        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book b=bookRepository.save(book);
        return new ResponseEntity<>(b,HttpStatus.OK);



    }


    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id,@RequestBody Book newBookData)
    {

        Optional<Book> oldBookData=bookRepository.findById(id);
        if(oldBookData.isPresent())
        {

            Book updateBook=oldBookData.get();
            updateBook.setTitle(newBookData.getTitle());
            updateBook.setAuthor(newBookData.getAuthor());

            Book book=bookRepository.save(updateBook);
            return new ResponseEntity<>(book,HttpStatus.OK);



        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);



    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteBookById(@PathVariable Long id){

        bookRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);


    }



}
