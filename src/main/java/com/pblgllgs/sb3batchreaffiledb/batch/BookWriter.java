package com.pblgllgs.sb3batchreaffiledb.batch;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import com.pblgllgs.sb3batchreaffiledb.entity.BookEntity;
import com.pblgllgs.sb3batchreaffiledb.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BookWriter implements ItemWriter<BookEntity> {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void write(Chunk<? extends BookEntity> chunk) throws Exception {
        log.info("Writing: {}", chunk.getItems().size());
        bookRepository.saveAll(chunk.getItems());
    }
}
