package com.pblgllgs.sb3batchreaffiledb.batch;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

@Slf4j
public class BookTasklet implements Tasklet {

    int counter = 0;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        if (counter == 5) {
            counter = 0;
            return RepeatStatus.FINISHED;
        } else {
            log.info("Execution tasklet");
            counter++;
            return RepeatStatus.CONTINUABLE;
        }
    }
}
