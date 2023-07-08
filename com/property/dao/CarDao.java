package com.property.dao;

import com.property.po.Car;
import com.property.vo.CarVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车辆数据访问接口
 * @CreateTime 2022/9/9 16:16
 */
public interface CarDao {

    /**
     * 查询所有车辆
     * @return 车辆对象集合
     */
    public List<Car> findAll();

    /**
     * 根据车辆编号 查询车辆对象
     * @param car_id 车辆编号
     * @return 车辆对象
     */
    public Car findById(int car_id);

    /**
     * 根据车牌号 查询车辆对象
     * @param car_num 车牌号
     * @return 车辆对象
     */
    public Car findByNum(String car_num );

    /**
     * 根据业主编号  查询车辆
     * @param owner_id 业主编号
     * @return 车辆集合
     */
    public List<Car> findByOwnerId(int owner_id);

    /**
     * 根据业主编号  查询车辆
     * @param owner_id 业主编号
     * @return 车辆集合
     */
    public Car findByOwnerId7(int owner_id);

    /**
     * 添加车辆
     * @param car 车辆对象
     * @return 受影响的行数
     */
    public int add(Car car);

    /**
     * 根据车辆编号 删除车辆对象 （支持批量删除）
     * @param array 车辆编号数组
     * @return  受影响的行数
     */
    public int deleteById(int[] array);

    /**
     * 更新车辆信息
     * @param car 车辆对象
     * @return 受影响的行数
     */
    public int update(Car car);


    /**
     * @param village_vid 小区编号
     * @return 车辆VO对象
     */
    public List<CarVO> findVOAllByVid(int village_vid);

    /**
     * 查询所有车辆VO对象的集合
     * @return 车辆VO对象的集合
     */
    public List<CarVO> findVOAll();

}
