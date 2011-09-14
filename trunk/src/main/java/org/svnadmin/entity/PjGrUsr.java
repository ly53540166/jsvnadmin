package org.svnadmin.entity;

/**
 * 项目组用户
 * 
 * @author Harvey
 * 
 */
public class PjGrUsr {
	/**
	 * 项目
	 */
	private String pj;
	/**
	 * 用户
	 */
	private String usr;
	/**
	 * 组
	 */
	private String gr;

	/**
	 * @return 项目
	 */
	public String getPj() {
		return pj;
	}

	/**
	 * @param pj
	 *            项目
	 */
	public void setPj(String pj) {
		this.pj = pj;
	}

	/**
	 * @return 用户
	 */
	public String getUsr() {
		return usr;
	}

	/**
	 * @param usr
	 *            用户
	 */
	public void setUsr(String usr) {
		this.usr = usr;
	}

	/**
	 * @return 组
	 */
	public String getGr() {
		return gr;
	}

	/**
	 * @param gr
	 *            组
	 */
	public void setGr(String gr) {
		this.gr = gr;
	}

}
