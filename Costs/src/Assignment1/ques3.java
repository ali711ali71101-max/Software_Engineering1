package Assignment1;

public class ques3 {

    public int[] removeElement(int[] arr, int element) {
        int count = 0;
        for (int i : arr) {
            if (i != element) count++;
        }
        int[] result = new int[count];
        int j = 0;

        for (int i : arr) {
            if (i != element) {
                result[j++] = i;
            }
        }
        return result;
    }
}
