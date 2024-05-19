import com.example.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TestLionWithParameters {
    public Lion lion;

    private String sex;
    private boolean result;

    Feline feline = Mockito.mock(Feline.class);
    public TestLionWithParameters(String sex, boolean result) {
        this.sex = sex;
        this.result=result;
    }
    @Parameterized.Parameters
    public static Object[][] getHasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                //{"Null", false} //Должен выкидывать exception
        };
    }


   @Before
   public void setup() throws Exception {
    lion = new Lion(sex, feline);
    }

    @Test
    public void hasManeTestMaleAndFemale() throws Exception {
            assertEquals("У самки нет гривы, а у самца есть грива", result, lion.doesHaveMane());
    }
}
