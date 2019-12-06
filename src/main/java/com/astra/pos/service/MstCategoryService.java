package com.astra.pos.service;

import com.astra.pos.dao.MstCategoryDao;
import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstCategoryService {
    @Autowired
    MstCategoryDao mstCategoryDao;

    public void saveUpdate(MstCategory mstCategory) {
        this.mstCategoryDao.saveUpdate(mstCategory);
    }

    public MstCategory getCategory(long id) {
        return mstCategoryDao.findOne(id);
    }

    public List<MstCategory> getAllCategory() {
        return mstCategoryDao.findAll();
    }
}
