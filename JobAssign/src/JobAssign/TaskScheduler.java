package JobAssign;
 
class TaskScheduler
{
   static int toBeAlloted;
   public static int[] taskScheduler(int split, int noOfUser, int taskNew, int[] user)
    {
    int i = 0;
    for( i = 0; i < noOfUser; i++)
       {
    	toBeAlloted = split-user[i];
            if (toBeAlloted > 0) {
                //When to be alloted is more than that to be assigned for the employee
                if( toBeAlloted > taskNew) {
                	toBeAlloted = taskNew;
                }
                user[i] = user[i] + toBeAlloted;
                taskNew = taskNew - toBeAlloted;
            } 
       }
        i = 0;
        while (taskNew > 0) {
           if(user[i] == split) {
               user[i]++;
               i++;
               taskNew--;
           }
       }
      return user;
    }
}