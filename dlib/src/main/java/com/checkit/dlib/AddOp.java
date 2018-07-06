package com.checkit.dlib;

public class AddOp {

    public double addOperation(int val_1, int val_2)
    {
        try
        {
            return addIt(val_1, val_2);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            return 0;
        }
    }

    private double addIt(int val_1, int val_2)
    {
        return val_1 + val_2;
    }
}
