package maratonaJava.introducao;

public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMultidimensional = new int[3][3];
        arrayMultidimensional[0][0] = 1;
        arrayMultidimensional[0][1] = 2;
        arrayMultidimensional[0][2] = 3;
        arrayMultidimensional[1][0] = 4;
        arrayMultidimensional[1][1] = 5;
        arrayMultidimensional[1][2] = 6;
        arrayMultidimensional[2][0] = 7;
        arrayMultidimensional[2][1] = 8;
        arrayMultidimensional[2][2] = 9;
        
        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                System.out.print(arrayMultidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
}
