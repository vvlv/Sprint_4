public class Account {

    private final String name;
    private String checkedName;

    public Account(String name) {
        this.name = name;
    }


    public boolean nameStartsEndsCheck() {
        if (checkedName.startsWith(" ") | checkedName.endsWith(" ")) {
            return false;
        } else {
            return true;
        }
    }

    public int nameToEmbossSpaceCheck() {
        int spaceCount = 0; // по условию должно быть ИМЯ + ФАМИЛИЯ разделенные пробелом (три части имени будут отсекаться)
        for (char c : checkedName.toCharArray()) { //подстчет пробелов в строке после удаления их в начале и конце
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public boolean nameToEmbossLengthCheck() {
        if (checkedName.length() >= 3 && checkedName.length() <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nameToEmbossSpaceCheckInName() {
        if (nameToEmbossSpaceCheck() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nameToEmbossNameNullCheck() {
        if (checkedName != null) {
            return true;
        } else {
            return false;
        }
    }


    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        checkedName = name;
        if (nameToEmbossNameNullCheck() && nameStartsEndsCheck() && nameToEmbossSpaceCheckInName() && nameToEmbossLengthCheck()) {
            return true;
        } else {
            return false;
        }


    }

}
