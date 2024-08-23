import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
require('./Facility.css')
export const CustomEditConfig = {
    emptyLabel: 'Facilities',
    isEmpty: function(props) {
        return !props || !props.facilitiesTitle;
    }
};

export default function Facility(props) {


    if (CustomEditConfig.isEmpty(props)) {
        return null;
    }

    const facilityItems = Array.isArray(props.facilities) ? props.facilities : [];

    return (

       <section class="facilities">
       	    <h1>{props.facilitiesTitle}</h1>

            <div class="row">
                {
                  facilityItems.map((item, index) => (
                        <div class="facilities-col" key={index}>
                                <img src={item.facilityImg} alt="AEM sites"/>
                                <h3>{item.facilityText}</h3>
                                <p>{item.facilityDescription}</p>
                        </div>
                    ))
                   }
            </div>
       </section>
    );
}

MapTo('spa-react/components/content/facilities')(Facility, CustomEditConfig);
