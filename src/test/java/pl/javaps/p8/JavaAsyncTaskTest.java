package pl.javaps.p8;

import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.*;

class JavaAsyncTaskTest {

    private JavaAsyncTask javaAsyncTask = new JavaAsyncTask();

    @Test
    void shouldRunAsyncTask() throws InterruptedException {
        // given

        // when
        javaAsyncTask.runTask();
        // then
        await().atMost(Duration.ofSeconds(1))
                .until(() -> javaAsyncTask.getResult());

        //assertThat(javaAsyncTask.getResult()).isTrue();
    }
}