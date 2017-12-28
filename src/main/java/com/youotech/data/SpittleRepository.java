package com.youotech.data;

import com.youotech.bean.SpittleBean;

import java.util.List;

public interface SpittleRepository {

    List<SpittleBean> findSpittles(long max,int count);

    SpittleBean findOne(long  id);
}
