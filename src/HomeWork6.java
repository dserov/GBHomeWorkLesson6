/**
 * HomeWork Lesson 6
 *
 * @author DSerov
 * @version dated 16 Feb, 2018
 * @link https://github.com/dserov/GBHomeWorkLesson6
 */
public class HomeWork6 {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Cat(),
                new Dog(), // обычная собака
                new Dog(400), // собака с пониженной социальной выносливостью
                new Dog(600) // собака с повышенной выносливостью
        };

        for (IAnimal animal : animals) {
            animal.jump(0.4f);
            animal.jump(2);
            animal.jump(3);
            animal.swim(1);
            animal.swim(5);
            animal.swim(15);
            animal.run(100);
            animal.run(300);
            animal.run(500);
            animal.run(1000);
        }
    }
}
