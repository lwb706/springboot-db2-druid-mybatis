package com.hxxzt.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 手机新闻管理实体类
 * @author lvwenbo
 * @since 2019-06-06
 *
 */
@Alias(value = "MobileNews")
public class MobileNews implements Serializable {
	private static final long serialVersionUID = 1L;
	/**流水号*/
	private long serialNo;
	/**类型*/
	private int type ;
	/**标题*/
	private String title;
	/**轮播图图片名称*/
	private String carouselName ;
	/**缩略图图片名称*/
	private String thumbnailName ;
	/**新闻详情文件名称*/
	private String details;
	/**目录名称*/
	private String fileName ;
	/**上传时间*/
	private String dateTime ;
	/**状态（0：不发布 1：发布  2：删除）*/
	private int status;
	/**状态为发布*/
	public static final int STATUS_YES = 1;
	/**状态为不发布*/
	public static final int STATUS_NO = 0;
	/**发布时间*/
	private String statusTime;
	
	public long getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCarouselName() {
		return carouselName;
	}
	public void setCarouselName(String carouselName) {
		this.carouselName = carouselName;
	}
	public String getThumbnailName() {
		return thumbnailName;
	}
	public void setThumbnailName(String thumbnailName) {
		this.thumbnailName = thumbnailName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getStatusTime() {
		return statusTime;
	}
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}
	@Override
	public String toString() {
		return "MobileNews [serialNo=" + serialNo + ", type=" + type
				+ ", title=" + title + ", carouselName=" + carouselName
				+ ", thumbnailName=" + thumbnailName + ", details=" + details
				+ ", fileName=" + fileName + ", dateTime=" + dateTime
				+ ", status=" + status + ", statusTime=" + statusTime + "]";
	}
}
