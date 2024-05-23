import com.example.Animal;
import com.example.Feline;
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
public class TestFeline {
    private static final String EXPECTED_FAMILY = "Кошачьи";
    private static final int NUMBER_OF_KITTENS = 10;
    @Spy
    public Feline feline = new Feline();

    @Test
    public void getFamilyExpectedCat(){
        assertEquals(EXPECTED_FAMILY,feline.getFamily());
    }
    @Test
    public void getFoodExpectedPredator() throws Exception {
        List<String> expectedlistFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList= feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        assertEquals(expectedlistFood,actualFoodList);
    }
    @Test
    public void getKittensNoParamsShouldReturnOne(){
        int actualKittenAmount = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        assertEquals(1,actualKittenAmount);
    }

    @Test
    public void getKittensParamsTrueShouldReturnSame(){
        assertEquals(NUMBER_OF_KITTENS,feline.getKittens(NUMBER_OF_KITTENS));
    }

}
