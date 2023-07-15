package com.hugo.ferreira.apps.labseq.controller;

import com.hugo.ferreira.apps.labseq.service.LabseqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/labseq")
public class LabseqController
{
    private final LabseqService labseqService;

    @Autowired
    public LabseqController(LabseqService labseqService)
    {
        this.labseqService = labseqService;
    }

    @GetMapping("/{n}")
    public ResponseEntity<String> getResult(@PathVariable int n)
    {
        if(n < 0)
        {
            // Verify that N is a positive integer
            return ResponseEntity.badRequest().body("N must be a positive integer.");
        }

        // Get the sequence
        BigInteger result = this.labseqService.getResult(n);
        if(result.signum() == -1)
        {
            // Verify if recursion is causing memory overflow
            return ResponseEntity.badRequest().body("Memory Overflow, please insert lower values so the cache can store more values.");
        }
        return ResponseEntity.ok().body(result.toString());
    }

}
