package tip;

/*Activity:
Represents an activity with a name and schedule.
Contains a constructor to initialize the activity's details and getters to access these details.
Overrides the toString() method to provide a string representation of an activity.*/
class Activity {
 private String name;
 private String schedule;

 public Activity(String name, String schedule) {
     this.name = name;
     this.schedule = schedule;
 }

 public String getName() {
     return name;
 }

 public String getSchedule() {
     return schedule;
 }

 @Override
 public String toString() {
     return "- " + name + " (" + schedule + ")";
 }
}



