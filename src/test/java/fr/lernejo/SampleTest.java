package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void name() {
        int result = new Sample().op(Sample.Operation.ADD, 1, 4);
        Assertions.assertThat(result).isEqualTo(5);
    }
}
