package com.pblgllgs.sb3batchreaffiledb.config;
/*
 *
 * @author pblgl
 * Created on 02-02-2024
 *
 */

import com.pblgllgs.sb3batchreaffiledb.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    public DataSource datasource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/db_books");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("password");
        return dataSourceBuilder.build();
    }

    @Bean
    public DataSourceInitializer dataSourceInitializer() {
        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(datasource());
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        databasePopulator.addScript(new ClassPathResource("init.sql"));
        initializer.setDatabasePopulator(databasePopulator);
        return initializer;
    }
}
