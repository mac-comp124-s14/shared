package edu.macalester.comp124.section1.lists;

/**
 * @author Shilad Sen
 */
public class Dog implements Comparable<Dog> {
    private final String name;
    private final int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Dog that) {
        return this.weight - that.weight;
        /*if (this.weight > that.weight) {
            return 1;
        } else if (this.weight < that.weight) {
            return -1;
        } else {
            return 0;
        }*/
    }
}
