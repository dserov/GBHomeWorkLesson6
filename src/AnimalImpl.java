/**
 * Class AnimalImpl
 * @author DSerov
 * @version dated 16 Feb, 2018
 * @link https://github.com/dserov/GBHomeWorkLesson6
 */
abstract public class AnimalImpl implements IAnimal{
    protected int maxRunDistance = 0;
    protected float maxJumpHeight = 0;
    protected int maxSwimDistance = 0;

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance)
            System.out.println(this.getClass().getName() + ".run(" + distance + ") -> false");
        else
            System.out.println(this.getClass().getName() + ".run(" + distance + ") -> " + distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance)
            System.out.println(this.getClass().getName() + ".swim(" + distance + ") -> false");
        else
            System.out.println(this.getClass().getName() + ".swim(" + distance + ") -> " + distance);
    }

    @Override
    public void jump(float height) {
        if (height > maxJumpHeight)
            System.out.println(this.getClass().getName() + ".jump(" + height + ") -> false");
        else
            System.out.println(this.getClass().getName() + ".jump(" + height + ") -> " + height);
    }
}
