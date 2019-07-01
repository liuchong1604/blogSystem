package com.blogsystem.entity;

import java.io.Serializable;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:13
 */
public class Attach implements Serializable {
    private Integer id;
    private String fname;
    private String ftype;
    private String fkey;
    private Integer authorId;
    private Integer created;

    @Override
    public String toString() {
        return "Attach{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", ftype='" + ftype + '\'' +
                ", fkey='" + fkey + '\'' +
                ", authorId=" + authorId +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getFkey() {
        return fkey;
    }

    public void setFkey(String fkey) {
        this.fkey = fkey;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}
