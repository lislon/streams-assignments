package tasks;

import org.junit.jupiter.api.Test;
import tasks.Task03TruckTypes;
import tasks.Task03TruckTypes.Truck;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Task03TruckTypes.*;
import static tasks.Task03TruckTypes.TruckType.*;

class Task03TruckTypesTest {
    @Test
    void testTypeByTruck() {
        var a = new Truck(1_000);
        assertEquals(Pickup, getTypeByWeight(a));

        var b = new Truck(20_000);
        assertEquals(SemiTrailer, getTypeByWeight(b));
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