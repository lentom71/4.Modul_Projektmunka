package activity;

public class TrackPoint
{
    public Coordinate coordinate;
    public  double elevation;

    public TrackPoint(Coordinate coordinate, double elevation)
    {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate()
    {
        return coordinate;
    }

    public double getElevation()
    {
        return elevation;
    }

    public double  getDistanceFrom(TrackPoint trackpoint)
    {
        return  0;
    }

    public double elevationDifference(TrackPoint anotherTrackPoint)
    {
        return Math.abs(anotherTrackPoint.elevation - elevation);

    }


}
