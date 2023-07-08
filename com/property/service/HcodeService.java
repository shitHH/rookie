package com.property.service;

import com.property.po.Hcode;
import com.property.vo.HcodeVo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：红黄码上报业务逻辑接口
 * @create 2022-09-11 14:31
 */
public interface HcodeService {

    /**
     * 查询所有红黄码上报对象
     * @return 红黄码上报对象的集合
     */
    public List<Hcode> findAll();

    /**
     * 根据红黄码上报编号 查询红黄码上报对象
     * @param hcode_id 红黄码编号
     * @return  红黄码上报对象
     */
    public Hcode findById(int hcode_id);

    /**
     * 根据业主编号 查询该业主的红黄码上报对象集合
     * @param owner_id 业主编号
     * @return 红黄码上报对象的集合
     */
    public List<Hcode> findByOwnerId(int owner_id);

    /**
     * 根据健康码状态 查询该状态的红黄码上报对象集合
     * @param hcode_state 健康码状态
     * @return 红黄码上报对象的集合
     */
    public List<Hcode> findByHcodeState(String hcode_state);

    /**
     * 增加红黄码上报对象
     * @param hcode 红黄码上报对象
     * @return 是否添加成功
     */
    public boolean add(Hcode hcode);

    /**
     * @param owner_id 业主编号
     * @return 业主红黄码上报记录
     */
    public List<HcodeVo>findByOwner_id(int owner_id);

    /**
     * 查询所有红黄码上报对象的视图
     * @return 红黄码上报对象的集合
     */
    public List<HcodeVo> findVOAll();

    /**
     * 查询所有红黄码上报对象的视图
     * @return 红黄码上报对象的集合
     */
    public List<HcodeVo> findVOAllByVid(int vid);
}
