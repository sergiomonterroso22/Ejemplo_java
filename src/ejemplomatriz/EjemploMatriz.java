
package ejemplomatriz;

public class EjemploMatriz {

   
    public static void main(String[] args) {
        // TODO code application logic here        
        String[][] autos  = new String[3][2];
        autos[0][0] = "Toyota";
        autos[0][1] = "Honda";
        
        autos[1][0] = "Nissan";
        autos[1][1] = "Acura";
        
        autos[2][0] = "Subaru";
        autos[2][1] = "Suzuki";
        
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print(autos[i][j]+" ");
            }
        }
        System.out.println();
        
        int[][] edad = {
            {1,3,4,6,8},
            {1,5,22,3,3},
            {88,9,66,3,14},
            {12,45,63,98,55},
            {33,11,88,77,51}};
        
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(edad[i][j]+" ");
            }
        }
        System.out.println();

    }
    
}
