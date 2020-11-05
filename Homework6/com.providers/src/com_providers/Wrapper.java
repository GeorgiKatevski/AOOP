package com_providers;

import com_services.Cipherable;

import java.util.Random;

public class Wrapper {
private int size;

public Wrapper(int size)
                     {
                         setSize(size);
                     }

                        public void setSize(int size)
                        {
                            if(size>=0)
                                {
                                     this.size = size;
                                }
                            else
                                 {
                                      this.size=0;
                                 }
                        }


                         public int getSize() {
        return size;
    }


private class FixedRandom implements Cipherable
{
        public char[] getSecretChars(int seed)
             {
        char [] array=new char[getSize()];
        int m=0;
                 Random random=new Random(seed);
            for(int i=0;i<getSize();i++)
                 {
            String alphabet="ABCDEFGHIJKIMNOPQRSTUVWXYZ";
            char letter=alphabet.charAt(random.nextInt(alphabet.length()));
            array[i]=letter;
                }
                return array;
            }
}

private class FixedSelection implements Cipherable
{
        public char[] getSecretChars(int seed)
        {
            char [] seedSizeArray=new char[seed];
            char [] array=new char[getSize()];
            Random random=new Random();
            for(int i=0;i<seed;i++)
            {

                String alphabet="ABCDEFGHIJKIMNOPQRSTUVWXYZ";
                char letter=alphabet.charAt(random.nextInt(alphabet.length()));
                seedSizeArray[i]=letter;
            }

            for(int i=0;i<getSize();i++)
            {

                int index=random.nextInt(seedSizeArray.length);
                array[i]=seedSizeArray[index];
            }

            return array;
        }
}


       public Cipherable makeFixedRandom()
    {
        FixedRandom rnd=new FixedRandom();
        return rnd;
    }

    public Cipherable makeFixedSelection()
    {
        FixedSelection rnd=new FixedSelection();
        return rnd;
    }



}
