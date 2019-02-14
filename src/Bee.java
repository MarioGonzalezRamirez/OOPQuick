public class Bee extends Animal{

    public Bee(String name) {

        super(name, "leaves");

    }

    public void sleep() {
        System.out.println(this.name + " never sleeps");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);

        if (food == favoriteFood) {

            System.out.println("YUM!!! " + this.name + " wants more " + food);
            sleep();

        } else {

            System.out.println("YUCK!!!" + this.name + " will not eat " + food);
        }
    }


}
