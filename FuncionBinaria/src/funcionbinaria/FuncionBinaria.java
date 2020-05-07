package funcionbinaria;

import java.util.Random;
/**
 * @author davisalex22
 */
public class FuncionBinaria {

    static int size = 10000000;

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[size];
        llenaVector(vector);
        funcionBinaria(vector);
    }

    public static int[] llenaVector(int[] vector) {
        System.out.println("LLenando vector....");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(100);
        }
        return vector;
    }

    public static void funcionBinaria(int[] vector) {
        for (int i = 0; i < size; i++) {
            int index = -1;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == 80) {
                    index = j;
                }
                break;
            }
        }
    }
}
