import java.util.*;
class Record
{String n[];int m[];int size;
public Record(int cap) {size = cap;}
public void readarray() {
Scanner sc = new Scanner(System.in);
for(int i=0;i<size;i++)
{
System.out.println("Enter name and mark of the student : ");
n[i] = sc.nextLine();
m[i] = sc.nextInt();
}
}
public void display() {
for(int i=0;i<size;i++)
{System.out.println("Student : "+n[i]);
System.out.println("Marks : "+m[i]);
}
}
}
public class Highest extends Record {
private int ind;
public Highest(int cap) {super(cap);}
public void find() {
ind = 0;
for (int i = 0; i < size; i++) 
 if(m[i]>m[ind])ind = i;
}
public void display() {
super.display();
find();
System.out.println("Highest marks are::" +m[ind]);
System.out.println("Students who score the highest marks are::");
for (int i = 0; i < size; i++)
if(m[i] == m[ind])System.out.println(n[i]);
}
}