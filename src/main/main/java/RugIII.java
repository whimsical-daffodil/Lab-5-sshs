public class RugIII {
    
    public static void main (String args[]){
        print2DArray(horizontal());
   }

        
    public static String[][] horizontal(){
         String[][] array = new String[11][11];
         for (int row = 0; row < array.length; row++) {
             for (int col = 0; col < array[row].length; col++) {
                 if((row + col) % 2 == 0){
                    array[row][col] = "x";
                 } else{
                    array[row][col]= "y";
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
