import java.util.ArrayList;

public class Square
{
    private ArrayList<ArrayList<String>> square = new ArrayList<ArrayList<String>>();
    private int length; // not necessary
    private int width; // not necessary

    public Square(int length, int width)
    {
        this.length = length;
        this.width = width;

        for(int row = 0; row < length; row++)
        {
            for(int column = 0; column < width; column++)
            {
                square.get(row).add(" - ");
            }
        }
    }


    public ArrayList<ArrayList<String>> getSquare()
    {
        return this.square;
    }
}