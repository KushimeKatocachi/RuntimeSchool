package Project;

import java.util.ArrayList;
import java.util.Date;

public class Basics {
    private String fullname;
    private String post;
    private ArrayList<Activity> activities;

    public Basics(String fullname, String post) {
        this.fullname = fullname;
        this.post = post;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public static void main(String[] args) {
        Basics basics = new Basics("Tashen Erkanat Oryntaiuly", "waiter");
        Basics basics1 = new Basics("Arman Abden Kaleluly", "shef");

        Activity activity1 = new Activity(new Date(11/11), new Date(11/55), "rr");
        Activity activity2 = new Activity(new Date(22/22), new Date(11/11), "rr");

        basics1.addActivity(activity1);
        basics1.addActivity(activity2);

        System.out.println(basics.getFullname() + " activities:");
        for (Activity activity : basics1.getActivities()) {
            System.out.println(activity);
        }

        System.out.println(basics1.getFullname() + " activities:");
        for (Activity activity : basics1.getActivities()) {
            System.out.println(activity);
        }
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
}

class Activity {
    private Date date;
    private Date startTime;
    private Date endTime;
    private String task;

    public Activity( Date startTime, Date endTime, String task) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.task = task;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String toString() {
        return date + " | " + startTime + " - " + endTime + " | " + task;
    }
}
