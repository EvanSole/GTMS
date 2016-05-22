package com.zzhw.gtms.dto;

import com.zzhw.gtms.po.order.IonicEntity;

public class IonicDto extends IonicEntity {

    private String title;

    private String faceImage;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getFaceImage() {
        return faceImage;
    }

    @Override
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }
}
