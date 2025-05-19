import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    // Every Statement критериум
    @Test
    void testEveryStatement() {
        // Тест 1: allItems е null
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "1234567890123456"));

        // Тест 2: Листата е празна
        assertEquals(0, SILab2.checkCart(new ArrayList<>(), "1234567890123456"));

        // Тест 3: Item со name=null
        List<Item> itemsWithNullName = List.of(new Item(null, 1, 100, 0.1));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemsWithNullName, "1234567890123456"));

        // Тест 4: price > 300
        List<Item> itemsWithHighPrice = List.of(new Item("item1", 5, 350, 0));
        assertEquals(1720, SILab2.checkCart(itemsWithHighPrice, "1234567890123456"));

        // Тест 5: discount > 0
        List<Item> itemsWithDiscount = List.of(new Item("item1", 2, 100, 0.1));
        assertEquals(150, SILab2.checkCart(itemsWithDiscount, "1234567890123456"));

        // Тест 6: quantity > 10
        List<Item> itemsWithHighQuantity = List.of(new Item("item1", 15, 100, 0));
        assertEquals(1470, SILab2.checkCart(itemsWithHighQuantity, "1234567890123456"));

        // Тест 7: Невалидна карта (должина != 16)
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("item1", 1, 100, 0)), "123"));
    }

    // Multiple Condition критериум
    @Test
    void testMultipleCondition() {
        // Тест 1: price > 300 (T), discount=0 (F), quantity=5 (F)
        List<Item> items1 = List.of(new Item("item1", 5, 350, 0));
        assertEquals(1720, SILab2.checkCart(items1, "1234567890123456"));

        // Тест 2: price=200 (F), discount=0.1 (T), quantity=5 (F)
        List<Item> items2 = List.of(new Item("item1", 5, 200, 0.1));
        assertEquals(870, SILab2.checkCart(items2, "1234567890123456"));

        // Тест 3: price=200 (F), discount=0 (F), quantity=15 (T)
        List<Item> items3 = List.of(new Item("item1", 15, 200, 0));
        assertEquals(2970, SILab2.checkCart(items3, "1234567890123456"));

        // Тест 4: price=200 (F), discount=0 (F), quantity=5 (F)
        List<Item> items4 = List.of(new Item("item1", 5, 200, 0));
        assertEquals(1000, SILab2.checkCart(items4, "1234567890123456"));
    }
}