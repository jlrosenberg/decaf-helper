package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Component {
    List<Attribute> atts;
    String name;

    public Component(String n, List<Attribute> atts){
        name = n;
        this.atts = atts;
    }

    private Component(){
        this.atts=new ArrayList<Attribute>();
    }

    public String toString(){
        return "<"+name+"\n" +atts.stream().map(a -> ("  "+a.toString())).collect(Collectors.joining("\n"))+"/>";
    }


    public static class Builder{
        static Component component=new Component();
        static Component build(){
            return component;
        }

        static void setName(String name){
            component.name=name;
        }

        static void addAttr(String attr){
            try{
                component.atts.add(new Attribute(attr));
            }catch(Exception e){
                System.out.println("Could not add attribute: "+attr);
            }
        }
    }

 }
