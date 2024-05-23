import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionWithNoParameters {


    @Mock
    Feline felineSpy;
    Lion lion;

    @Before
    public void setup() throws Exception {
    lion = new Lion("Самец", felineSpy);
    }

    @Test
    public void lionHasKittensTestShouldReturn1() throws Exception {
        int EXPECTED_KITTENS = 1;
        Mockito.when(felineSpy.getKittens()).thenReturn(EXPECTED_KITTENS);
        assertEquals(1,lion.getKittens());
    }
    @Test
    public void getFoodTestShouldReturnPredator() throws Exception {
        List<String> listFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineSpy.getFood("Хищник")).thenReturn(listFood);
        assertEquals(listFood,lion.getFood());

    }
}
