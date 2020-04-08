package tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tasks.Task4_Exam.*;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static tasks.Task4_Exam.TruckType.*;
import static tasks.Task4_Exam.*;

class Task4ExamTest {

    @Nested
    @DisplayName("getTypeByWeight will return 'lightest' possible truck which can handle given weight")
    class Truck_By_Weight {

        @Test
        @DisplayName("For 1000 kg is Pickup is enough")
        void pickup() {
            assertEquals(Pickup, getTypeByWeight(1_000));
        }

        @Test
        @DisplayName("For 20 000 kg is Semi Trailer is enough")
        void semiTrailer() {
            assertEquals(SemiTrailer, getTypeByWeight(20_000));
        }

        @Test
        @DisplayName("For out of bound weights we do not have any vehicles, so we expect exception")
        void tooMuchWeight() {
            assertThrows(WeightTooHighException.class, () -> getTypeByWeight(150_000));
        }
    }


    @Test
    void testGroupTrucksByType() {
        var a = new Truck(5_000);
        var b = new Truck(5_100);
        var c = new Truck(20_000);

        var expected = new HashMap<>() {{
            put(SmallBoxTruck, Arrays.asList(a, b));
            put(SemiTrailer, Arrays.asList(c));
        }};

        assertEquals(expected, groupTrucksByType(Arrays.asList(a, b, c)));
    }

    @Test
    void testCountTrucksByType() {
        var a = new Truck(5_000);
        var b = new Truck(5_100);
        var c = new Truck(20_000);

        var expected = new HashMap<>() {{
            put(SmallBoxTruck, 2L);
            put(SemiTrailer, 1L);
        }};

        assertEquals(expected, countTrucksByType(Arrays.asList(a, b, c)));
    }
}