package com.company;

public class Name {

    public String fullName;

    public Name myName (){
        fullName = "Omar Atcho";
        return myName();
    }

    public Name myNameLc () {
        fullName= "omar atcho";
        return  myNameLc();
    }
}
