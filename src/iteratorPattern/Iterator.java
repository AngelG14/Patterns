package iteratorPattern;

interface Iterator
{
    boolean hasNext();
    boolean hasPrevious();

    // returns the next element
    Object next();
    Object previous();
}
