Write a method findSpiral to traverse a 2D matrix of ints in a clockwise spiral order and append the elements to an output ArrayList if Integers.

public static ArrayList<Integer> findSpiral(int[][] arr) {

    if(arr == null || arr.length < 1) return new ArrayList<Integer>();
    int row = arr.length-1, col = arr[0].length-1;
    int x = 0, y = 0, dir = 0;
    ArrayList<Integer> result = new ArrayList<Integer>();
    while(x <= row && y <= col){
        if(dir==0){
            for(int i=y; i<=col; i++){
                result.add(arr[x][i]);
            }
            dir=1;
            x++;
        }else if(dir==1){
            for(int i=x; i<=row; i++){
                result.add(arr[i][col]);
            }
            dir=2;
            col--;
        }else if(dir==2){
            for(int i=col; i>=y; i--){
                result.add(arr[row][i]);
            }
            dir=3;
            row--;
        }else if(dir==3){
            for(int i=row; i>=x; i--){
                result.add(arr[i][y]);
            }
            dir=0;
            y++;
        }
    } // end of while
    return result;
}
