package exception;

/**
 * 自定义异常
 * 通常当描述一个满足语法但是不满足业务情况的错误时我们会使用到自定义异常。
 * 自定义异常要做如下几件事:
 * 1:类名定义时要做到见名知意
 * 2:需要继承自Exception，直接或间接继承。
 * 3:提供Exception中提供的所有构造器
 *
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}









