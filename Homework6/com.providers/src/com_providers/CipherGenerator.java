package com_providers;

import com_services.Cipherable;

public class CipherGenerator {

  public  static Result countDistinct(Cipherable cipher,int seed)
    {
        char[] arr=cipher.getSecretChars(seed);
        boolean[] isItThere = new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            isItThere[i]=false;
        }
        for (int i = 0; i < arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    isItThere[i] = true;
                    isItThere[j]=true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isItThere[i]==false ){
                count++;
            }
        }

        Result result=new Result(arr,count);

        return result;
    }




}
