package com.astra.pos.dao;

import com.astra.pos.model.MstDistrict;
import com.astra.pos.model.MstProvince;
import com.astra.pos.model.MstRegion;

import java.util.List;

public interface LocationDao {

    MstProvince findProvince(Long id);
    List<MstProvince> findAllProvince();
    MstRegion findRegion(Long id);
    List<MstRegion> findAllRegion();
    MstDistrict findDistrict(Long id);
    List<MstDistrict> findAllDistrict();
}
