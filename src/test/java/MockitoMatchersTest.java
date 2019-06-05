import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MockitoMatchersTest {

    @Mock
    private Consumer consumer;

    @Mock
    private Producer producer;

    @InjectMocks
    private Testee testee;

    @Test
    void dummy() {
        String name = "aa";
        String age = "bb";

        testee.dummy(name, age);

        verify(consumer, times(2)).consume(name, eq(age));
    }
}