import React from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';
require('./Course.css')
export const CustomEditConfig = {
       emptyLabel: 'Course',
       isEmpty: function(props) {
         return !props || !props.courseTitle;
       }
};

export default function Course(props){
     // Default to an empty array if props.link is undefined or not an array
     const courseItems = Array.isArray(props.course) ? props.course : [];

    if (CustomEditConfig.isEmpty(props)) {
        return <div><h1>Hello</h1></div>;
    }
      return (
             <section className="course">
                 <h1>{props.courseTitle}</h1>
                 <p>{props.courseDescription}</p>

                 <div className="row">
                     {courseItems.map((item, index) => (
                         <div className="campus-col" key={index}>
                             <img src={item.courseImg} alt={`Course Item ${index}`} /> {/* Updated to use 'courseImg' */}
                             <div className="layer">
                                 <h3>{item.courseText}</h3> {/* Updated to use 'courseText' */}
                             </div>
                         </div>
                     ))}
                 </div>
             </section>
         );
};



MapTo('spa-react/components/content/course')(Course,CustomEditConfig);