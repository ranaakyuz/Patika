public class harmonikortalama {
    public static void main(String[] args) {
        int[] numberList ={1,2};
        double sum = 0.0;
        for (double eleman : numberList) {
            sum += 1 / eleman;
        }
        System.out.println(numberList.length / sum);
    }
}
