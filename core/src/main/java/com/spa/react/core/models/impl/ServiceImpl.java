package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Service;
import com.spa.react.core.models.pojo.ServicePojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {Service.class, ComponentExporter.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = ServiceImpl.RESOURCE_TYPE
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)

public class ServiceImpl implements Service {
    static final String RESOURCE_TYPE="spa-react/components/content/services";
    @ValueMapValue(name = "service_title")
    private String serviceTitle;
    @ValueMapValue(name = "service_description")
    private String serviceDescription;
    @ChildResource
    private List<ServicePojo> service;

    @Override
    public String getServiceTitle() {
        return serviceTitle;
    }

    @Override
    public String getServiceDescription() {
        return serviceDescription;
    }

    @Override
    public List<ServicePojo> getService() {
        return service;
    }

    @Override
    public String getExportedType() {
        return ServiceImpl.RESOURCE_TYPE;
    }
}
