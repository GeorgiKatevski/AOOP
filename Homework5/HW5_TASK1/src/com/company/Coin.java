package com.company;

import java.util.Random;

enum Face
{
    HEAD,
    TAIL;
}

public class Coin
{

private Random rand;
private Face face;
public Coin()
{

}
public Coin(Face face)
{
    setFace(face);
}

public Face getFace()
{
    return face;
}

public void setFace(Face face)
{
this.face=face;
}

public void flip()
{
    rand=new Random();
    int answer=rand.nextInt(2)+1;
    if(answer==1)
    {
        setFace(Face.HEAD);
    }
    else
    {
        setFace(face.TAIL);
    }

}

public void print()
{
    System.out.println(face);
}
public boolean isHeads()
{
if(face==face.HEAD)
{
    return true;
}
else
    return false;
}

public String toString()
{
    if(face==face.HEAD)
    {
        return "HEAD";
    }
    else
    {
        return "TAIL";
    }
}


}
