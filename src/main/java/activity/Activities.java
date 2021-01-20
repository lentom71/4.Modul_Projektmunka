package activity;


import java.util.ArrayList;
import java.util.List;

public class Activities
{
    public List<Activity> activities ;

    public Activities(List<Activity> activities)
    {
        this.activities = activities;
    }

    public void addActivity(Activity act)
    {
        activities.add(act);
    }

    public List<Report> distancesByTypes()
    {
        double[] sum  = new double[ActivityType.values().length];
        for (Activity activity: activities)
        {
            sum[activity.getType().ordinal()] += activity.getDistance();
        }

        List<Report> lista = new ArrayList<>();
        for (Activity  activity: activities)
        {
            lista.add(new Report(activity.getType(), sum[activity.getType().ordinal()]));
        }
        return  lista;
    }

    public int numberOfTrackActivities()
    {
        int sum = 0;
        for (Activity act : activities)
        {
            if(act.getDistance() > 0)
            {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities()
    {
        int sum = 0;
        for (Activity act : activities)
        {
            if(act.getDistance() == 0)
            {
                sum++;
            }
        }
        return sum;
    }
}
