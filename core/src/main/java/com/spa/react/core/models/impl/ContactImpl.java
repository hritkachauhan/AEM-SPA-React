package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Contact;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {Contact.class, ComponentExporter.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = ContactImpl.RESOURCE_TYPE
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ContactImpl implements Contact {
    static final String RESOURCE_TYPE="spa-react/components/content/contact";
    @ValueMapValue(name = "contact_img")
    private String contactImg;
    @ValueMapValue(name = "contact_heading")
    private String contactHeading;
    @ValueMapValue(name = "contact_btn_title")
    private String contactBtnTitle;
    @ValueMapValue(name = "contact_btn_link")
    private String contactBtnLink;


    @Override
    public String getContactImg() {
        return contactImg;
    }

    @Override
    public String getContactHeading() {
        return contactHeading;
    }

    @Override
    public String getContactBtnTitle() {
        return contactBtnTitle;
    }

    @Override
    public String getContactBtnLink() {
        return contactBtnLink;
    }
    @Override
    public String getExportedType() {
        return ContactImpl.RESOURCE_TYPE;
    }

}
