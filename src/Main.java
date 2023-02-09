import decoratorPattern.Barbie;
import decoratorPattern.CoatBarbieDecorator;
import decoratorPattern.ScarfBarbieDecorator;
import decoratorPattern.Wardrobe;
import iteratorPattern.Playlist;
import iteratorPattern.Reproductor;
import prototypePattern.Car;
import prototypePattern.CarStore;
import prototypePattern.RaminatorCar;
import prototypePattern.TwizyCar;

public class Main {
    public static void main(String args[]){
        new Main();
    }
    public Main(){
        System.out.println("\nPatron Iterator");
        iteratorProblem();
        System.out.println("\nPatron Decorator");
        decoratorProblem();
        System.out.println("\nPatron Prototype");
        prototypeProblem();
    }
    public void iteratorProblem(){
        Playlist playlist = new Playlist();
        playlist.addItem("La opera del mondongo");
        playlist.addItem("And It Was Night - Lord Of The Lost");
        playlist.addItem("La triste historia de Jimmy tiro en el pie");
        Reproductor reproductor = new Reproductor(playlist);
        reproductor.playSongs();
        reproductor.playSongsReverseOrder();
    }
    public void decoratorProblem(){
        Wardrobe barbie = new Barbie();
        Wardrobe scarfBarbie
                = new ScarfBarbieDecorator(new Barbie());
        Wardrobe coatBarbie
                = new CoatBarbieDecorator(new Barbie());
        Wardrobe scBarbie
                = new ScarfBarbieDecorator(new CoatBarbieDecorator(new Barbie()));
        System.out.println("\nBarbie");
        barbie.wear();
        System.out.println("\nBarbie with coat");
        coatBarbie.wear();
        System.out.println("\nBarbie with scarf");
        scarfBarbie.wear();
        System.out.println("\nBarbie with coat and scarf");
        scBarbie.wear();
    }

    public void prototypeProblem(){

        TwizyCar twizyBlue = new TwizyCar("blue");
        TwizyCar twizyRed = new TwizyCar("red");
        RaminatorCar raminatorBlack = new RaminatorCar("black");
        RaminatorCar raminatorYellow = new RaminatorCar("yellow");

        CarStore store = new CarStore();

        store.addCar( (Car) twizyBlue.clone());
        store.addCar( (Car) twizyRed.clone());
        store.addCar( (Car) twizyBlue.clone());
        store.addCar( (Car) raminatorYellow.clone());
        store.addCar( (Car) raminatorBlack.clone());
        store.addCar( (Car) twizyBlue.clone());

        store.printCars();

    }

}