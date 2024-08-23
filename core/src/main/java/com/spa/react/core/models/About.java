package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface About extends ComponentExporter {
    String getAboutImg();
    String getMainHeading();
    String getSubHeading();
    String getAboutBtnTitle();
    String getAboutBtnLink();
    String getAboutText();
}
