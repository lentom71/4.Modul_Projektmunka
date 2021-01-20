package activity;

import activity.Activity;
import activity.ActivityType;

public class ActivityWithoutTrack implements Activity
{
    private ActivityType activityType;

    public ActivityWithoutTrack(ActivityType activityType)
    {
        this.activityType = activityType;
    }

    public double getDistance()
    {
        return 0;
    }

    public ActivityType getType()
    {
        return activityType;
    }
}
