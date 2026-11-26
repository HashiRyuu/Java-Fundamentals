class MatrixStatistics {
  public static void main(String[] args) {
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    
    System.out.println("Total: " + getTotal(arr));
    System.out.println("Average: " + getAverage(arr));
    System.out.println("RowTotal: " + getRowTotal(arr, 1));
    System.out.println("ColumnTotal: " + getColumnTotal(arr, 2));
    System.out.println("Highest: " + getHighestInRow(arr, 1));
    System.out.println("lowest: " + getLowestInRow(arr, 1));
  }

  /**
  * Method getTotal  
  * @param arr 2D array of integers
  * @return total of all elements in 2D array
  */
  
  public static int getTotal(int[][] y) {
    int total = 0;
    for(int i = 0; i < y.length; i++){
        for(int j = 0; j < y[i].length; j++) {
          total += y[i][j];
        }
    }
    return total;
  }

  /** 
  * Method getAverage
  * @param arr 2D array of integers
  * @return average of all elements in 2D array
  */
  public static int getAverage(int[][] y) {
    int total = 0;
    int count = 0;
    for(int i = 0; i < y.length; i++){
        for(int j = 0; j < y[i].length; j++) {
          total += y[i][j];
          count++;
        }
    }
    return total/count;
  }

  /**
  * Method getRowTotal
  * @param arr 2D array of integers
  * @param row int representing row to add
  * @return total of all elements in row
  */
  
  public static int getRowTotal(int[][] y, int x) {
    int total = 0;
    for(int i =0; i < y[x].length; i++) {
        total += y[x][i]; }
      return total;
  }

  /**
  * Method getColumnTotal
  * @param arr 2D array of integers
  * @param col int representing column to add
  * @return total of all elements in column
  */
  
  public static int getColumnTotal(int[][] y, int x) {
    int total = 0;
      for(int i = 0; i < y.length; i++) {
        total += y[i][x];
      }
      return total;
  }

  /**
  * Method getHighestInRow
  * @param arr 2D array of integers
  * @param row int representing row to add 
  * @return highest value in row
  */
  public static int getHighestInRow(int[][] y, int u) {
    int highest = y[u][0];
      for(int i = 0; i < y.length; i++) {
        if(y[u][i] > highest) {
          highest = y[u][i];
        }
      }
    return highest;
  }

  /**
  * Method getLowestInRow
  * @param arr 2D array of integers
  * @param row int representing row to add  
  * @return lowest value in row
  */
  public static int getLowestInRow(int[][] y, int c) {
    int lowest = y[c][0];
      for(int i = 0; i < y.length; i++) {
        if(y[c][i] < lowest) {
          lowest = y[c][i];
        }
      }
    return lowest;
  }
}
