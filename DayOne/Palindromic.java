public class Palindromic {

public static void main(String[] args) {

int[] input = {45, 0, 8, 0, 45};

boolean check = true;

for (int count = 0; coun < input.length; count++) {

if (input[count] != input[input.length - 1 - count]) {

check = false;
}
 }

System.out.println(check);
}
}
