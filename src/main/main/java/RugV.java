public class RugV {
    
        public static void main (String args[]){
            print2DArray(diagonal());
       }
    
            
        public static String[][] diagonal(){
             String[][] array = new String[11][11];
             for (int row = 0; row < array.length; row++) {
                 for (int col = 0; col < array[row].length; col++) {
                    if (row == col){
                        array[row][col] = "🍀";
                    } else if (row + col == 10){
                        array[row][col] = "🍀";
                    } else if (row + col == 5){
                        array[row][col] = "🍀";
                    } else if (col - row == 5){
                        array[row][col] = "🍀";
                    } else if (row + col == 15){
                        array[row][col] = "🍀";
                    }else {
                        array[row][col] = "🍊";
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
     