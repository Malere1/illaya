import java.util.ArrayList;

public class EvenOdd {

public static void main(String[] args) {

int[] input = {45, 60, 3, 10, 9, 22};

ArrayList<Integer> even = new ArrayList<>();
ArrayList<Integer> odd = new ArrayList<>();

for (int count = 0; count <= input.length - 1; count++) {

if (input[count] % 2 == 0) {

even.add(input[count]);

} else {

odd.add(input[count]);
 }
}
System.out.println(odd + " " + even);
    }
}
