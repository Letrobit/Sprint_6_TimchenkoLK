import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;


@RunWith(Parameterized.class)
public class TestLionException {

    private String sex;
    private static final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самец или самка";

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

    @Test(expected = Exception.class)
    public void throwsExceptionTrue() throws Exception {
            new Lion(sex, null);
        }
}
