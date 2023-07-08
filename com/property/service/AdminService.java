package com.property.service;

import com.property.po.Admin;
import com.property.vo.AdminVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员业务逻辑接口
 * @CreateTime：2022/9/12 14:39
 */
public interface AdminService {
    /**
     * 查询所有管理员
     * @return 管理员集合
     */
    public List<Admin> findAll();

    /**
     * 根据管理员id查询对象
     * @param admin_id 管理员id
     * @return 管理员对象
     */
    public Admin findById(int admin_id);

    /**
     * 根据管理员状态id查询
     * @param admin_sid 管理员状态id
     * @return 管理员集合
     */
    public List<Admin> findBySid(int admin_sid);

    /**
     * 根据管理员角色id查询
     * @param admin_rid 管理员角色id
     * @return 管理员集合
     */
    public List<Admin> findByRid(int admin_rid);

    /**
     * 根据小区id查询管理员
     * @param village_vid 小区id
     * @return 管理员集合
     */
    public List<Admin> findByVid(int village_vid);

    /**
     * 根据管理员名称
     * @param admin_name 管理员名称
     * @return 管理员集合
     */
    public List<Admin> findByName(String admin_name);

    /**
     * 根据管理员号码查询管理员
     * @param admin_tel 管理员号码
     * @return 管理员集合
     */
    public Admin findByTel(String admin_tel);

    /**
     *
     * @param admin 管理员对象
     * @return 受影响行数
     */
    public AdminVO addAdmin(Admin admin);

    /**
     * 删除管理员
     * @param array 管理员id数组
     * @return 受影响行数
     */
    public boolean deleteAdmin(int[] array);

    /**
     * 更新管理员信息（修改密码）
     * @param admin 管理员对象
     * @return 是否更新成功
     */
    public boolean updateAdmin(Admin admin);

    /**
     * 更新管理员信息（不修改密码）
     * @param admin 管理员对象
     * @return 是否更新成功
     */
    public boolean updateAdminNOPass(Admin admin);

    /**
     * @return 管理员对象VO的集合
     */
    public List<AdminVO> findVOAll();

    /**
     * @param admin_id 管理员编号
     * @return 管理员对象VO
     */
    public AdminVO findVOById(int admin_id);

    /**
     * @param admin 管理员对象
     * @return 管理员对象VO
     */
    public AdminVO findByTelAndPass(Admin admin);

    /**
     * @param village_vid 小区编号
     * @return 管理员对象VO的集合
     */
    public List<AdminVO> findVOByVid(int village_vid);


    /**
     * 根据管理员对象修改小区编号
     * @param admin 管理员对象
     * @return 修改是否成功
     */
    public boolean updateAdmin_vid(Admin admin);

    /**
     * @param admin_tel 电话
     * @return vo管理员
     */
    public AdminVO findByTelv(String admin_tel);


    /**
     * @param list 小区编号的集合
     * @return 管理员VO对象的集合
     */
    public List<AdminVO> findVOByVids(List<Integer> list);


}
