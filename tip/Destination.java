package tip;

import java.util.ArrayList;
import java.util.List;

/*Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.*/
class Destination {
	 private String name;
	 private List<Activity> activities;

	 public Destination(String name) {
	     this.name = name;
	     this.activities = new ArrayList<>();
	 }

	 public void addActivity(Activity activity) {
	     activities.add(activity);
	 }

	 public List<Activity> getActivities() {
	     return activities;
	 }

	 @Override
	 public String toString() {
	     StringBuilder sb = new StringBuilder("Destination: " + name + "\n");
	     for (Activity activity : activities) {
	         sb.append(activity.toString()).append("\n");
	     }
	     return sb.toString();
	 }
	}

