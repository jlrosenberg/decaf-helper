package com.company;

public class Attribute {
    String field;
    String value;
    boolean valueIsString;

    public Attribute(String unparsed){
        String[] arr = unparsed.split(":");
        field=arr[0].trim();
        value=arr[1].replaceAll(",$", "").trim();
        if(value.contains("\"")){
            valueIsString=true;
        }else{
            valueIsString=false;
        }
    }

    public String toString(){
        if(valueIsString){
            return field+"="+value;
        }else{
            return field+"={"+value+"}";
        }
    }

}
