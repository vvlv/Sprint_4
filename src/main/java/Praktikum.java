public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String clientName = "";
        Account account = new Account(clientName);
        account.checkNameToEmboss();
    }

}

/*
    В классе Praktikum тебе нужно создать переменную со строкой, которая содержит имя и фамилию. После — создать экземпляр класса Account.
        Чтобы задать условие для проверки, вызови метод checkNameToEmboss().
        В классе Account задай проверки: длина, наличие пробела в начале или конце строки. Используй методы класса String.
        Например, для проверки длины — name.length() >= 3.
*/
