package com.checkit.subop;

public class SubOpClass {

    public double subOpMethod(int val_1, int val_2)
    {
        try
        {
            return (val_1 - val_2);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            return Math.abs(val_1 - val_2);
        }
    }
}
