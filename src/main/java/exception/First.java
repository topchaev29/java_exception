package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Обращение к null!");
        }

        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива!");
        }

        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами строки!");
        }

        System.out.println("Ура! Меня снова печатают");
    }


    public static void divideByZero() {
        try {
            int a = 777 / (666 - 666);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
    }

    public static void accessToUnexistingElement(){
        try {
            int[] arr = {1,2,3,4,5,6,7};
            for (int i = 0; i < arr.length+1; i++) {
                System.out.printf("%d,", i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
        }
    }

    public static void playWithNullPointer() {
        try {
            String importantData = null;
            System.out.println("important is " + importantData);
        } catch (NullPointerException e) {
            System.out.println("Обращение к null!");
        }
    }

    public static void tryToCreateFunnyArray() {
        try {
            int i[] = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива!");
        }
    }

    public static void searchSomethingOutString() {
        try {
            String secret = "Пин-код от карты: 123";
            secret.charAt(22);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами строки!");
        }
    }
}
