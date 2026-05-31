import java.util.ArrayList;
public class Array {
public static ArrayList<ArrayList<Integer>>splitEven0dd(int[]array) {
Arraylist<integer>odd=new Arraylist<>();
Arraylist<integer>Even=new Arraylist<>();
for(int number:array) {
if (number%2==0) {
 Even.add(number);
 }else{
 Odd.add(number);
 }
 }
 ArrayList<ArrayList<Arraylist>>result=new ArrayList<>();
 result.add(Odd);
 result.add(Even);
 return result;
public static void main(String[]args) {
int[]input={45,60,3,10,9,22};
System.out.println(SplitEvenodd(input));
}
}

