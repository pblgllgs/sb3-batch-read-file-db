package com.pblgllgs.sb3batchreaffiledb.repository;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import com.pblgllgs.sb3batchreaffiledb.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}