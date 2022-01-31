package bgu.spl.mics.application.objects;

import com.google.gson.annotations.Expose;

/**
 * Passive object representing a data used by a model.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */
public class Data {
    /**
     * Enum representing the Data type.
     */
    public enum Type {
        Images, Text, Tabular
    }

    @Expose private Type type;
    private int processed;
    @Expose private int size;

    public Data(Type type, int size)
    {
        this.type = type;
        this.size = size;
        processed=0;
    }

    public int getProcessed() {
        return processed;
    }

    public Type getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void increment(){
        processed+=1000;
    }
}
