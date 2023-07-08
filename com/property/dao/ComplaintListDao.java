package com.property.dao;

import com.property.po.ComplaintList;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 16:55
 * 投诉记录数据访问接口
 */
public interface ComplaintListDao {
    /**
     * 查询所有投诉记录
     * @return 投诉记录对象的集合
     */
    public List<ComplaintList> findAll();

    /**
     * 根据投诉记录编号查询投诉记录
     * @param complaintlist_id 投诉记录编号
     * @return 投诉记录对象
     */
    public ComplaintList findById(int complaintlist_id);

    /**
     * 添加投诉记录
     * @param complaintList 投诉记录对象
     * @return 受影响的行数
     */
    public int addComplaintList(ComplaintList complaintList);

    /**
     * 更新投诉记录
     * @param complaintList 投诉记录对象
     * @return 受影响的行数
     */
    public int updateComplaintList(ComplaintList complaintList);

    /**
     * 删除投诉记录
     * @param complaintlist_id 投诉记录编号
     * @return 受影响的行数
     */
    public int deleteComplaintList(int complaintlist_id);

    /**
     * 查询投诉记录列表的数目
     * @return 投诉记录列表的数目
     */
    public int findComplaintListNum();


}
