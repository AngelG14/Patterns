package decoratorPattern;

public abstract class BarbieDecorator implements Wardrobe {

    protected Wardrobe decoratedWardrobe;

    public BarbieDecorator(Wardrobe decoratedWardrobe)
    {
        this.decoratedWardrobe = decoratedWardrobe;
    }
    public void wear() {
        decoratedWardrobe.wear();
    }
}