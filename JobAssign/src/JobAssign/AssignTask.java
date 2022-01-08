package JobAssign;
import java.util.Scanner;

class AssignTask {
public static void main (String[] args) 
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Task Count to be alloted:");
   int taskNew = sc.nextInt();
   int split=0;
   int totalTasks = 0;
   int told = 0;
   System.out.println("Enter Number of Users:");
   int noOfUser = sc.nextInt();
   int[] user = new int[noOfUser];
   System.out.println("Enter each users already alloted count:");
   for(int i = 0; i < noOfUser; i++)
    {
        user[i] = sc.nextInt();
        told += user[i];
    }
   sc.close();
    totalTasks = told + taskNew;
    split = totalTasks / noOfUser;
    int[] arr = TaskScheduler.taskScheduler( split, noOfUser, taskNew, user);
    System.out.println("Counts after Job Assignment:");
    for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
}
}