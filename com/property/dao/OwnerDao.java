package com.property.dao;

import com.property.po.Owner;
import com.property.vo.CountVoVid;
import com.property.vo.OwnerSumVo;
import com.property.vo.OwnerVO;
import com.property.vo.OwnerVo1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author bugger chengxia
 * @date 2022-09-10 16:52
 * 业主信息数据访问接口
 */
public interface OwnerDao {
    /**
     * 查询所有业主信息
     * @return 业主信息对象的集合
     */
    public List<Owner> findAll();

    /**
     * 根据业主编号查询业主信息
     * @param owner_id 业主编号
     * @return 业主信息对象
     */
    public Owner findById(int owner_id);

    /**
     * 添加业主信息
     * @param owner 业主信息
     * @return 受影响的行数
     */
    public int addOwner(Owner owner);

    /**
     * 添加业主信息
     * @param owner 业主信息
     * @return 受影响的行数
     */
    public int addOwnerVo(Owner owner);

    /**
     * 更新业主信息
     * @param owner 业主信息
     * @return 受影响的行数
     */
    public int updateOwner(Owner owner);

    /**
     * 删除业主信息
     * @param owner_id 业主编号
     * @return 受影响的行数
     */
    public int deleteOwner(int owner_id);

    /**
     * 查询业主VO对象
     * @return 业主VO对象的集合
     */
    public List<OwnerVO> findVOAllByVid(int village_vid);

    /**
     * 通过编号 查询业主VO对象
     * @param owner_id 业主编号
     * @return 业主VO对象
     */
    public OwnerVO findVOById(int owner_id);

    /**
     * 登陆（电话号码及密码）
     * @return 业主对象
     */
    public OwnerVo1 findTelAndPass(Owner owner);

    /**
     * @param owner_tel 业主电话号码
     * @return 业主对象
     */
    public Owner findTel(String owner_tel);
    /**
     * @param owner_tel 业主电话号码
     * @return 业主对象
     */
    public Owner findTelAndVid(@Param("owner_tel") String owner_tel,@Param("village_vid") int village_vid);

    /**
     * @param owner 业主对象
     * @return 业主对象
     */
    public Owner findTelAndCid(Owner owner );


    /**
     * @param owner
     * @return
     */
    public int reset(Owner owner);

    /**
     * @param village_vid
     * @return 业主集合
     */
    public List<OwnerVO> findByVidVO(int village_vid);

    /**
     * 查询小区总人数的方法
     * @param village_vid 小区编号
     * @return 小区总人数的对象
     */
    public CountVoVid findSum(int village_vid);


    /**
     * 查询小区总租户人数
     * @param village_vid  小区编号
     * @return 小区总租户人数的对象
     */
    public CountVoVid findLSum(int village_vid);


    /**
     * @param village_vid 小区编号
     * @return 总人数
     */
    public List<OwnerSumVo> findSumVo(int village_vid);

    /**
     * 查询所有业主Vo对象集合
     * @return 业主Vo对象集合
     */
    public List<OwnerVO> findVOAll();
}
