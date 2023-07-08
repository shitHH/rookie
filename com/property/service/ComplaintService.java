package com.property.service;

import com.property.po.Complaint;
import com.property.po.ComplaintList;
import com.property.vo.ComplaintCountVo;
import com.property.vo.ComplaintVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：投诉业务逻辑接口
 * @create 2022-09-11 14:29
 */
public interface ComplaintService {
    /**
     * 查询所有投诉对象
     * @return 投诉对象集合
     */
    public List<Complaint> findAll();

    /**
     * 查询所有投诉对象视图
     * @return 投诉对象视图集合
     */
    public List<ComplaintVO> findVOAll();

    /**
     * 根据投诉编号  查询投诉对象
     * @param complaint_id 投诉编号
     * @return 投诉对象
     */
    public Complaint findById(int complaint_id);

    /**
     * 根据投诉编号  查询投诉视图对象
     * @param complaint_id 投诉编号
     * @return 投诉对象
     */
    public ComplaintVO findVOById(int complaint_id);

    /**
     * 根据业主编号 查询该业主的所有投诉
     * @param owner_id 业主编号
     * @return 投诉对象集合
     */
    public List<ComplaintVO> findByOwnerId(int owner_id);

    /**
     * 增加投诉
     * @param complaint 投诉对象
     * @return 是否添加成功
     */
    public boolean add(Complaint complaint);

    /**
     * 更新投诉对象
     * @param complaint 投诉对象
     * @return 是否更新成功
     */
    public boolean update(Complaint complaint);

    /**
     * 根据投诉编号 删除投诉对象 （支持批量删除）
     * @param array  投诉编号的数组
     * @return 是否删除成功
     */
    public boolean delete(int[] array);

    /**
     * 查找投诉的数量
     * @return
     */
    public int findComplaintNum();

    /**
     * @return 投诉信息列表
     */
    public List<ComplaintCountVo> findComplaintCount();

    /**
     * 根据小区编号查询所有投诉对象
     * @return 投诉对象集合
     */
    public List<ComplaintVO> findAllByVid(int vid);

    /**
     * 根据小区编号查询所有投诉记录
     * @return 投诉记录对象的集合
     */
    public List<ComplaintVO> findVOAllByVid(int vid);
}
