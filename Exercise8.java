package Assignment4;

public class Exercise8 {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 20, 5};

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }

            }

        }
    
        System.out.println("Largest " + numbers[0]);

    }

}
