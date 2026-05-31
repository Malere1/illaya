import java.util.ArrayList;

public class perfectSquare {

public static void main(String[] args) {

int[] input = {4, 7, 9, 10, 16, 18};

ArrayList<Integer> answer = new ArrayList<>();

for (int count = 0; count < input.length; count++) {

int root = (int)Math.sqrt(input[count]);

if (root * root == input[count]) {
answer.add(input[count]);
 }
}

System.out.println(answer);
    }
}
