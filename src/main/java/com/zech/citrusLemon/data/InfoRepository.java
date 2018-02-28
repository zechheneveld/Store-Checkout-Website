package com.zech.citrusLemon.data;

import com.zech.citrusLemon.models.InfoEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfoRepository {
    private List<InfoEntry> allEntry = new ArrayList<>();

    public List<InfoEntry> getAllEntry() {
        return allEntry;
    }
    public void addEntry(InfoEntry infoEntry){
        allEntry.add(infoEntry);
    }
}
