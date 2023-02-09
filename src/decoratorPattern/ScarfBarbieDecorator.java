package decoratorPattern;

public class ScarfBarbieDecorator extends BarbieDecorator {

    public ScarfBarbieDecorator(Wardrobe decoratedWardrobe)
    {
        super(decoratedWardrobe);
    }

    @Override public void wear()
    {
        decoratedWardrobe.wear();
        setScarfDecorator();
    }

    private void setScarfDecorator()
    {
        System.out.println("Scarf");
    }
}