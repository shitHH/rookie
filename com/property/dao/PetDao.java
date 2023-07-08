package com.property.dao;

import com.property.po.Pet;
import com.property.vo.PetVO;


import java.util.List;

/**
 * @Author : bugger  chengxia
 * @create 2022/9/9 16:44
 * 宠物类接口
 */
public interface PetDao {

    /**
     * 查询所有的宠物
     * @return 宠物对象的集合
     */
    public List<Pet> findAll();

    /**
     * 根据宠物编号查询宠物对象
     * @param pet_id 宠物编号
     * @return 宠物对象
     */
    public Pet findById(int pet_id);

    /**
     * 添加宠物
     * @param pet 宠物对象
     * @return 受影响的行数
     */
    public int addPet(Pet pet);

    /**
     * 删除宠物
     * @param pet_id 宠物编号
     * @return 受影响的行数
     */
    public int deletePet(int pet_id);

    /**
     * 更新宠物信息
     * @param pet 宠物对象
     * @return 受影响的行数
     */
    public int updatePet(Pet pet);

    /**
     * @param village_vid 小区编号
     * @return 宠物VO对象的集合
     */
    public List<PetVO> findVOByVid(int village_vid);

    /**
     * 删除宠物 支持批量删除
     * @param array 宠物编号的数组
     * @return 受影响的行数
     */
    public int deleteById(int[] array);

    /**
     * @param owner_id 业主编号
     * @return 宠物集合
     */
    public List<PetVO>findByOwner_id(int owner_id);

    /**
     * @return 宠物VO对象的集合
     */
    public List<PetVO> findVOAll();

}
