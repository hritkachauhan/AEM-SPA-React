package com.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface Contact extends ComponentExporter {
    String getContactImg();
      String getContactHeading();
      String getContactBtnTitle();
      String getContactBtnLink();

}
