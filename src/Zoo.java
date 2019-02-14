public class Zoo {

    public static void main(String[] args) {

        Tiger tigger = new Tiger("Tigger");

        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("cheese");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.eat("cheese");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("doritos");

        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");
        stinger.eat("chips");

        Animal[] animals = {tigger, pooh, rarity, gemma, stinger} ;

        Zookeeper zoebot = new Zookeeper("Zoebot");

        zoebot.feedAnimals(animals, "Marshmallows" );


    }


}
