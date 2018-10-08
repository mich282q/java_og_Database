/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++){
            if (objects[i] instanceof  Edible)
                System.out.println(((Edible)objects[i]));

            if (objects[i] instanceof Animal){
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}

abstract class Animal{
    public abstract String sound();
    public abstract String howToEat();

}

class Chicken extends Animal {
    @Override
    public String howToEat(){
        return "Chicken: Fri it";
    }
    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
    public String howToEat(){
        return "Namnam";
    }
}

abstract class Fruit {
// Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {

    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
