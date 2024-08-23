package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.FacilitiesPojo;

import java.util.List;

public interface Facilities extends ComponentExporter {
    String getFacilitiesTitle();
    List<FacilitiesPojo> getFacilities();
}
