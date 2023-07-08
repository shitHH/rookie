package com.property.dao;

import com.property.po.CarPort;
import com.property.po.ComplaintList;
import com.property.vo.CarportSumVo;
import com.property.vo.CarportVO;
import com.property.vo.ParkingVO;
import com.property.vo.CountVoVid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 16:56
 * 车位数据访问接口
 */
public interface CarPortDao {

    /**
     * 查询所有车位
     * @return 车位对象的集合
     */
    public List<CarPort> findAll();
    /**
     * 查询所有车位
     * @return 车位对象的集合
     */
    public List<CarportVO> findAllVO();

    /**
     * 根据车位编号查询车位
     * @param carport_id 车位编号
     * @return 车位对象
     */
    public CarPort findById(int carport_id);

    /**
     * 根据车位编号查询车位主人&号码
     * @param carport_id 车位编号
     * @return 车位对象
     */
    public CarportVO findByCarportIdVO(int carport_id);
    /**
     * 添加车位
     * @param carPort 车位对象
     * @return 受影响的行数
     */
    public int addCarPort(CarPort carPort);

    /**
     * 更新车位
     * @param carPort 车位对象
     * @return 受影响的行数
     */
    public int updateCarPort(CarPort carPort);

    /**
     * 只修改车位租赁状态
     * @param carPort 车位对象
     * @return 受影响行数
     */
    public int updateCarPort2(CarPort carPort);
    /**
     * 只修改车位绑定车牌号
     * @param carPort 车位对象
     * @return 受影响行数
     */
    public int updateCarPort3(CarPort carPort);

    /**
     * 删除车位
     * @param carport_id 车位编号
     * @return 受影响的行数
     */
    public int deleteCarPort(int carport_id);

    /**
     * 查询车位
     * @return VO集合
     */
    public List<CarportVO> findAllVOByVid(int village_vid);
    /**
     * 查询车位
     * @return 物业车位列表
     */
    public List<CarportVO> findAllVOByVidAndUid(int village_vid);
    /**
     * 查询车位
     * @return VO集合
     */
    public List<CarportVO> findAllUsageVO(int village_vid);


    /**
     * 根据小区和车位状态查询
     * @param village_vid 小区编号
     * @param carport_lid 车位状态编号
     * @return
     */
    public List<CarportVO> findByVillage_vidAndCarport_lid(@Param("village_vid")int village_vid,@Param("carport_lid") int carport_lid);

    /**
     * 根据业主编号查询车位信息集合
     * @param owner_id 业主编号
     * @return 车位信息集合
     */
    public List<CarportVO> findByOwner_id(int owner_id);
//    public List<ParkingVO> findAllVO();
//    public List<ParkingVO> findAllVOByVid(int village_vid);
    public CarportVO findAllVOByCid(int carport_id);
    /**
     * 根据业主编号查询车位信息集合
     * @param owner_id 业主编号
     * @return 车位信息集合
     */
    public CarPort findByOwner_id2(int owner_id);
    /**
     * 查询小区车位数量的方法
     * @param village_vid 小区编号
     * @return 车位数量对象
     */
    public CountVoVid findCount(int village_vid);

    /**
     * @param village_vid 小区编号
     * @return 车位状态数量
     */
    public List<CarportSumVo> findCarportSum(int village_vid);

    /**
     * 根据车牌号查询车位对象
     * @param car_num  车牌号
     * @return  车位对象
     */
    public CarPort  findByCar_num(String car_num);

    /**
     * @param car_num 车牌号
     * @return 车位对象
     */
    public CarPort findByCar_numcd(String car_num);
}
