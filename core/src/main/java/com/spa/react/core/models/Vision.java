package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.VisionPojo;

import java.util.List;

public interface Vision extends ComponentExporter {
    List<VisionPojo> getVision();
}
