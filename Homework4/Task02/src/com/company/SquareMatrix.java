package com.company;
import java.util.Random;


public class SquareMatrix
{

    int size=getRandomNumberInRange(2,12);
    private int[][] dataArray;
private String str="";
    public SquareMatrix (int[][] arr)
    {
        setDataArray(arr);
    }
  public SquareMatrix()
    {
        dataArray=new int[size][size];
    }
    public SquareMatrix(SquareMatrix p)
    {
        this(p.getDataArray());
    }
//because we have to generate numbers in the range of [2,12] and [0, 8]
    private static int getRandomNumberInRange(int min, int max)
    {
        if (min >= max) {
            throw new IllegalArgumentException("Wrong");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

public int findMaxSum()
{
    //creating matrix with random integers nXn
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            this.dataArray[i][j]=getRandomNumberInRange(0, 8);
        }
    }
    int sum=0;
    //to save the biggest sum
    int sum2=0;
    int rowIndex=0;
    int coloumnIndex=0;
    int rowIndex2=2;
    int coloumnIndex2=2;
    boolean flag=true;
    while(rowIndex2!=size+1 && coloumnIndex2!=size+1)
    {
        sum=0;
        for(int i=rowIndex;i<rowIndex2;i++)
        {
            for(int j=coloumnIndex;j<coloumnIndex2;j++)
            {
                sum+=this.dataArray[i][j];
            }
        }
        rowIndex++;
        rowIndex2++;
//saving the biggest number
        if(sum>=sum2)
        {
            if(sum==sum2)
            {
                //saving its coordinates
                str+="[";
                str+=rowIndex-1;
                str+=",";
                str+=coloumnIndex;
                str+="]";
                flag=false;
            }
            else
            {
                str="";
                flag=true;
            }
            if(flag==true) {
                //saving its coordinates
                str += "Matrix: [";
                str += rowIndex-1;
                str += ",";
                str += coloumnIndex;
                str+="]";

            }
            sum2=sum;
        }
       //going to the next coloumn
        if(rowIndex2==size+1)
        {
            rowIndex=0;
            rowIndex2=2;
            coloumnIndex++;
            coloumnIndex2++;
        }

    }

    return sum2;
}
//Getter
    public int[][] getDataArray()
    {
        return dataArray;
    }
//Setter
    public void setDataArray(int[][] dataArray) {
        this.dataArray = dataArray;
    }
//return the martix as a string
public String toString()
{
    String string="";
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            string+=this.dataArray[i][j]+" ";
        }
        string+='\n';
    }
    return string;
}
//printing the biggest sum and the coordinates where matrixes 2x2 has that sum
public void printAll()
{
    System.out.println("Matrix: "+size+"x"+size);
    System.out.println("Sum: "+findMaxSum());
    System.out.println(str);
}
}
