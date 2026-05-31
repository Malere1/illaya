import java.util.ArrayList;

public class ReturnDuplicate {

public static void main(String[] args) {

int[] array = {1, 2, 3, 2, 4, 3};

ArrayList<Integer> duplicate = new ArrayList<>();

for (int count = 0; count < array.length; count++) {

int count = 0;

for (int counter = 0; counter < array.length; counter++) {

if (array[count] == array[counter]) {

count++;
}
}

if (count >= 2) {

duplicate.add(array[count]);
}
}

System.out.println(duplicate);
}
}
