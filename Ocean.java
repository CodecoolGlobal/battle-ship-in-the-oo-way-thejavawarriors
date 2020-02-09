import java.util.ArrayList;

import jdk.nashorn.api.tree.WithTree;

public class Ocean
{
    private int length;
    private int width;

    public Ocean(int length, int width)
    {

        this.length = length;
        this.width = width;
    }

    public void displayOcean()
    {
        Square board = new Square();
        ArrayList<ArrayList<String>> myBoard = board.getSquare();
        ArrayList<String> boardWidth = new ArrayList<String>(width);
        for(int i = 0; i < length; i++)
        {
            myBoard.add(boardWidth);
        }

        for(int i = 0; i < this.length; i++)
        {
            for(int j = 0; j < this.width; j++)
            {
                myBoard.get(i).add("[ ]");
            }
        }

        for(int i = 0; i < this.length; i++)
        {
            for(int j = 0; j < this.width; j++)
            {
                System.out.print(myBoard.get(i).get(j));
            }
            System.out.println();
        }
    }
} // end class Ocean