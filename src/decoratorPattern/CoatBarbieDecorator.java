package decoratorPattern;

public class CoatBarbieDecorator extends BarbieDecorator {

    public CoatBarbieDecorator(Wardrobe decoratedWardrobe)
    {
        super(decoratedWardrobe);
    }

    @Override public void wear()
    {
        decoratedWardrobe.wear();
        setCoatDecorator();
    }

    private void setCoatDecorator()
    {
        System.out.println("Coat");
    }
}