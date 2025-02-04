package tip;

/*TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.
*/
public class TravelItineraryPlanner {
	 public static void main(String[] args) {
	     ItineraryPlanner planner = new ItineraryPlanner();

	     // Creating destinations
	     Destination paris = new Destination("Paris");
	     Destination london = new Destination("London");

	     // Adding activities to Paris
	     paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
	     paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

	     // Adding activities to London
	     london.addActivity(new Activity("British Museum", "Morning"));
	     london.addActivity(new Activity("London Eye", "Afternoon"));

	     // Adding destinations to itinerary planner
	     planner.addDestination(paris);
	     planner.addDestination(london);

	     // Displaying itinerary
	     for (Destination destination : planner.getDestinations()) {
	         System.out.println(destination);
	     }
	 }
}