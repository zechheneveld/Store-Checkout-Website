package com.zech.citrusLemon.data;

import com.zech.citrusLemon.models.MathEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MathRepository {
    private List<MathEntry> allEntries = new ArrayList<>();

    public List<MathEntry> getAllEntries(){
        return allEntries;
    }
    public void addEntry(MathEntry mathEntry){
        allEntries.add(mathEntry);
    }
    public MathEntry getLastEntry(){
        MathEntry last = this.allEntries.get(this.allEntries.size() - 1);
        return last;
    }
}