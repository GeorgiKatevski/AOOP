package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String removeSpace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c!=' ') {
                result += c;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        int coloumns = input2.nextInt();
        String str2 = str;
        //System.out.println(str2);
        str = removeSpace(str2);
        int rows = str.length() / coloumns ;
        if(str.length() % coloumns!=0)
        {
            rows+=1;
        }

        char[] cipherTextChars = str.toCharArray();// to char array

        char[][] array = new char[rows][coloumns];

        int j = 0;
        int number2 = coloumns;
        int index = 0;
        int counter=0;
        for (int i = 0; i < rows; i++) {
            for (j = 0; j < coloumns; j++) {
                if (index < cipherTextChars.length) {
                    array[i][j] = cipherTextChars[index];
                } else {
                    array[i][j] = 'X';
                    counter++;
                }
                index++;
            }

        }

        for(int i=0;i<rows;i++)
        {
            for(int l=0;l<coloumns;l++)
            {
                System.out.print(array[i][l]+" ");
            }
            System.out.println();
        }
//-----------------ENCRYPTING----CounterClock-----------------------
        String string = "";
        System.out.println(str.length());
int count=0;
System.out.println("rows"+rows);
int maxrows=rows;
int minrows=0;
int maxcoloumns=coloumns;
int mincoloumns=0;
while(count!=str.length()) {
    count++;

    for (int i = minrows; i < maxrows; i++) {

        if(string.length()>=str.length()+counter)
        {
            break;
        }
            string += array[i][mincoloumns];

    }
    mincoloumns++;
    for (int i = mincoloumns; i < maxcoloumns; i++) {

        string += array[maxrows - 1][i];

    }
    maxrows--;
    for (int i = maxrows - 1; i > minrows; i--) {
        if(string.length()>=str.length()+counter)
        {
            break;
        }
        string += array[i][maxcoloumns - 1];
    }
    maxcoloumns--;
    for (int i = maxcoloumns; i >= mincoloumns; i--) {
        string += array[minrows][i];
    }
    minrows++;

    if(string.length()>=str.length()+counter)
    {
        break;
    }
}

//------------------------------------------------------------
        System.out.println(counter);
        System.out.println(str);
        System.out.println(string);

int minColoumns2=0;
int maxColoumn2=coloumns;
int minrows2=0;
int maxrows2=rows;

int count2=0;
String string2="";
while(count2!=str.length()) {

    count2++;
    for (int i = maxrows2 - 1; i >= minrows2; i--) {
        if (string2.length() >= str.length() + counter) {
            break;
        }
        string2 += array[i][maxColoumn2 - 1];
    }

    maxColoumn2--;
    for (int i = maxColoumn2 - 1; i >= minColoumns2; i--) {
        string2 += array[minrows2][i];
    }
    minrows2++;
    for (int i = minrows2; i < maxrows2; i++) {

        if (string2.length() >= str.length() + counter) {
            break;
        }
        string2 += array[i][minColoumns2];

    }
    minColoumns2++;
    for (int i = minColoumns2; i < maxColoumn2; i++) {

        string2 += array[maxrows2 - 1][i];

    }
    maxrows2--;

    if (string2.length() >= str.length() + counter) {
        break;
    }
}
        System.out.println(string2);
//------------------------------------------------
    char[][] array3=new char[rows][coloumns];
    int minRows3=0;
    int maxRows3= rows;
    int minColoumns3=0;
    int maxColoumns3=coloumns;
        char [] oldText = string.toCharArray();
//----------------------DECRYPTING------------------------------
int index3=0;
int count7=0;

        while(count7!=string.length()) {
            count7++;

            for (int i = minRows3; i < maxRows3; i++) {
                if(index3==oldText.length)
                {
                    break;
                }
                array3[i][minColoumns3]=oldText[index3];
                index3++;
            }
            minColoumns3++;
            for (int i = minColoumns3; i < maxColoumns3; i++) {


                array3[maxRows3 - 1][i]=oldText[index3];
index3++;
            }
            maxRows3--;
            for (int i = maxRows3 - 1; i > minRows3; i--) {
if(index3==oldText.length)
{
    break;
}
                array3[i][maxColoumns3 - 1]=oldText[index3];
                index3++;
            }

            maxColoumns3--;
            for (int i = maxColoumns3; i >= minColoumns3; i--) {
                array3[minRows3][i]=oldText[index3];
                index3++;
            }
            minRows3++;


        }


String decryptedString="";
for(int i=0;i<rows;i++)
{

    for(int k=0;k<coloumns;k++)
    {


            decryptedString += array3[i][k];

    }
}

char[] dString =decryptedString.toCharArray();

        System.out.println(decryptedString);




    for(int i=0;i<rows;i++) {
        for(int n=0;n<coloumns;n++) {
        System.out.print(array3[i][n]+" ");
        }
    System.out.println();
}


//-----------Second-DECRYPTING------------------------------

        char[][] array8=new char[rows][coloumns];
        int minRows8=0;
        int maxRows8= rows;
        int minColoumns8=0;
        int maxColoumns8=coloumns;
        char [] oldText8 = string2.toCharArray();



        int index8=0;
        int count8=0;

        while(count8!=string2.length()) {
            count8++;

            for (int i = minRows8; i < maxRows8; i++) {
                if(index8==oldText8.length)
                {
                    break;
                }
                array8[i][minColoumns8]=oldText8[index8];
                index8++;
            }
            minColoumns8++;
            for (int i = minColoumns8; i < maxColoumns8; i++) {


                array8[maxRows8 - 1][i]=oldText8[index8];
                index8++;
            }
            maxRows8--;
            for (int i = maxRows8 - 1; i > minRows8; i--) {
                if(index8==oldText8.length)
                {
                    break;
                }
                array8[i][maxColoumns8 - 1]=oldText8[index8];
                index8++;
            }

            maxColoumns8--;
            for (int i = maxColoumns8; i >= minColoumns8; i--) {
                array8[minRows8][i]=oldText8[index8];
                index8++;
            }
            minRows8++;

        }


        String decryptedString8="";
        for(int i=rows-1;i>=0;i--)
        {

            for(int k=coloumns-1;k>=0;k--)
            {


                decryptedString8 += array8[i][k];

            }
        }
        System.out.println("string: "+decryptedString8);
        System.out.println("-----------------------");
for(int i=0;i<rows;i++)
{
    for(int k=0;k<coloumns;k++)
    {
        System.out.print(array8[i][k]+" ");
    }
    System.out.println();
}



}













    }

//--------------------------------------------------------------------










