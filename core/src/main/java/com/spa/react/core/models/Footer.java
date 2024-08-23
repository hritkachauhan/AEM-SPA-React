package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.FooterPojo;
import com.spa.react.core.models.pojo.FooterSocialIconsPojo;

import java.util.List;
public interface Footer extends ComponentExporter {
    String getFooterHeading();
    String getInfodales();
    String getInfodalesLink();
    List<FooterPojo> getFooterLink();
    String getIconImg1();
    String getIconImg2();
}
