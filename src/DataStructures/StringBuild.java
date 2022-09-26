package DataStructures;

import java.util.Arrays;

public class StringBuild {
    char[] string;
    int size = 0;
    int capacity;
    public StringBuild(int capacity){
        this.capacity = capacity;
        string = new char[capacity];
    }
    public StringBuild(){
        this.capacity = 100;
        string = new char[100];
    }

    public void append(String data){
        if(capacity - size < data.length())
            resizeString();
        for(int i = 0; i < data.length(); i++){
            string[size++] = data.charAt(i);
        }
    }

    public void resizeString(){
        char[] tempString = new char[capacity*2];
        capacity = capacity*2;
        for(int i = 0; i < size; i++ ){
            tempString[i] = string[i];
        }
        string = tempString;
    }

    public int getSize(){
        return size;
    }

    public int  getCapacity(){
        return capacity;
    }

    @Override
    public String toString(){
        return new String(string,0,size);
    }

}
