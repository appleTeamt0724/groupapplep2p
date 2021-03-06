package com.bdqn.t0724.model;

public class UserInfo {
    private Long id;

    private Integer version;

    private Long bitstate;

    private String realname;

    private Integer score;

    private Long realauthid;

    private String idnumber;

    private String phonenumber;

    private Long incomegradeId;

    private Long marriageId;

    private Long kidcountId;

    private Long educationbackgroundId;

    private Long houseconditionId;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getBitstate() {
        return bitstate;
    }

    public void setBitstate(Long bitstate) {
        this.bitstate = bitstate;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getRealauthid() {
        return realauthid;
    }

    public void setRealauthid(Long realauthid) {
        this.realauthid = realauthid;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Long getIncomegradeId() {
        return incomegradeId;
    }

    public void setIncomegradeId(Long incomegradeId) {
        this.incomegradeId = incomegradeId;
    }

    public Long getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Long marriageId) {
        this.marriageId = marriageId;
    }

    public Long getKidcountId() {
        return kidcountId;
    }

    public void setKidcountId(Long kidcountId) {
        this.kidcountId = kidcountId;
    }

    public Long getEducationbackgroundId() {
        return educationbackgroundId;
    }

    public void setEducationbackgroundId(Long educationbackgroundId) {
        this.educationbackgroundId = educationbackgroundId;
    }

    public Long getHouseconditionId() {
        return houseconditionId;
    }

    public void setHouseconditionId(Long houseconditionId) {
        this.houseconditionId = houseconditionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}