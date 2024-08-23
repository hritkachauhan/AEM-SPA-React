package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.HeaderPojo;

import java.util.List;

public interface Header extends ComponentExporter {
    public String getLogo();
    public List<HeaderPojo> getLink();
}
