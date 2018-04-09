package com.zt.mybatis_springboot.dao;


import com.zt.mybatis_springboot.domain.City;


import java.util.List;


public interface CityDAO {

     List<City> selectAllCity();

}
