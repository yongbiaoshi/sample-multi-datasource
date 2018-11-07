package com.my.sample.multidatasource.runner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.my.sample.multidatasource.entity.po.Car;
import com.my.sample.multidatasource.entity.po.User;
import com.my.sample.multidatasource.service.CarService;
import com.my.sample.multidatasource.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    private UserService userService;
    private CarService carService;

    public TestRunner(UserService userService, CarService carService) {
        this.userService = userService;
        this.carService = carService;
    }


    @Override
    public void run(String... args) throws Exception {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.last(" limit 1");
        User user = userService.getOne(userQueryWrapper);
        System.out.println(user);

        QueryWrapper<Car> carQueryWrapper = new QueryWrapper<>();
        carQueryWrapper .last(" limit 1");
        Car car = carService.getOne(carQueryWrapper);
        System.out.println(car);

    }
}
