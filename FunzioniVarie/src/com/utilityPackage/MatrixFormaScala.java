package com.utilityPackage;

public class MatrixFormaScala {
    private static int isThere1(Matrix m){
        for(int i = 0; i < m.getRow(); i++)
            if(m.getValue(i, 0) == 1)
                return i;
        return -1;
    }
    private static int isThere0(Matrix m){
        for(int i = 0; i < m.getRow(); i++)
            if(m.getValue(i, 0) == 0)
                return i;
        return -1;
    }
    private static int getMin(Matrix m){
        int min = m.getValue(0, 0);
        int index_min = 0;
        for(int i = 0; i < m.getRow(); i++)
            if(m.getValue(i, 0) <= min){
                min = m.getValue(i, 0);
                index_min = i;
            }
        return index_min;
    }
    private static void times(Matrix m, int row, int dividend){
        for(int j = 0; j < m.getColumn(); j++)
            m.setValue(row, j, m.getValue(row, j) / dividend);
    }

    public static Matrix calcola(Matrix other){
        Matrix m = other;
        int i = 0, j = 0;

        while(true){
            if(isThere1(other) != -1)
                other.swapRows(i, isThere1(other));
            else
                other.swapRows(i, getMin(other));

            times(other, i, other.getValue(i, j));


            other.printMatrix();
            System.out.println();



            return m;
        }
    }

    public static void pupulateMatrix(Matrix m){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                m.setValue(j, i, (i + 2) * (j + 2));
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(1);
        pupulateMatrix(m1);
        m1.printMatrix();

        System.out.println();


        Matrix m2 = calcola(m1);



       // m2.printMatrix();



    }
}
