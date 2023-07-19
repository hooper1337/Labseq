package com.hugo.ferreira.apps.labseq.service;

import com.hugo.ferreira.apps.labseq.model.LabseqModel;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class LabseqService
{
    private  final LabseqModel labseqModel;

    public LabseqService()
    {
        this.labseqModel = new LabseqModel();
    }


    public BigInteger getResult(int n)
    {
        // Verify if the calculation has been made previously
        if(labseqModel.containsKey(n))
        {
            return labseqModel.get(n);
        }
        // Get normal sequence
        else
        {
            try
            {
                BigInteger result = getResult(n - 4).add(getResult( n - 3));
                labseqModel.put(n, result);
                return result;
            }
            catch (StackOverflowError stackOverflowError){
                return new BigInteger("-1");
            }
        }
    }
}
