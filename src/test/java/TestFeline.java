import com.example.Animal;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    private static final String EXPECTED_FAMILY = "Кошачьи";
    private static final int NUMBER_OF_KITTENS = 10;
    public Feline feline;
    @Spy
    public Animal animal;
    @Before
    public void setup() {
        feline = new Feline();
    }
    @Test
    public void getFamilyExpectedCat(){
        assertEquals(EXPECTED_FAMILY,feline.getFamily());
    }
    @Test
    public void getFoodExpectedPredator() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
    @Test
    public void getKittensNoParamsShouldReturnOne(){
        assertEquals(1,feline.getKittens());
    }

    @Test
    public void getKittensParamsTrueShouldReturnSame(){
        assertEquals(NUMBER_OF_KITTENS,feline.getKittens(NUMBER_OF_KITTENS));
    }

}
