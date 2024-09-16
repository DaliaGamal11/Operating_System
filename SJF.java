public class SJF {
    static void SJF(Process myProcess[], int contextSwitching) {
        int currentTimeInterval = 0, completedProcesses = 0;
        Process curProcess;
        curProcess = myProcess[0];
        while(completedProcesses < myProcess.length)
        {
            for(int i=0; i<myProcess.length; i++)
            {
                if(myProcess[i].timeToComplete > 0) {
                    curProcess = myProcess[i];
                    break;
                }
            }
            System.out.println("Current Time Interval = " + currentTimeInterval);
            System.out.println("No of Process Completed = " + completedProcesses);

            for(int i=0; i<myProcess.length; i++)
            {
                if(myProcess[i].arrivalTime > currentTimeInterval || myProcess[i].timeToComplete ==0 )
                    continue;
                if(myProcess[i].timeToComplete < curProcess.timeToComplete)
                    curProcess = myProcess[i];
            }

            //Reducing time by 1 [PROGRESSING]
            curProcess.timeToComplete -= 1;
            //Increasing completed process if time = 0
            if(curProcess.timeToComplete ==0)
            {
                completedProcesses++;
                //Completion time of current process = currentTimeInterval +1 + context switching
                curProcess.completionTime = currentTimeInterval + 1 + contextSwitching;
            }
            currentTimeInterval = currentTimeInterval + 1 + contextSwitching;

        }
        double AverageWaitingTime=0;
        double AverageTurnAroundTime=0;
        for(int i=0; i<myProcess.length; i++)
        {
            //Calculating waitingTime, = completion time - arrival - burst
            myProcess[i].waitingTime= myProcess[i].completionTime - myProcess[i].arrivalTime - myProcess[i].burstTime;
            AverageWaitingTime += myProcess[i].waitingTime;
            //Calculating turnAroundTime, waitingtime + burst
            myProcess[i].turnAroundTime = myProcess[i].waitingTime + myProcess[i].burstTime;
            AverageTurnAroundTime += myProcess[i].turnAroundTime;
            System.out.println("Process " + myProcess[i].processID + ":");
            System.out.println("turnAroundTime\tCompletion\twaitingTime");
            System.out.println(myProcess[i].turnAroundTime + "\t\t\t" + myProcess[i].completionTime + "\t\t\t" + myProcess[i].waitingTime);
        }
        System.out.println(AverageWaitingTime/myProcess.length);
        System.out.println(AverageTurnAroundTime/myProcess.length);





    }
}
