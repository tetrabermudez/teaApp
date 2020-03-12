package com.bertamalfitano.teagenerator.service;

import com.bertamalfitano.teagenerator.model.Tea;

import java.util.List;

public interface TeaService {
    void addTea(Tea tea);
    void updateTea(Tea tea);
    void removeTea(int id);
    Tea getTeaById(int id);
    List<Tea> teaList();
}
