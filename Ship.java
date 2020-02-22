public class Ship
{
    private enum ShipType {
                    CARRIER,
                    BATTLESHIP,
                    CRUISER,
                    SUBMARINE,
                    DESTROYER
                }
    private enum ShipStatus {
                    OPERATIONAL,
                    DESTROYED
                }
    ShipType myShipType;
    ShipStatus myStipStatus;
    private Square location;
    private int shipSize;

    public Ship(ShipType myShipType, Square location, ShipStatus myShipStatus)
    {
        this.myShipType = myShipType;
        this.location = location;
        this.myStipStatus = myShipStatus;

        switch(myShipType)
        {
            case CARRIER:
                this.shipSize = 5;
                break;
            case BATTLESHIP:
                this.shipSize = 4;
                break;
            case CRUISER:
                this.shipSize = 3;
                break;
            case SUBMARINE:
                this.shipSize = 3;
                break;
            case DESTROYER:
                this.shipSize = 2;
                break;
            default:
                System.out.println("Invalid input!");

        } // end switch

    } // end constructor

    public void setShipSize(int size)
    {
        
        this.shipSize = size; // or maybe i should set this to 'this.shipSize - 1'

    } // end getShipSize()

    public int getShipSize()
    {
        return this.shipSize;

    } // end setShipSize()

} // end class Ship