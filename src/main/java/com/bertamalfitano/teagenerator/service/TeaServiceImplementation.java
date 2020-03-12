package com.bertamalfitano.teagenerator.service;

import com.bertamalfitano.teagenerator.dao.TeaDao;
import com.bertamalfitano.teagenerator.model.Tea;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TeaServiceImplementation implements TeaService {

    private TeaDao teaDao;

    public void setTeaDao(TeaDao teaDao) {
        this.teaDao = teaDao;
    }

    @Transactional
    public void addTea(Tea tea) {
        this.teaDao.addTea(tea);
    }
    @Transactional
    public void updateTea(Tea tea) {
        this.teaDao.updateTea(tea);
    }
    @Transactional
    public void removeTea(int id) {
        this.teaDao.removeTea(id);
    }
    @Transactional
    public Tea getTeaById(int id) {
        return this.teaDao.getTeaById(id);
    }
    @Transactional
    public List<Tea> teaList() {
        return this.teaDao.teaList();
    }
}
