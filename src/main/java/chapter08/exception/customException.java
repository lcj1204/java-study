package chapter08.exception;

public class customException extends RuntimeException{

    private final int ERR_CODE; // 생성자를 통해 초기화 한다.
    public customException(String message, int errCode) {
        super(message);
        ERR_CODE = errCode;
    }

    public customException(String message) {
        this(message, 100);
    }

    public int getERR_CODE(){
        return ERR_CODE;
    }
}
