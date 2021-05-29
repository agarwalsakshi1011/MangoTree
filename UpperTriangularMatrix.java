import java.util.Scanner;

public class UpperTriangularMatrix {
    public static int checkUpperTriangularMatrix(int row,int column,int matrix[][])
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(i>j)
                {
                    if(matrix[i][j]!=0)
                        return 0;
                }
            }
        }
        return 1;
    }
    public  static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column=sc.nextInt();
        if(row!=column)
            System.out.println("Not a Square Matrix");
        else {
            int[][] matrix = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            if(checkUpperTriangularMatrix(row,column,matrix)==1)

                System.out.println("yes");
            else
                System.out.println("no");

        }

    }
}
