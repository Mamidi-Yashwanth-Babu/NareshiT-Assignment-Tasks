package tip;

import java.util.ArrayList;
import java.util.List;

/*ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.*/
class ItineraryPlanner {
	 private List<Destination> destinations;

	 public ItineraryPlanner() {
	     this.destinations = new ArrayList<>();
	 }

	 public void addDestination(Destination destination) {
	     destinations.add(destination);
	 }

	 public List<Destination> getDestinations() {
	     return destinations;
	 }
	}