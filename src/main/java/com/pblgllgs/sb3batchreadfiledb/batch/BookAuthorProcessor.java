package com.pblgllgs.sb3batchreadfiledb.batch;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import com.pblgllgs.sb3batchreadfiledb.entity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class BookAuthorProcessor implements ItemProcessor<BookEntity, BookEntity> {
    @Override
    public BookEntity process(BookEntity item) throws Exception {
        log.info("Book Author Processor processing is called: {}", item.getAuthor());
        item.setAuthor("By "+ item.getAuthor());
        return item;
    }
}
