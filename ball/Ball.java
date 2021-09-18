package com.ball;

public class Ball {
    private String color;
    private String type;
    private String size;

    public Ball()
    {
        color = "Unknown";
        type = "Unknown";
        size = "Unknown";
    }

    public Ball (String s)
    {
        size = s;
        type = "Unknown";
        color = "Unknown";
    }

    public Ball (String s, String t)
    {
        size = s;
        type = t;
        color = "Unknown";
    }

    public Ball (String s, String t, String c)
    {
        size = s;
        type = t;
        color = c;
    }

    public String getColor(String color)
    {
        return color;
    }

    public String setColor(String color)
    {
        return this.color = color;
    }

    public String getType(String type)
    {
        return type;
    }

    public String setType(String type)
    {
        return this.type = type;
    }

    public String getGenre(String genre)
    {
        return genre;
    }

    public String setSize(String size)
    {
        return this.size = size;
    }

    public String toString()
    {
        return "This is a " + this.size + " " + this.color + " ball, " + "it is used in " + this.type;
    }

    public void choice()
    {
        if (type == "basketball" || type == "volleyball")
            System.out.println("I like this game!)");
        else
            System.out.println("I don't like this game!(");
    }

}