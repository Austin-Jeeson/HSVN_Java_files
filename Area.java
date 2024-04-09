import java.util.*;
class Perimeter
{double a,b;
    public Perimeter(double a2,double b2)
    {a=a2;b=b2;
    }
    public double Calculate()
    {double p = 2*(a+b);
     return p;
    }
    public void show()
    {double peri = Calculate();
     System.out.println("Length : "+a);
     System.out.println("Breadth : "+b);
     System.out.println("Perimeter : "+peri);
    }
}
public class Area extends Perimeter
{double h,area;
    public Area(double a1,double b1,double h1)
    {super(a1,b1);
     h=h1;area=0.0;
    }
    public void doarea()
    {area = b*h;
    }
    public void show()
    {super.show();
     System.out.println("Area : "+area);
    }
    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
     System.out.println("Enter length");
     double l = sc.nextDouble();
     System.out.println("Enter breadth");
     double b = sc.nextDouble();
     System.out.println("Enter height");
     double h= sc.nextDouble();
     Area are = new Area(l,b,h);
     are.doarea();
     are.show();
    }
}
