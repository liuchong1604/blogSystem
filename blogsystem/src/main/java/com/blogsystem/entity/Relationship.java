package com.blogsystem.entity;

import java.io.Serializable;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:25
 */
public class Relationship implements Serializable {
    /**
     * 内容主键
     */
    private Integer cid;
    /**
     * 标签主键
     */
    private Integer mid;

    @Override
    public String toString() {
        return "Relationship{" +
                "cid=" + cid +
                ", mid=" + mid +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}
