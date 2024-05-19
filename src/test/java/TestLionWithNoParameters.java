import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionWithNoParameters {


    @Spy
    Feline felineSpy = new Feline();

    @Spy
    Lion lion = new Lion("Самец", felineSpy);
    @Spy
    Animal animal;

    public TestLionWithNoParameters() throws Exception {
    }


    @Test
    public void lionHasKittensTestShouldReturn1() throws Exception {
        assertEquals(1,lion.getKittens());
    }
    @Test
    public void getFoodTestShouldReturnPredator() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());

    }
}
