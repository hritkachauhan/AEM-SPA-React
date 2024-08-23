import React from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';
require('./Contact.css')
export const CustomEditConfig = {
       emptyLabel: 'Contact Details',
       isEmpty: function(props) {
          return !props || !props.contactHeading;
       }
};

export default function Contact(props){
    if (CustomEditConfig.isEmpty(props)) {
        return null;
    }
    return (
    <section className="cta" style={{
                             backgroundImage: `linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url(${props.contactImg})`,


                              }}
    >
    		<h1>{props.contactHeading}</h1>
    		<a href={props.contactBtnLink+".html"} className="hero-btn">{props.contactBtnTitle}</a>
    	</section>
    );
};


MapTo('spa-react/components/content/contact')(Contact,CustomEditConfig);