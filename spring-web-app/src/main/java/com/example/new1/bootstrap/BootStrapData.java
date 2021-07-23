package com.example.new1.bootstrap;

import com.example.new1.domain.Author;
import com.example.new1.domain.Book;
import com.example.new1.repositories.AuthorRepository;
import com.example.new1.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Author eric = new Author("Eric", "Evans");
        Book book = new Book("W&P", "123");


        book = bookRepository.save(book);
        eric = authorRepository.save(eric);


        eric.getBooks().add(book);
        book.getAuthors().add(eric);



        book = bookRepository.save(book);
        eric = authorRepository.save(eric);

        System.out.println("");


//        Book ddd = new Book("Book Name","12321");
//        eric.getBooks().add((ddd));
//        ddd.getAuthors().add((eric));
//
//        authorRepository.save(eric);
//        bookRepository.save(ddd);
//
//        Author rod = new Author("Rod", "Jonson");
//        Book noEJB = new Book("Book Name2","59223");
//        rod.getBooks().add(noEJB);
//        noEJB.getAuthors().add(rod);
    }
}
