package maratonaJava.introducao;

public class Aula07ArraysMutidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayMultidimensional =  new int[3][];
        arrayMultidimensional[0] = new int[2];
        arrayMultidimensional[1] = new int[3];
        arrayMultidimensional[2] = new int[4];

        for (int i = 0; i < arrayMultidimensional.length; i++) {
            System.out.print(String.format("Array %d: ", i));
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                arrayMultidimensional[i][j] = j;
                System.out.print(arrayMultidimensional[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
