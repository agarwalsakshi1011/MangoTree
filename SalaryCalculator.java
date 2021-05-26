import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){
        int[] workingHours=new int[7] ;
        Scanner sc=new Scanner(System.in);
        long salary=0;
        int totalWorkingHours=0;
        for(int i=0;i<7;i++)
        {
            workingHours[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++)//calculate total working hours
        {
            totalWorkingHours+=workingHours[i];
        }
        for(int i=1;i<6;i++)//calculate salary for Mon-Fri
        {
            if(workingHours[i]<=8)
                salary+=workingHours[i]*100;
            else
                salary+=workingHours[i]*100+(workingHours[i]-8)*15;
        }
        if(totalWorkingHours>40)//calculate extra amount for working more than 40 hours
            salary+=25*(totalWorkingHours-40);
        if(workingHours[0]!=0)//Sunday's salary calculation
            salary+=(100*workingHours[0])*(1.25);
        if(workingHours[6]!=0)//Saturday's salary calculation
                salary+=(100*workingHours[6])*(1.15);
        System.out.println(salary);
    }
}
