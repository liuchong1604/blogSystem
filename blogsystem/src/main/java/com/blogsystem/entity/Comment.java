package com.blogsystem.entity;

import java.io.Serializable;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:05
 */
public class Comment implements Serializable {
    private Integer coid;
    /**
     * 内容表主键
     */
    private Integer cid;
    /**
     * 创建时间
     */
    private Integer created;
    /**
     * 评论作者
     */
    private String author;
    private Integer authorId;
    private Integer ownerId;
    private String mail;
    private String url;
    private String ip;
    private String agent;
    private String type;
    private String status;
    private String parent;
    private String content;

    @Override
    public String toString() {
        return "Comment{" +
                "coid=" + coid +
                ", cid=" + cid +
                ", created=" + created +
                ", author='" + author + '\'' +
                ", authorId=" + authorId +
                ", ownerId=" + ownerId +
                ", mail='" + mail + '\'' +
                ", url='" + url + '\'' +
                ", ip='" + ip + '\'' +
                ", agent='" + agent + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", parent='" + parent + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
