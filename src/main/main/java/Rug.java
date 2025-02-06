public class Rug {
    public static void main (String args[]){
        print2DArray(solid());
   }

        
    public static String[][] solid(){
         String[][] array = new String[11][11];
         for (int row = 0; row < array.length; row++) {
             for (int col = 0; col < array[row].length; col++) {
                 array[row][col] = "x";
             }
         }
         return array;
    }
     
    public static void print2DArray(String[][] array){
         for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}

