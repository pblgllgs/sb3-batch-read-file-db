package com.pblgllgs.sb3batchreadfiledb.batch;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import com.pblgllgs.sb3batchreadfiledb.entity.BookEntity;
import org.springframework.batch.item.ItemReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RestBookReader implements ItemReader<BookEntity> {

    private final String url;
    private final RestTemplate restTemplate;
    private int nextBook;
    private List<BookEntity> bookEntityList;

    public RestBookReader(String url, RestTemplate restTemplate) {
        this.url = url;
        this.restTemplate = restTemplate;
    }


    @Override
    public BookEntity read() throws Exception {
        if (this.bookEntityList == null) {
            bookEntityList = fetchBooks();
        }
        BookEntity book = null;

        if (nextBook < bookEntityList.size()) {
            book = bookEntityList.get(nextBook);
            nextBook++;
        } else {
            nextBook = 0;
            bookEntityList = null;
        }
        return book;
    }

    private List<BookEntity> fetchBooks() {
        ResponseEntity<BookEntity[]> response = restTemplate.getForEntity(this.url, BookEntity[].class);
        BookEntity[] books = response.getBody();
        if (books != null) {
            return Arrays.asList(books);
        }
        return null;
    }
}
