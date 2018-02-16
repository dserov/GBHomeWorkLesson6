/**
 * Class Dog
 * @author DSerov
 * @version dated 16 Feb, 2018
 */
public class Dog extends AnimalImpl {
    public Dog(int maxRunDistance) {
        this();
        this.maxRunDistance = maxRunDistance;
    }

    public Dog() {
        this.maxRunDistance = 500;
        this.maxJumpHeight = 0.5f;
        this.maxSwimDistance = 10;
    }
}
