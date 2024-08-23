package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.About;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
       adapters = {About.class, ComponentExporter.class},
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = AboutImpl.RESOURCE_TYPE
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class AboutImpl implements About {

    static final String RESOURCE_TYPE ="spa-react/components/content/about";
    @ValueMapValue(name ="about_img")
    private String aboutImg;
    @ValueMapValue(name = "main_heading")
    private String mainHeading;
    @ValueMapValue(name = "sub_heading")
    private String subHeading;
    @ValueMapValue(name = "about_btn_title")
    private String aboutBtnTitle;
    @ValueMapValue(name = "about_btn_link")
    private String aboutBtnLink;
    @ValueMapValue(name = "about_text")
    private String aboutText;
    @Override
    public String getAboutImg() {
        return aboutImg;
    }

    @Override
    public String getMainHeading() {
        return mainHeading;
    }

    @Override
    public String getSubHeading() {
        return subHeading;
    }

    @Override
    public String getAboutBtnTitle() {
        return aboutBtnTitle;
    }

    @Override
    public String getAboutBtnLink() {
        return aboutBtnLink;
    }

    @Override
    public String getAboutText() {
        return aboutText;
    }

    @Override
    public String getExportedType() {
        return AboutImpl.RESOURCE_TYPE;
    }
}
