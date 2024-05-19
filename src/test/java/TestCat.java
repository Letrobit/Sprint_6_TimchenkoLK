import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Animal;
import com.example.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    public Cat cat;

    @Spy
    public Feline feline;
    public Animal animal;

    @Test
    public void getSoundTestMeowExpected() {
        cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTestPredatorResultExpected() throws Exception {
        cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }
}