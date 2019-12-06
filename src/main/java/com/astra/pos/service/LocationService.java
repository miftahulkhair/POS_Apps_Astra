package com.astra.pos.service;

import com.astra.pos.dao.LocationDao;
import com.astra.pos.model.MstDistrict;
import com.astra.pos.model.MstProvince;
import com.astra.pos.model.MstRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LocationService {

    @Autowired
    LocationDao locationDao;

    public MstProvince findProvince(Long id){
        return locationDao.findProvince(id);
    }
    public List<MstProvince> findAllProvince(){
        return locationDao.findAllProvince();
    }
    public MstRegion findRegion(Long id){
        return locationDao.findRegion(id);
    }
    public List<MstRegion> findAllRegion(){
        return locationDao.findAllRegion();
    }
    public MstDistrict findDistrict(Long id){
        return locationDao.findDistrict(id);
    }
    public List<MstDistrict> findAllDistrict(){
        return locationDao.findAllDistrict();
    }
}
