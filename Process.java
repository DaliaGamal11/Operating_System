/**
 * 
 */

/**
 * @author llllllllll
 *
 */
public class Process {


	public int burstTime,fixedBurstTime,processQuantum, arrivalTime, priority, processID, waitingTime, turnAroundTime, timeToComplete, completionTime=0;
	    public String processName;
	    public Process(int processID,int burstTime, int arrivalTime)
	    {
	    	this.burstTime=burstTime;
	    	this.arrivalTime=arrivalTime;
	    	this.processID = processID;
	    	this.timeToComplete=burstTime;
	    }
	public Process(int processID,int burstTime, int arrivalTime, int priority, int processQuantum)
	{
		this.burstTime=burstTime;
		this.arrivalTime=arrivalTime;
		this.processID = processID;
		this.timeToComplete=burstTime;
		this.priority = priority;
		this.processQuantum = processQuantum;
	}
}
