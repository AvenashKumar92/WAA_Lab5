package edu.mum.domain;

import java.io.Serializable;

/**
 * Created by Avenash_2 on 7/6/2018.
 */
public class User implements Serializable
{
    private String name;
    private String password;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
