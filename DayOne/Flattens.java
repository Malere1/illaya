import java.util.ArrayList;

public class Flattens {

public static void main(String[] args) {

int[][] array = {
  {9, 0, 7},
  {3, 5, 1},
  {8, 1, 7},
  {9, 9, 6}
};
ArrayList<Integer> newArray = new ArrayList<>();

for (int count = 0; count < array.length; count++) {

for (int game = 0; < array[game].length; game++) {

newArray.add(array[count][game]);
}
}
System.out.println(newArray);
};
