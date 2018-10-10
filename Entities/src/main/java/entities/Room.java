package entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class Room implements Serializable {
    /**
     * 房间编号
     */
    private Integer rid;

    /**
     * 房间名称
     */
    private String rname;

    /**
     * 床数
     */
    private Byte rbednumber;

    /**
     * 房价
     */
    private BigDecimal rprice;

    private Integer tid;

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Byte getRbednumber() {
        return rbednumber;
    }

    public void setRbednumber(Byte rbednumber) {
        this.rbednumber = rbednumber;
    }

    public BigDecimal getRprice() {
        return rprice;
    }

    public void setRprice(BigDecimal rprice) {
        this.rprice = rprice;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
        Room other = (Room) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getRname() == null ? other.getRname() == null : this.getRname().equals(other.getRname()))
            && (this.getRbednumber() == null ? other.getRbednumber() == null : this.getRbednumber().equals(other.getRbednumber()))
            && (this.getRprice() == null ? other.getRprice() == null : this.getRprice().equals(other.getRprice()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRname() == null) ? 0 : getRname().hashCode());
        result = prime * result + ((getRbednumber() == null) ? 0 : getRbednumber().hashCode());
        result = prime * result + ((getRprice() == null) ? 0 : getRprice().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rname=").append(rname);
        sb.append(", rbednumber=").append(rbednumber);
        sb.append(", rprice=").append(rprice);
        sb.append(", tid=").append(tid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}