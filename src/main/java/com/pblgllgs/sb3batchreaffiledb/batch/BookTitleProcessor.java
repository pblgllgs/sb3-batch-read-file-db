package com.pblgllgs.sb3batchreaffiledb.batch;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import com.pblgllgs.sb3batchreaffiledb.entity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class BookTitleProcessor implements ItemProcessor<BookEntity, BookEntity> {
    @Override
    public BookEntity process(BookEntity item) throws Exception {
        log.info("Book Title Processor processing is called: {}", item.getTitle());
        item.setTitle(item.getTitle().replace(" ", "-"));
        log.info("Book Title Processor processing result: {}", item.getTitle());
        return item;
    }
}
