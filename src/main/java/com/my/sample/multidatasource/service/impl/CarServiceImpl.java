package com.my.sample.multidatasource.service.impl;

import com.my.sample.multidatasource.entity.po.Car;
import com.my.sample.multidatasource.dao.mapper.secondary.CarMapper;
import com.my.sample.multidatasource.service.CarService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆表 服务实现类
 * </p>
 *
 * @author shiyongbiao
 * @since 2018-11-07
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

}
