package activity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityWithoutTrackTest
{
    ActivityWithoutTrack activityWithoutTrack = new ActivityWithoutTrack(ActivityType.BASKETBALL);

    @Test
    void getDistance()
    {
        assertEquals(0.0, activityWithoutTrack.getDistance());
    }

    @Test
    void getType()
    {
        assertEquals(ActivityType.BASKETBALL, activityWithoutTrack.getType());
    }
}