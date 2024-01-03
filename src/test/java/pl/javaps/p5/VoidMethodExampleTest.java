package pl.javaps.p5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VoidMethodExampleTest {

    private VoidMethodExample voidMethodExample = new VoidMethodExample();

//    @Test
//    void shouldDeleteFile() throws IOException {
//        // given
//        Files.createFile(Paths.get("./testFile.txt"));
//        // when
//          voidMethodExample.delete(Paths.get("."), "testFile.txt");
//        // then
//        assertThat(Files.exists(Paths.get("./testFile.txt"))).isFalse();
//
//    }



    @Test
    void shouldDeleteFileWithTempDir(@TempDir Path tempDir) throws IOException {
        // given
        //System.out.println(tempDir);
        Files.createFile(tempDir.resolve("testFile.txt"));
        // when
        voidMethodExample.delete(tempDir, "testFile.txt");
        // then
        assertThat(Files.exists(tempDir.resolve("testFile.txt"))).isFalse();

    }


}