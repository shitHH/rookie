package com.property.dao;

import com.property.po.Inform;
import com.property.vo.InformVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：通知公告数据访问接口
 * @CreateTime 2022/9/9 18:21
 */
public interface InformDao {
    /**
     * 查询所有通知公告对象
     * @return 通知公告对象的集合
     */
    public List<Inform> findAll();

    /**
     * 查询所有通知公告视图对象
     * @return 通知公告视图对象的集合
     */
    public List<InformVO> findVOAll();

    /**
     * 根据通知公告编号，查询通知公告对象
     * @param inform_id 通知公告编号
     * @return 通知公告对象
     */
    public Inform findById(int inform_id);

    /**
     * 根据通知公告编号，查询通知公告视图对象
     * @param inform_id 通知公告编号
     * @return 通知公告对象
     */
    public InformVO findVOById(int inform_id);

    /**
     * 根据小区编号，查询该小区的通知公告对象的集合
     * @param village_vid 小区编号
     * @return  通知公告对象的集合
     */
    public  List<Inform> findByVid(int village_vid);

    /**
     * 根据公告标题 模糊查询通知公告对象
     * @param inform_title 公告标题
     * @return 通知公告对象的集合
     */
    public List<Inform> findByInformTitle(String inform_title);

    /**
     * 添加通知公告对象
     * @param inform 通知公告对象
     * @return 受影响的行数
     */
    public int add(Inform inform);

    /**
     * 更新通知公告对象的信息
     * @param inform 通知公告对象
     * @return 受影响的行数
     */
    public int update(Inform inform);

    /**
     * 根据通知公告编号 删除通知公告对象（支持批量删除）
     * @param array 通知公告编号的数组
     * @return 受影响的行数
     */
    public int delete(int[] array);

    /**
     * 根据小区编号查询所有通知公告视图对象
     * @return 通知公告视图对象的集合
     */
    public List<InformVO> findVOAllByVid(int vid);

    /**
     * @param village_vid 小区编码
     * @return 小区通知统计集合
     */
    public List<InformVO> findInformlist(int village_vid);
}
