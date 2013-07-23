package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the VideoData.
 *
 * @author Lou Kratz
 * @version 1.0
 */
public class VideoData {
	@SerializedName("height")
	private int videoHeight;

	@SerializedName("url")
	private String videoUrl;

	@SerializedName("width")
	private int videoWidth;

	/**
	 * @return the videoUrl
	 */
	public String getVideoUrl() {
		return videoUrl;
	}

	/**
	 * @param videoUrl the videoUrl to set
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	/**
	 * @return the videoWidth
	 */
	public int getVideoWidth() {
		return videoWidth;
	}

	/**
	 * @param videoWidth the videoWidth to set
	 */
	public void setVideoWidth(int videoWidth) {
		this.videoWidth = videoWidth;
	}

	/**
	 * @return the videoHeight
	 */
	public int getVideoHeight() {
		return videoHeight;
	}

	/**
	 * @param videoHeight the videoHeight to set
	 */
	public void setVideoHeight(int videoHeight) {
		this.videoHeight = videoHeight;
	}

    @Override
    public String toString() {
        return String.format("VideoData [videoHeight=%s, videoUrl=%s, videoWidth=%s]",
                videoHeight, videoUrl, videoWidth);
    }
}
