public class RugIIII {
    
    public static void main (String args[]){
        print2DArray(plaid());
   }

        
    public static String[][] plaid(){
         String[][] array = new String[11][11];
         for (int row = 0; row < array.length; row++) {
             for (int col = 0; col < array[row].length; col++) {
                 if(row % 2 == 1 && col % 2 == 1){
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