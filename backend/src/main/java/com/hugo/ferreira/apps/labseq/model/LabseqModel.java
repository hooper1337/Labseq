package com.hugo.ferreira.apps.labseq.model;

import java.math.BigInteger;
import java.util.HashMap;

public class LabseqModel
{
    // Cache to store the previous calculations
    private final HashMap<Integer, BigInteger> cache;

    public LabseqModel()
    {
        cache = new HashMap<>();
        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
        cache.put(2, BigInteger.ZERO);
        cache.put(3, BigInteger.ONE);
    }

    public boolean containsKey(Integer key){return this.cache.containsKey(key);}
    public BigInteger get(Integer key){return this.cache.get(key);}
    public void put(Integer key, BigInteger value){this.cache.put(key, value);}
}

