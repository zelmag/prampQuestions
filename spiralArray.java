import java.io.*;
import java.util.*;

class Solution {

  static int[] spiralCopy(int[][] inputMatrix) {
    //right COL 0 TO COL.LENGTH-1 --- ROW 0
    //down ROW 1 TO ROW.LENGTH-1 --- COL: Col. length-1
    //left COL: COL.LENGTH-2 to Col 0-- ROW: ROW.LENGTH - 1
    //UP ROW: row.length-2 to row 1 -- COL 0
    //right COL 1 to Col. Length-2 -- Row: 1 
    //down row 1 to row.length-2 -- COL: col.length-2
    //left col.length - 2 to col 1
    int[] res = new int [inputMatrix.length*inputMatrix[0].length];
    int r=0; 
    int c=0;
    int dir = 0; 
    int written = 0;
    while(written<res.length*res.length){
      //RIGHT
      for(;c<inputMatrix[0].length; c++){
        res[written] = inputMatrix[r][c];
        written++;
      }
      r+=1;
      //DOWN
      for(;r<inputMatrix.length; r++){
        res[written] = inputMatrix[r][c];
        written++;
      }
      c-=1;
      //LEFT 
      for(;c>=0; c--){
        res[written] = inputMatrix[r][c];
        written++;
      }
      r-=1;
      
      //UP
      for(;r>=1; r++){
        res[written] = inputMatrix[r][c];
        written++;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    //System.out.println()
  }
}
