package com.utilityPackage;

import java.util.Scanner;

public class Matrix {
    private int row, column;
    private int[][] mat = new int[3][3];

    public Matrix(){
        setComponent();
        setMatrix();
    }

    public Matrix(int i){
        this.row = 3;
        this.column = 3;
    }

    public int getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }
    public int getValue(int i, int j){
        return mat[i][j];
    }
    public void printMatrix(){
        for(int i = 0; i < getRow(); i++){
            for(int j = 0; j < getColumn(); j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    private void setComponent(){
        Scanner sc = new Scanner(System.in);
        int x, y;

        do{
            System.out.print("Inserire numero righe: ");
            x = sc.nextInt();
        } while (x < 0);

        do{
            System.out.print("Inserire numero colonne: ");
            y = sc.nextInt();
        } while (y < 0);

        this.row = x;
        this.column = y;
    }
    private void setMatrix(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < getRow(); i++){
            for(int j = 0; j < getColumn(); j++){
                System.out.print("Inserire valore cella [" + (i + 1) + ", " + (j + 1) + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public void setValue(int i, int j, int value){
        this.mat[i][j] = value;
    }

    public void swapRows(int index1, int index2){
        for(int j = 0; j < getColumn(); j++){
            int temp = mat[index1][j];
            mat[index1][j] = mat[index2][j];
            mat[index2][j] = temp;
        }
    }
}
