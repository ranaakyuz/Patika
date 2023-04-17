import java.lang.reflect.Array;
import java.util.Arrays;

public class repeatnumber {
        static boolean isFind(int[] arr, int value) {
            for (int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) throws Exception {
            int[] list = {5,9,87,64,2,8,32,9,2,64};
            System.out.println("Dizi : " + Arrays.toString(list));
            int[] duplicate = new int [list.length];
            int startIndex = 0;

            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list.length; j++) {
                    if((i != j) && (list[i] == list[j])) {
                        if (list[i] % 2 == 0) {
                            if (!isFind(duplicate, list[i])) {
                                duplicate[startIndex++] = list[i];
                            }
                            break;
                        }
                    }
                }
            }
            for (int value : duplicate) {
                if (value != 0) {
                    System.out.println("Çift Sayı : " + value);
                }
            }

        }
    }

