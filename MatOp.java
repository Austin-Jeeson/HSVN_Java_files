import java.util.*;
public class MatOp
{int A[][];
 int n_b[];
 int M;
    public MatOp(int or)
    {A = new int[or][or];
     M=or;
    }
    public void accept()
    {Scanner sc = new Scanner(System.in);
      System.out.println("Enter matrix");
      for(int i=0;i<M;i++)
      {for(int j=0;j<M;j++)
       A[i][j] = sc.nextInt();
      }
    }
    public void generate()
    {for(int i=0;i<M;i++)
      {for(int j=0;j<M;j++)
       A[i][j] = (int)(Math.random()*100);
      }
    }
    public void calDiagonals()
    {int dia1[] = new int[M];
     int dia2[] = new int[M];
     for(int i=0,c=0;i<M;i++,c++)
     {dia1[c] = A[i][i];
     }
     for(int i=0,c=0,j=(M-1);i<M;i++,j--,c++)
     {dia2[c] = A[i][j];
     }
     int sum=0;
     for(int i=0;i<M;i++)
     if(dia1[i] == dia2[i])
     sum+=dia1[i];
     else
     sum+=dia1[i]+dia2[i];
      System.out.println("\nDiagonal numbers : ");
     for(int i=0;i<M;i++) System.out.print(dia1[i]+" ");
     System.out.println();
     for(int i=0;i<M;i++) System.out.print(dia2[i]+" ");
     System.out.println();
     System.out.println("\nSum of diagonals : "+sum);
    }
    public void NotBoundary()
    {int ctr = 0;
      for(int i=0;i<M;i++)
      {for(int j=0;j<M;j++)
       if(i!=0 && i!=(M-1) && j!=0 && j!=(M-1))ctr++;
      }
      n_b = new int[ctr];
      for(int i=0,c=0;i<M;i++)
      {for(int j=0;j<M;j++)
       if(i!=0 && i!=(M-1) && j!=0 && j!=(M-1))
       {n_b[c] = A[i][j];
        c++;
        }
      }
    }
    public void sort(int[] B)
    {int temp;boolean flag = true;
     while(flag)
     {flag = false;
      for(int j=0;j<B.length-1;j++)
      {if(B[j] > B[j+1])
       {temp = B[j];
        B[j] = B[j+1];
        B[j+1] = temp;
        flag = true;
       }
      }
     }
    }
    public void rearrange()
    { NotBoundary();
      sort(n_b);
      for(int i=0,c=0;i<M;i++)
      {for(int j=0;j<M;j++)
       if(i!=0 && i!=(M-1) && j!=0 && j!=(M-1))
       {A[i][j]=n_b[c];
        c++;
        }
      }
    }
    public void display()
    {for(int i=0;i<M;i++)
      {for(int j=0;j<M;j++)
       System.out.print(A[i][j]+" ");
       System.out.println();
      }
    }
    public static void main(String args[])
    {Scanner sc = new Scanner (System.in);
     System.out.println("Enter size");
     int siz = sc.nextInt();
     if(siz >3 && siz<10)
     {MatOp m = new MatOp(siz);
      //m.accept();
      m.generate();
     System.out.println("\nOriginal matrix : ");
     m.display();
     System.out.println("\nRearranged matrix : ");
     m.rearrange();
     m.display();
     m.calDiagonals();
     }
     else System.out.println("Size out of range");
    }
}
