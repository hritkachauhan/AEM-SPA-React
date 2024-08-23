package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Vision;
import com.spa.react.core.models.pojo.VisionPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
       adapters = {Vision.class, ComponentExporter.class},
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
       resourceType = VisionImpl.RESOURCE_TYPE
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class VisionImpl implements Vision {
    static final String RESOURCE_TYPE="spa-react/components/content/vision";
    @ChildResource
    private List<VisionPojo> vision;
    @Override
    public List<VisionPojo> getVision() {
        return vision;
    }

    @Override
    public String getExportedType() {
        return VisionImpl.RESOURCE_TYPE;
    }
}
