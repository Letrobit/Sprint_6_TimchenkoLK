import com.example.Cat;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Animal;
import com.example.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setup(){
     cat = new Cat(feline);
    }
    @Test
    public void getSoundTestMeowExpected() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTestPredatorResultExpected() throws Exception {
        List<String> listFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(listFood);
        assertEquals(listFood, cat.getFood());

    }
}