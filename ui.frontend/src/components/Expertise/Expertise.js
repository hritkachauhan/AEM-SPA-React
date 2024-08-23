import React from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';
require('./Expertise.css')
export const CustomEditConfig = {
       emptyLabel: 'Expertise',
       isEmpty: function(props) {
         return !props || !props.expertiseTitle;
       }
};

export default function Expertise(props){
     // Default to an empty array if props.link is undefined or not an array
     const ExpertiseItems = Array.isArray(props.expertise) ? props.expertise : [];

    if (CustomEditConfig.isEmpty(props)) {
        return <div><h1>Hello</h1></div>;
    }
     return (
         <section
             className="expertise"
             style={{ backgroundColor: "#f7f9fa", marginTop: "0px", paddingTop: "20px" }}
         >
             <div className="row expertise-row">
                 <div className="container">
                     <h1 style={{ color: "black", textAlign: "center" }}>
                         {props.expertiseTitle}
                     </h1>
                     <p style={{ color: "black", textAlign: "center" }}>
                         <strong>{props.expertiseDescription}</strong>
                     </p>
                 </div>
             </div>
             <div className="row" style={{ marginTop: "20px" }}>
                 {ExpertiseItems.map((item, index) => (
                     <div
                         className="course-col"
                         style={{
                             background: "#f7f9fa",
                             borderRadius: "unset",
                             borderLeft: "2px solid black",
                             padding: "0px 12px",
                         }}
                         key={index}
                     >
                         <p>{item.expertiseText}</p>
                     </div>
                 ))}
             </div>
         </section>
     );
};



MapTo('spa-react/components/content/expertise')(Expertise,CustomEditConfig);