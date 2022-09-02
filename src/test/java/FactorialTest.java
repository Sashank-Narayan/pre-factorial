import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest{
    @Test
    void factorial100(){
        Factorial fact_obj = new Factorial(100);
        assertEquals(fact_obj.factorial(), Arrays.asList(1,2,4,5,10,20,25,50));
    }

    @Test
    void factorial2500(){
        Factorial fact_obj = new Factorial(2500);
        assertEquals(fact_obj.factorial(),Arrays.asList(1,2,4,5,10,20,25,50,100,125,250,500, 625, 1250));
    }

    @Test
    void factorial0(){
        Factorial fact_obj = new Factorial(0);
        assertEquals(fact_obj.factorial(),Arrays.asList(1));
    }

    @Test
    void factorial25(){
        Factorial fact_obj = new Factorial(25);
        assertEquals(fact_obj.factorial(),Arrays.asList(1,5));
    }


    // @Test
    // void shouldReturnAreaWhenLengthisGiven(){
    //     Rectangle rectangle1 = new Rectangle(0);
    //     Rectangle rectangle2 = new Rectangle(1);
    //     Rectangle rectangle3 = new Rectangle(10);
    //     // assertEquals(rectangle1.area(),0);
    //     // assertEquals(rectangle2.area(),1);

    //     int area = rectangle3.area();

    //     assertThat(rectangle3.area(), is(equalTo(100)));

    // }

    // @Test
    // void shouldReturnAreaWhenBreadthisGiven(){
    //     Rectangle rectangle1 = new Rectangle(0);
    //     Rectangle rectangle2 = new Rectangle(1);
    //     Rectangle rectangle3 = new Rectangle(20);
    //     // assertEquals(rectangle1.area(),0);
    //     // assertEquals(rectangle2.area(),1);

    //     int area = rectangle3.area();

    //     assertThat(area, is(equalTo(400)));

    // }
}
