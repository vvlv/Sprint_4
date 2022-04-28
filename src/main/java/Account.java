public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        String checkName = name; //переменная имени для работы с ней без изменения поступивших данных
        checkName.trim(); // убираем пробелы в начале и конце
        int spaceCount = 0; // по условию должно быть ИМЯ + ФАМИЛИЯ разделенные пробелом (три части имени будут отсекаться)
        for (char c : checkName.toCharArray()) { //подстчет пробелов в строке после удаления их в начале и конце
            if (c == ' ') {
                spaceCount++;
            }
        }
            boolean result; //переменная для возврата


            if (name.length() >= 3 && name.length() <= 19) {
                if (spaceCount == 1) {
                    result = true;
                } else {
                    result = false;
                }
            } else {
                result = false;
            }
            return result;
        }

    }
