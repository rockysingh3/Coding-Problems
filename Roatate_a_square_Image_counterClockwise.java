/* You are given a square 2D image matrix where each integer represents a pixel. Write a method rotateSquareImageCCW
to rotate the image counterclockwise - in-place. This problem can be broken down into simpler sub-problems you've
already solved earlier! Rotating an image counterclockwise can be achieved by taking the transpose of the image matrix
and then flipping it on its horizontal axis. */



public static void rotateSquareImage(int[][] matrix){
  transpose(matrix);
  flipHorizontally(matrix);
}

// first get the transpose of the matrix
public static void transpose(int[][] matrix){
  int row = matrix.length;
  int col = matrix[0].length;

  for(int i=0; i<row; ++i){
    for(int j=0; j<col; ++j){
      int temp = matrix[i][j];
      matrix[i][j] = matrix[j][i];
      matrix[j][i] = temp;
    }
  }
} // end of transpose


// then flip it horizontally
public static void flipHorizontally(int[][] matrix){
  int row = matrix.length;
  int col = matrix[0].length;

  for(int i=0; i<row/2; ++i){
    for(int j=0; j<col; ++j){
      int temp = matrix[i][j];
      matrix[i][j] = matrix[row-i-1][j];
      matrix[row-i-1] = temp;
    }
  }
} // end of method
