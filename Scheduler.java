import java.util.Scanner;

public class Scheduler{
static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the number of processes");
		int n = s.nextInt();
		Process[] myProcess = new Process[n];
		System.out.println("Enter the context switching value");
		int contextSwitching = s.nextInt();
		for (int i=0; i<n; i++)
		{
			System.out.println("Enter Arrival Time, Burst Time");
			int arrivalTime = s.nextInt();
			int burstTime = s.nextInt();
			myProcess[i] = new Process(i+1,burstTime, arrivalTime);
		}
		
		System.out.println("Select the algorithm you'd like to use");
		System.out.println("1. Preemptive SJF");
		System.out.println("2. Round Robin with Context Switching");
		System.out.println("3. Preemptive Priority");
		System.out.println("4. Customized AG Schedule");
		System.out.println("5. Exit");
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:
			s.close();
			System.exit(1);
			break;
		default:
			System.out.println("Incorrect Choice");
			break;
			}
	}




}
