package com.hugo.ferreira.apps.labseq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabSeqController
{

    @GetMapping("/labseq")
    public ResponseEntity<Integer> generateLabSeq(@RequestParam int index)
    {
        return ResponseEntity.ok().body(2);
    }
}
