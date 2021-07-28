package array;

/**
 * <pre>
 * 稀疏矩陣
 * </pre>
 * 
 * @since 2021年7月28日
 * @author 2102001
 * @version
 *          <ul>
 *          <li>2021年7月28日,2102001,new
 *          </ul>
 */
public class SparseMatrix {

    public static void main(String[] args) {

        // 1.原始矩陣匯入值
        System.out.println("array1");
        int[][] array1 = new int[6][7];
        array1[0][3] = 22;
        array1[0][6] = 15;
        array1[1][1] = 11;
        array1[1][5] = 17;
        array1[2][3] = -6;
        array1[3][5] = 39;
        array1[4][0] = 91;
        array1[5][2] = 28;

        // 印出原始矩陣
        // for (int[] is : array1) {
        for (int i = 0; i < array1.length; i++) {
            int[] is = array1[i];
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println("");
        }
        System.out.println("=====================================================");

        // 計算稀疏矩陣行數
        System.out.println("array2");
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                }
            }
        }
        // 2.new稀疏矩陣，並賦予第一列值
        int[][] array2 = new int[count + 1][3];
        array2[0][0] = array1.length;
        array2[0][1] = array1[0].length;
        array2[0][2] = count;

        // 賦予稀疏矩陣值
        int k = 1;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    array2[k][0] = i;
                    array2[k][1] = j;
                    array2[k][2] = array1[i][j];
                    k++;
                }
            }
        }

        // 印出稀疏矩陣
        for (int[] is : array2) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println("");
        }
        System.out.println("=====================================================");

        // 3.稀疏矩陣轉原始矩陣賦值
        System.out.println("array3");
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        // 印出稀疏矩陣
        for (int[] is : array3) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println("");
        }
    }
}
