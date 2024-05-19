import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@RunWith(Parameterized.class)
public class TestLionException {
    public Lion lion;

    private String sex;
    private static final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самец или самка";

    Feline feline = Mockito.mock(Feline.class);
    public TestLionException(String sex) {
        this.sex = sex;
    }
    @Parameterized.Parameters
    public static Object[][] params() {
        return new Object[][]{
                {"Кошька"},
                {null},
                {"Автомобиль"},
                {"unknown"}
        };
    }

    @Test
    public void throwsExceptionTrue() throws Exception {
           Exception exception = assertThrows(Exception.class, () -> {
               new Lion(sex, null);
           });
        assertEquals(EXPECTED_ERROR,exception.getMessage());
    }
}
