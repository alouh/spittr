package com.youotech.data;

import com.youotech.bean.SpitterBean;

public interface SpitterRepository {

    public void save(SpitterBean spitterBean);

    public SpitterBean findByUserName(String userName);
}
