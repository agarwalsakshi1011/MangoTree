import java.util.Scanner;

public class MangoTree {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int row,column,treeNumber;
        row=sc.nextInt();
        column=sc.nextInt();
        treeNumber= sc.nextInt();
        if((treeNumber<=0)||treeNumber>(row*column))
            System.out.println("Invalid Tree Number");
        else if ((treeNumber%column)==0||(treeNumber%column==1)||(treeNumber>0&&treeNumber<=column))
            System.out.println("It is a Mango Tree");
        else
            System.out.println("Not a mango Tree");
    }
}
