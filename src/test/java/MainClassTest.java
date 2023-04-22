import org.example.MainClass;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        int actual = getLocalNumber();
        Assert.assertEquals("Ошибка expected не равен actual", expected, actual);
        System.out.println("Метод getLocalNumber возвращает число 14 ");

    }
}
