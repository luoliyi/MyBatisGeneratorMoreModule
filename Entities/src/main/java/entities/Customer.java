package entities;

import java.io.Serializable;

/**
 * @author 
 */
public class Customer implements Serializable {
    /**
     * 顾客编号
     */
    private Integer cid;

    /**
     * 顾客姓名
     */
    private String cname;

    /**
     * 顾客性别
     */
    private String csex;

    /**
     * 联系方式
     */
    private String cphone;

    /**
     * 身份证
     */
    private String ccard;

    private Integer rid;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCcard() {
        return ccard;
    }

    public void setCcard(String ccard) {
        this.ccard = ccard;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getCsex() == null ? other.getCsex() == null : this.getCsex().equals(other.getCsex()))
            && (this.getCphone() == null ? other.getCphone() == null : this.getCphone().equals(other.getCphone()))
            && (this.getCcard() == null ? other.getCcard() == null : this.getCcard().equals(other.getCcard()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getCsex() == null) ? 0 : getCsex().hashCode());
        result = prime * result + ((getCphone() == null) ? 0 : getCphone().hashCode());
        result = prime * result + ((getCcard() == null) ? 0 : getCcard().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", cname=").append(cname);
        sb.append(", csex=").append(csex);
        sb.append(", cphone=").append(cphone);
        sb.append(", ccard=").append(ccard);
        sb.append(", rid=").append(rid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}