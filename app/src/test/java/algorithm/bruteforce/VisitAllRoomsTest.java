package algorithm.bruteforce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VisitAllRoomsTest {

    @Test
    void testCanVisitAllRooms() {
        VisitAllRooms solution = new VisitAllRooms();
        int[][] rooms = { { 1, 3 }, { 2, 4 }, { 0 }, { 4 }, {}, { 3, 4 } };
        boolean result = solution.canVisitAllRooms(rooms);
        assertFalse(result);
    }

}
