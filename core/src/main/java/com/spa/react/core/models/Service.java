package com.spa.react.core.models;
import com.adobe.cq.export.json.ComponentExporter;
import com.spa.react.core.models.pojo.ServicePojo;
import java.util.List;

public interface Service extends ComponentExporter {
    String getServiceTitle();
    String getServiceDescription();
    List<ServicePojo> getService();
}
