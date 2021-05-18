
import java.util.Arrays;

public class Selectionsort {

    public static void main(String[] args) {

        long awal = System.currentTimeMillis();

        int data[] = {13, 20, 89, 51, 9, 70, 35, 2, 46, 63, 105, 21, 75, 1, 308, 277, 155, 8, 71, 88};
        int min = data[0];
        int index = 0;

        for (int j = 0; j < data.length - 1; j++) {
            for (int i = j; i < data.length; i++) {
                if (data[i] < min) {
                    min = data[i];
                    index = i;
                }
                System.out.println("Proses Swab ke-"+j+Arrays.toString(data));
            }
            if (min < data[j]) {
                data[index] = data[j];
                data[j] = min;

            }
            min = data[j + 1];
        }
        long akhir = System.currentTimeMillis();
        int waktu;
        waktu = (int) (akhir - awal);
        System.out.println("Execution time (akhir-awal) = ("+akhir+" - "+awal+") = " + waktu + " Milliseconds");
    }
}