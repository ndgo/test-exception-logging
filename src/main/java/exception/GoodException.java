package exception;

import lombok.ToString;

//@ToString(callSuper = true)
public class GoodException extends RuntimeException {

    private String info;

    public GoodException(String info) {
        super(info);
        this.info = info;
    }
}
