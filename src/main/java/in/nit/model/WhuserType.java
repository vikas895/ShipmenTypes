package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WHUSERTYPE")
public class WhuserType 
{
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer uid;

	@Column(name="type")
	private String utype;

	@Column(name="code")
	private String ucode;

	@Column(name="for")
	private String ufor;

	@Column(name="email")
	private String uemail;

	@Column(name="contact")
	private String ucontact;

	@Column(name="Idtype")
	private String uidtype;

	public WhuserType(Integer id) {
		super();
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getUcode() {
		return ucode;
	}

	public void setUcode(String ucode) {
		this.ucode = ucode;
	}

	public String getUfor() {
		return ufor;
	}

	public void setUfor(String ufor) {
		this.ufor = ufor;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUcontact() {
		return ucontact;
	}

	public void setUcontact(String ucontact) {
		this.ucontact = ucontact;
	}

	public String getUidtype() {
		return uidtype;
	}

	public void setUidtype(String uidtype) {
		this.uidtype = uidtype;
	}

	@Override
	public String toString() {
		return "WhuserType [uid=" + uid + ", utype=" + utype + ", ucode=" + ucode + ", ufor=" + ufor + ", uemail="
				+ uemail + ", ucontact=" + ucontact + ", uidtype=" + uidtype + "]";
	}


}
