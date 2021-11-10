package net.ets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class MyEtsBanner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bannerId;
	private String imgLink;
	private String segment;
	private String shortCode;
	private String screenId;
	private String minAppVersion;
	private String minType;   // normal or gif
	
	@Lob
	private byte[] bannerImgAr;
	
	@Lob
	private byte[] bannerImgEn;
	public int getBannerId() {
		return bannerId;
	}
	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getScreenId() {
		return screenId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public String getMinAppVersion() {
		return minAppVersion;
	}
	public void setMinAppVersion(String minAppVersion) {
		this.minAppVersion = minAppVersion;
	}
	public String getMinType() {
		return minType;
	}
	public void setMinType(String minType) {
		this.minType = minType;
	}
	public byte[] getBannerImgAr() {
		return bannerImgAr;
	}
	public void setBannerImgAr(byte[] bannerImgAr) {
		this.bannerImgAr = bannerImgAr;
	}
	public byte[] getBannerImgEn() {
		return bannerImgEn;
	}
	public void setBannerImgEn(byte[] bannerImgEn) {
		this.bannerImgEn = bannerImgEn;
	}
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	
	
	
	
	
	
	
	
}
