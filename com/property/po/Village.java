package com.property.po;

/**
 * @author : Eeerosss
 * @create 2022/9/9 16:02
 *小区表实体类
 */
public class  Village {
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;

    @Override
    public String toString() {
        return "Village{" +
                "village_vid=" + village_vid +
                ", village_name='" + village_name + '\'' +
                '}';
    }

    public Village() {
    }

    public Village(int village_vid, String village_name) {
        this.village_vid = village_vid;
        this.village_name = village_name;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }
}
