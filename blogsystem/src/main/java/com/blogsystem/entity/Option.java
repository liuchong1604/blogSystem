package com.blogsystem.entity;

import java.io.Serializable;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:22
 */
public class Option implements Serializable {
    /**
     * 配置名称
     */
    private String name;
    /**
     * 配置值
     */
    private String value;
    private String description;

    @Override
    public String toString() {
        return "Option{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
