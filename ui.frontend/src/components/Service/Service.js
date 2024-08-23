import React from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';
require('./Service.css');
export const CustomEditConfig = {
       emptyLabel: 'Service',
       isEmpty: function(props) {
         return !props || !props.serviceTitle;
       }
};

export default function Service(props){
     // Default to an empty array if props.link is undefined or not an array
     const serviceItems = Array.isArray(props.service) ? props.service : [];

    if (CustomEditConfig.isEmpty(props)) {
        return <div><h1>Hello</h1></div>;
    }
      return (

             <section className="course">
                 <h1>{props.serviceTitle}</h1>
                 <p>{props.serviceDescription}</p>

                 <div className="row">
                     {serviceItems.map((item, index) => (
                         <div className="course-col" key={index}>
                            <h3>{item.serviceHeading}</h3>
                            <p>{item.serviceText}</p>
                         </div>
                     ))}
                 </div>
             </section>
         );
};



MapTo('spa-react/components/content/services')(Service,CustomEditConfig);