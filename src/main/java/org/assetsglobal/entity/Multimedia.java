//package org.assetsglobal.entity;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.MongoId;
//
//@Document(collection = "multimedia")
//public class Multimedia {
//
//	@MongoId
//	private String mediaId;
//
//	private int developerId;
//
//	private byte[] mediaBytes;
//
//	private String contentType;
//
//	public String getMediaId() {
//		return mediaId;
//	}
//
//	public void setMediaId(String mediaId) {
//		this.mediaId = mediaId;
//	}
//
//	public int getDeveloperId() {
//		return developerId;
//	}
//
//	public void setDeveloperId(int developerId) {
//		this.developerId = developerId;
//	}
//
//	public byte[] getMediaBytes() {
//		return mediaBytes;
//	}
//
//	public void setMediaBytes(byte[] mediaBytes) {
//		this.mediaBytes = mediaBytes;
//	}
//
//	public String getContentType() {
//		return contentType;
//	}
//
//	public void setContentType(String contentType) {
//		this.contentType = contentType;
//	}
//
//	public Multimedia(String mediaId, int developerId, byte[] mediaBytes, String contentType) {
//		super();
//		this.mediaId = mediaId;
//		this.developerId = developerId;
//		this.mediaBytes = mediaBytes;
//		this.contentType = contentType;
//	}
//
//	public Multimedia() {
//		// TODO Auto-generated constructor stub
//	}
//
//}
