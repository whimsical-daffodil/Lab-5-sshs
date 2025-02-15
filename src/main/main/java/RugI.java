public class RugI {
    
    public static void main (String args[]){
        print2DArray(vertical());
   }

        
    public static String[][] vertical(){
         String[][] array = new String[11][11];
         for (int row = 0; row < array.length; row++) {
             for (int col = 0; col < array[row].length; col++) {
                 if (col % 2 == 0 ){
                    array[row][col] = "🍊";
                 } else {
                    array[row][col] = "🍀";
                 }
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
