package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Banner;
import com.spa.react.core.models.pojo.HeaderPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,
       adapters = {Banner.class, ComponentExporter.class},
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = BannerImpl.RESOURCE_TYPE)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)

public class BannerImpl implements Banner {
    static final String RESOURCE_TYPE ="spa-react/components/content/baner";
    @ValueMapValue(name = "banner_img")
    private String bannerImg;
    @ValueMapValue(name = "banner_img2")
    private String bannerImg2;
    @ValueMapValue(name = "title")
    private String title;
    @ValueMapValue(name = "btn_title")
    private String btnTitle;
    @ValueMapValue(name = "btn_link")
    private String btnLink;
    @ValueMapValue(name = "text")
    private String bannerText;
   @ValueMapValue
   private String logo;
   @ChildResource
   List<HeaderPojo> link;
    @Override
    public String getBannerImg() {
        return bannerImg;
    }

    @Override
    public String getBannerImg2() {
        return bannerImg2;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBtnTitle() {
        return btnTitle;
    }

    @Override
    public String getBtnLink() {
        return btnLink;
    }

    @Override
    public String getBannerText() {
        return bannerText;
    }

    @Override
    public String getHeaderLogo() {
        return logo;
    }

    @Override
    public List<HeaderPojo> getLink() {
        return link;
    }

    @Override
    public String getExportedType() {
        return BannerImpl.RESOURCE_TYPE;
    }
}
