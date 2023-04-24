public class transpoze {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3}, {4,5,6}};
        //int[][] transpoze = new int[3][3];

        System.out.println("Matris :");
        for(int[] row: matris){
            for(int column: row){
                System.out.print(column + "   ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        int column = matris[0].length;
        for(int i=0; i < column; i++){
            for(int j=0; j < matris.length; j++){
                System.out.print(matris[j][i] + "   ");
            }
            System.out.println();
        }
    }
}
