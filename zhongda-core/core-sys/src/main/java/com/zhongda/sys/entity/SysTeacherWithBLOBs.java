package com.zhongda.sys.entity;

public class SysTeacherWithBLOBs extends SysTeacher {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String intro;

    private String sysclassids;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getSysclassids() {
        return sysclassids;
    }

    public void setSysclassids(String sysclassids) {
        this.sysclassids = sysclassids;
    }
}