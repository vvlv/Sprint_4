import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"    ", false},    //просто пробелы
                {"", false},         //путой
                {"Тимоти Шаламе", true}, //Корректный
                {"Тимоти Шаламей ", false}, // лишний пробел в конце
                {" Тимоти Шаламей", false}, //Лишний пробел вначале
                {"Тимоти  Шаламей", false}, //двойной пробел в середине
        });
    }
    private String clientName;
    private boolean expected;

    public AccountTest(String  clientName, boolean expected) {
        this.clientName = clientName;
        this.expected = expected;
    }

    @Test
    public void accountEmbosTest() {
        Account account = new Account(clientName);
        boolean actual = account.checkNameToEmboss();
        assertEquals("Проверка валидности данных для карты",expected, actual);
    }

}
