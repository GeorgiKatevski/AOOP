package com_providers;

import com_services.Cipherable;

public class Result {

private char[] chars;
private int data;
//da se opravi gettera
    public char[] getChars() {
        return chars;
    }

    public int getData() {
        return data;
    }

    public void setChars(char[] _chars)
    {
        this.chars=new char[_chars.length];
        if(_chars!=null)
        {
            for (int i = 0; i < _chars.length; i++) {
                this.chars[i] = _chars[i];
            }
        }

    }

    public void setData(int data) {
        this.data = data;
    }

public Result(char[] chars,int data)
{
    setChars(chars);
    setData(data);
}

    @Override
    public String toString()
    {
        String string="Chars: ";
        for(int i=0;i<chars.length;i++)
        {
            string+=String.format("%s ",chars[i]);
        }
        string+="\nResult: "+String.format("%s ",data);
     return string;
    }





}
