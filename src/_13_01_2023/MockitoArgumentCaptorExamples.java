package _13_01_2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MockitoArgumentCaptorExamples {

    @Captor
    ArgumentCaptor<Long> acLong;
//    ArgumentCaptor<Long> acLong = ArgumentCaptor.forClass(Long.class);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test() {
        MathUtils mockMathUtils = mock(MathUtils.class);
        when(mockMathUtils.add(1, 1)).thenReturn(2);
        when(mockMathUtils.isInteger(anyString())).thenReturn(true);

        ArgumentCaptor<Integer> acInteger = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor<String> acString = ArgumentCaptor.forClass(String.class);

        assertEquals(2, mockMathUtils.add(1, 1));
        assertTrue(mockMathUtils.isInteger("1"));
        assertTrue(mockMathUtils.isInteger("999"));

        verify(mockMathUtils).add(acInteger.capture(), acInteger.capture());
        List<Integer> allValues = acInteger.getAllValues();
        assertEquals(List.of(1, 1), allValues);
        verify(mockMathUtils, times(2)).isInteger(acString.capture());
        List<String> allStringValues = acString.getAllValues();
        assertEquals(List.of("1", "999"), allStringValues);

        when(mockMathUtils.squareLong(2L)).thenReturn(4L);
        assertEquals(4L, mockMathUtils.squareLong(2L));
        verify(mockMathUtils).squareLong(acLong.capture());
        assertEquals(2, (long) acLong.getValue());
    }
}

class MathUtils {
    public int add(int x, int y) {
        return x + y;
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public long squareLong(long l) {
        return l * l;
    }
}