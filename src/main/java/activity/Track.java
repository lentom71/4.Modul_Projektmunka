package activity;

import activity.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Track
{
    public List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints()
    {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint tpoint)
    {
        trackPoints.add(tpoint);
    }

    public Coordinate findMaximumCoordinate()
    {
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();

        for (TrackPoint trackPoint : trackPoints)
        {
            if (trackPoint.getCoordinate().getLongitude() > maxLongitude)
            {
                maxLongitude = trackPoint.getCoordinate().getLongitude();
            }
            if (trackPoint.getCoordinate().getLatitude() > maxLatitude)
            {
                maxLatitude = trackPoint.getCoordinate().getLatitude();
            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate()
    {
        double minLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        double minLatitude = trackPoints.get(0).getCoordinate().getLatitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLongitude() < minLongitude) {
                minLongitude = trackPoint.getCoordinate().getLongitude();
            }
            if (trackPoint.getCoordinate().getLatitude() < minLatitude) {
                minLatitude = trackPoint.getCoordinate().getLatitude();
            }
        }
        return new Coordinate(minLatitude, minLongitude);
    }

    public double getDistance()
    {
        return  0;
    }

    public double getFullDecrease()
    {
        double decreaseSum = 0;
        for (int i = 0; i < trackPoints.size()-1; i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i + 1).getElevation()) {
                decreaseSum += trackPoints.get(i).elevationDifference(trackPoints.get(i + 1));
            }
        }
        return decreaseSum;
    }

    public double getFullElevation()
    {
        double elevationSum = 0;
        for (int i = 0; i < trackPoints.size()-1; i++)
        {
            if(trackPoints.get(i).getElevation() < trackPoints.get(i+1).getElevation())
            {
                elevationSum += trackPoints.get(i).elevationDifference(trackPoints.get(i+1));
            }
        }
        return elevationSum;
    }

    public double getRectangleArea()
    {
        Coordinate min = findMinimumCoordinate();
        Coordinate max =  findMaximumCoordinate();

        return  max.getLatitude() - min.getLatitude() * max.getLongitude() - min.getLongitude();
    }
}
