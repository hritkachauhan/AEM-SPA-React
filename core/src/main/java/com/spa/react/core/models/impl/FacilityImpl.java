package com.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.spa.react.core.models.Facilities;
import com.spa.react.core.models.pojo.FacilitiesPojo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;
@Model(adaptables = SlingHttpServletRequest.class,
       adapters = {Facilities.class, ComponentExporter.class},
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = FacilityImpl.RESOURCE_TYPE
)
@Exporter(name= ExporterConstants.SLING_MODEL_EXPORTER_NAME,extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class FacilityImpl implements Facilities {
    static final String RESOURCE_TYPE="spa-react/components/content/facilities";
    @ValueMapValue(name = "facilities_title")
    private String facilityTitle;
    @ChildResource(name = "facilities")
    private List<FacilitiesPojo> facility;

    @Override
    public String getFacilitiesTitle() {
        return facilityTitle;
    }

    @Override
    public List<FacilitiesPojo> getFacilities() {
        return facility;
    }

    @Override
    public String getExportedType() {
        return FacilityImpl.RESOURCE_TYPE;
    }
}
