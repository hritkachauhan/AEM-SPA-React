package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.ExpertisePojo;

import java.util.List;

public interface Expertise extends ComponentExporter {
    String getExpertiseTitle();
    String getExpertiseDescription();
    List<ExpertisePojo> getExpertise();
}
