package prototypePattern;

public abstract class Car implements Cloneable
{
    private String color;
    private String carName;

    public Car(String color, String carName) {
        this.color = color;
        this.carName = carName;
    }

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }

    public void printDetails(){
        System.out.println(carName + ", " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

}