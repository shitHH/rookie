package com.property.dao;

import com.property.po.Addedfee;
import com.property.vo.AddedfeeVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime 2022/9/10
 *
 * 16:33
 */
public interface AddedFeeDao {
    /**
     * 查询所有增值收入
     * @return 增值对象集合
     */
    public List<Addedfee> findAll();

    /**
     * 查询所有增值收入视图
     * @return 增值视图对象集合
     */
    public List<AddedfeeVO> findVOAll();

    /**
     * 根据增值收入id查询对象
     * @param addedfee_id 增收id
     * @return 增收对象
     */
    public Addedfee findById(int addedfee_id);

    /**
     * 根据增值收入id查询增值视图对象
     * @param addedfee_id 增收id
     * @return 增收视图对象
     */
    public AddedfeeVO findVOById(int addedfee_id);

    /**
     * 根据小区id查询增收
     * @param village_vid 小区id
     * @return 增收对象集合
     */
    public List<Addedfee> findByVid(int village_vid);

    /**
     * 根据增收类型查询对象
     * @param addedfee_type 增收类型
     * @return 增收对象集合
     */
    public List<Addedfee> findByAddedType(String addedfee_type);

    /**
     * 添加增收记录
     * @param addedfee 增收对象
     * @return 受影响行数
     */
    public int addAddedfee(Addedfee addedfee);

    /**
     * 删除增收对象
     * @param array 增收对象id数组
     * @return 受影响行数
     */
    public int deleteAddedfee(int[] array);

    /**
     * 更新增收对象
     * @param addedfee 增收对象
     * @return 受影响行数
     */
    public int updateAddedfee(Addedfee addedfee);

    /**
     * 根据小区编号查询所有增值收入视图
     * @return 增值视图对象集合
     */
    public List<AddedfeeVO> findVOAllByVid(int vid);
}
