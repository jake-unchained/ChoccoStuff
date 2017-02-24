import java.io.IOException;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.variables.IntVar;

public class Meetings113380396 {
  public static void main(String[] args)  throws IOException {

    // Create a Model
    Model model = new Model("Meeting Scheduler");

    //Create a data object
    MeetingProblemReader data = new MeetingProblemReader("data//meetings0.txt");
    
    int num_people = data.getNumPeople();
	int num_meetings = data.getNumMeetings();
	int max_days = data.getmaxDays();
	int max_projectors = data.getMaxProjectors();
	int[] durations = data.getDurations();
	int[][] meeting_people = data.getMeetingPeople();
	int[] earliest_start = data.getEarliestStart();
	
	IntVar[][] meeting_on_day = new IntVar[max_days][num_meetings];
    for (int i = 0; i < max_days; i++){
      for (int j = 0; j < num_meetings; j++){
        meeting_on_day[i][j] = model.intVar("Meeting " + j + " on day " + i + ".", 0, 1);
      }
	}
    
    

    
    /*
    // Solve the problem
	Solver solver = model.getSolver();
	int numsoloution = 1;
	while (solver.solve()) { 
		// Print the solution
		System.out.println("Solution "+numsoloution + ";");
		for (int employee = 0; employee < employees_on_project.length; employee++) {
			 System.out.println(employees_on_project[employee]);
		}
		System.out.println();
	 	numsoloution++;
	}
	*/  
  }
}
