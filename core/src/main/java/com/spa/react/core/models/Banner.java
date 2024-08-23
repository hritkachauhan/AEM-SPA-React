package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.HeaderPojo;

import java.util.List;

public interface Banner extends ComponentExporter{
    String getBannerImg();
    String getBannerImg2();
    String getTitle();
    String getBtnTitle();
    String getBtnLink();
    String getBannerText();
    String getHeaderLogo();
    List<HeaderPojo> getLink();
}
