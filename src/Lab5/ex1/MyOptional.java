package Lab5.ex1;
import java.util.NoSuchElementException;

public class MyOptional<T> {
    private final T opt;

    private MyOptional(T opt) {
        this.opt = opt;
    }

    public static <T> MyOptional<T> of(T opt) {
        return new MyOptional<>(opt);
    }

    public boolean isPresent() {
        return opt != null;
    }

    public T get() {
        if (!isPresent()) {
            throw new NoSuchElementException("No value present");
        }
        return opt;
    }
}