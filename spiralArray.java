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
    int numRows = inputMatrix.length;
    int numCols = inputMatrix[0].length;
    int[] res = new int [numRows*numCols];
    int written = 0;
    int topRow=0; 
    int bottomRow=numRows-1;
    int leftCol = 0; 
    int rightCol = numCols-1;
    while(topRow<=bottomRow && leftCol<=rightCol){
      //RIGHT. TOP ROW
      for(int i=leftCol;i<=rightCol; i++){
        res[written] = inputMatrix[topRow][i];
        written++;
      }
      topRow++; //top row is one down
      
      //DOWN. COPY RIGHTEST COLUMN
      for(int i=topRow; i<=bottomRow; i++){
        res[written] = inputMatrix[i][rightCol];
        written++;
      }
      rightCol--;
      //LEFT. BOTTOM ROW COPY 
      if(topRow<=bottomRow){ //**WHY ARE THESE IF STATEMENTS NECESSARY??
        for(int i= rightCol; i>=leftCol; i--){
          res[written] = inputMatrix[bottomRow][i]; 
          written++;
        }
        bottomRow--;
      }
      
      //UP. LEFTMOST COLUMN
      if(leftCol<=rightCol){ //**WHY ARE THESE IF STATEMENTS NECESSARY??
        for(int i=bottomRow; i>=topRow; i--){
          res[written] = inputMatrix[i][leftCol];
          written++;
        }
        leftCol++;
      }
    }
    return res;
  }
