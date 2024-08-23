package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Header;
import com.spa.react.core.models.pojo.HeaderPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,
       adapters = {Header.class, ComponentExporter.class},
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
       resourceType = HeaderImpl.RESOURCE_TYPE)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class HeaderImpl implements Header {

    static final String RESOURCE_TYPE ="spa-react/components/content/header";

    @ValueMapValue
    private String logo;
    @ChildResource
    private List<HeaderPojo> link;
    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public List<HeaderPojo> getLink() {
        return link;
    }

    @Override
    public String getExportedType() {
        return HeaderImpl.RESOURCE_TYPE;
    }

    @PostConstruct
    protected void init() {
        // Debugging output
        System.out.println("Logo: " + logo);
        if (link != null) {
            for (HeaderPojo pojo : link) {
                System.out.println("Link Name: " + pojo.getName());
                System.out.println("Link URL: " + pojo.getUrl());
            }
        } else {
            System.out.println("Link is null");
        }
    }
}
