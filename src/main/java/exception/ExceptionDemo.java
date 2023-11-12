package exception;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            validateNumber(10);
            validateNumber(50); // вызов метода, который бросает исключение
        } catch (CustomException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomException {
        if (number > 20) {
            throw new CustomException("Число больше 20");
        } else {
            System.out.println("Число прошло валидацию: " + number);
        }
    }
}


